package Simulation.Flying;

import Simulation.Manager.DirectionManager;
import Simulation.motion.*;
import Simulation.Flying.Plane.Plane;


public final class Cloud extends FlyingObject
{
    private static final Direction windFront = DirectionManager.randDirection();

    public Cloud(Coordinate position)
    {
        this.position = position;
        this.front = this.windFront;
    }

    public void hide(Plane plane)
    {
        plane.changeVisibilityStatus(false);
    }


}
