package Simulation.Manager;

import Simulation.Flying.Bullet;
import Simulation.Flying.Flying;
import Simulation.Flying.FlyingObject;
import Simulation.Flying.Plane.*;
import Simulation.motion.Coordinate;

import java.util.ArrayList;

public class CollisionsManager
{
    private static ArrayList<Coordinate> findFieldsToClear(ArrayList<FlyingObject> flyingObjects)
    {
        ArrayList<Coordinate> fieldsToDestroy = new ArrayList<>();
        for (int i = 0; i < flyingObjects.size(); i++)
        {
            for (int j = i + 1; j < flyingObjects.size(); j++)
            {
                Coordinate coordinate1 = new Coordinate(flyingObjects.get(i).getPosition());
                Coordinate coordinate2 = new Coordinate(flyingObjects.get(j).getPosition());

                if (coordinate1.equals(coordinate2))
                {
                    fieldsToDestroy.add(coordinate1);
                }
            }
        }
        return fieldsToDestroy;

    }

    private static void destroyDuplicates(ArrayList<FlyingObject> flyingObjects, //TODO function deleting objects of chosen class
                                          ArrayList<FlyingObject> flyingObjectsToDestroy)
    {

    }

    public static void destroyCollapsedFlyingObjects(ArrayList<RedPlane> redTeam, ArrayList<BluePlane> blueTeam,
                                                     ArrayList<Bullet> bullets)
    {
        ArrayList<FlyingObject> flyingObjects = new ArrayList<>();
        flyingObjects.addAll(redTeam);
        flyingObjects.addAll(blueTeam);
        flyingObjects.addAll(bullets);

        ArrayList<Coordinate> fieldsToClear = CollisionsManager.findFieldsToClear(flyingObjects);

        for (int i = 0; i < redTeam.size(); i++)
        {
            for (int j = 0; j < fieldsToClear.size(); j++)
            {
                Coordinate coordinate = new Coordinate(redTeam.get(i).getPosition());

                if (coordinate.equals(fieldsToClear.get(j)))
                {
                    redTeam.remove(i);
                }
            }
        }

        for (int i = 0; i < blueTeam.size(); i++)
        {
            for (int j = 0; j < fieldsToClear.size(); j++)
            {
                Coordinate coordinate = new Coordinate(blueTeam.get(i).getPosition());

                if (coordinate.equals(fieldsToClear.get(j)))
                {
                    blueTeam.remove(i);
                }
            }
        }

        for (int i = 0; i < bullets.size(); i++)
        {
            for (int j = 0; j < fieldsToClear.size(); j++)
            {
                Coordinate coordinate = new Coordinate(bullets.get(i).getPosition());

                if (coordinate.equals(fieldsToClear.get(j)))
                {
                    bullets.remove(i);
                }
            }
        }

    }
}
