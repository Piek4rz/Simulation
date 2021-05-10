package Simulation.Flying;

import Simulation.motion.*;

public abstract class FlyingObject implements Simulation.Flying.Flying
{
    protected Coordinate position;
    protected Direction front;


    @Override
    public void move()
    {

    }

    public Coordinate getPosition()
    {
        return this.position;
    }
    public Direction getFront()
    {
        return front;
    }

}
