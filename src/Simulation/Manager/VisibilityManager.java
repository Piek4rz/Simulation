package Simulation.Manager;

import Simulation.Flying.Cloud;
import Simulation.Flying.Plane.*;
import Simulation.motion.Coordinate;

import java.util.ArrayList;

public class VisibilityManager
{
    public static void hidePlanes(ArrayList<RedPlane> redTeam, ArrayList<BluePlane> blueTeam,
                                  ArrayList<Cloud> clouds)
    {
        for (RedPlane plane: redTeam)
        {
            for (int i = 0; i < clouds.size(); i++)
            {
                Coordinate planeCoordinate= new Coordinate(plane.getPosition());
                Coordinate cloudCoordinate = new Coordinate(clouds.get(i).getPosition());

                if(planeCoordinate.equals(cloudCoordinate))
                {
                    clouds.get(i).hide(plane);
                }
            }
        }

        for (BluePlane plane: blueTeam)
        {
            for (int i = 0; i < clouds.size(); i++)
            {
                Coordinate planeCoordinate= new Coordinate(plane.getPosition());
                Coordinate cloudCoordinate = new Coordinate(clouds.get(i).getPosition());

                if(planeCoordinate.equals(cloudCoordinate))
                {
                    clouds.get(i).hide(plane);
                }
            }
        }
    }
}
