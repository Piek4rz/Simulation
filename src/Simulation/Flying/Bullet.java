package Simulation.Flying;

import Simulation.Flying.Plane.*;
import Simulation.motion.Coordinate;
import Simulation.motion.Direction;

public final class Bullet extends FlyingObject
{
    private Plane owner;

    public Bullet(Plane owner)
    {
        this.position = new Coordinate(owner.getPosition());
        this.front = owner.getFront();
        this.owner = owner;
        this.position.changeCoordinate(this.front);
    }

    public Plane getOwner()
    {
        return this.owner;
    }



}
