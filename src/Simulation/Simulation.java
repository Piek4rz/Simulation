package Simulation;

import Simulation.Flying.Bullet;
import Simulation.Flying.FlyingObject;
import Simulation.Flying.Plane.*;
import Simulation.motion.*;
import Simulation.Manager.CollisionsManager;
import java.util.ArrayList;
import java.util.List;


//TODO change destroyCollapsedFlyingObjects to sub elements from every array instead of the main one

public class Simulation
{

    public static void main(String[] args)
    {

        ArrayList<RedPlane> redPlanes = new ArrayList<>();
        ArrayList<BluePlane> bluePlanes = new ArrayList<>();
        ArrayList<Bullet> bullets = new ArrayList<>();

        redPlanes.add(new RedPlane(new Coordinate(5, 4), Direction.LEFT));
        redPlanes.add(new RedPlane(new Coordinate(10, 15), Direction.LEFT));
        redPlanes.add(new RedPlane(new Coordinate(8, 6), Direction.LEFT));


        bluePlanes.add(new BluePlane(new Coordinate(5, 4), Direction.RIGHT));
        bluePlanes.add(new BluePlane(new Coordinate(6, 1), Direction.RIGHT));
        bluePlanes.add(new BluePlane(new Coordinate(7, 6), Direction.RIGHT));

        bullets.add(new Bullet(redPlanes.get(0))); // 4,4
        bullets.add(new Bullet(redPlanes.get(1))); // 9, 15
        bullets.add(new Bullet(redPlanes.get(2))); // 7, 6

        CollisionsManager.destroyCollapsedFlyingObjects(redPlanes, bluePlanes, bullets);

        ArrayList<FlyingObject> all = new ArrayList<>();

        all.addAll(redPlanes);
        all.addAll(bluePlanes);
        all.addAll(bullets);

        for (FlyingObject flyingObject: all)
        {
            System.out.println(flyingObject.getPosition().toString());
        }


    }
}
