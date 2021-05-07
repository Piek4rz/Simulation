package Simulation;

import Simulation.Flying.Plane.*;
import Simulation.motion.*;

public class Simulation
{
    public static void main(String[] args)
    {
        RedPlane plane = new RedPlane(new Coordinate(5, 4));
        plane.shoot();
        plane.move(Direction.right);
        plane.destroy();
    }
}
