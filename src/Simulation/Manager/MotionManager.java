package Simulation.Manager;

import Simulation.Flying.Plane.*;
import Simulation.Flying.*;

import java.util.ArrayList;

public class MotionManager
{
    public static void moveFlyingObjects(ArrayList<RedPlane> redTeam, ArrayList<BluePlane> blueTeam,
                                         ArrayList<Bullet> bullets, ArrayList<Cloud> clouds)
    {
        for (RedPlane plane: redTeam)
        {
            plane.move();
        }

        for (BluePlane plane: blueTeam)
        {
            plane.move();
        }

        for (Bullet bullet: bullets)
        {
            bullet.move();
        }

        for (Cloud cloud: clouds)
        {
            cloud.move();
        }
    }
}
