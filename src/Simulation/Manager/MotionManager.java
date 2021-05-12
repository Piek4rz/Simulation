package Simulation.Manager;

import Simulation.Flying.Plane.*;
import Simulation.Flying.*;

import java.util.ArrayList;

public class MotionManager
{
    public static void moveFlyingObjects(ArrayList<FlyingObject> flyingObjects)
    {
        for (FlyingObject flyingObject: flyingObjects)
        {
            flyingObject.move();
        }
    }
}
