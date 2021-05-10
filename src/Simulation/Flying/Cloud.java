package Simulation.Flying;

import Simulation.motion.*;
import Simulation.Flying.Plane.Plane;


public final class Cloud extends FlyingObject
{
    static private final Direction front = DirectionManager.randDirection();

    public Cloud(Coordinate position)
    {
        this.position = position;
    }

    public void hide(Plane plane)
    {
        plane.changeVisibilityStatus(true);
    }

    public Direction getCloudsFront()
    {
        return this.front;
    }

}
