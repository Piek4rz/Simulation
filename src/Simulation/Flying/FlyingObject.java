package Simulation.Flying;

import Simulation.motion.*;

public abstract class FlyingObject implements Simulation.Flying.Flying
{
    protected Coordinate position;
    protected Direction front;


    @Override
    public void move()
    {
        this.position.changeCoordinate(this.front);
    }

    public Coordinate getPosition()
    {
        return this.position;
    }
    public Direction getFront()
    {
        return this.front;
    }

}
