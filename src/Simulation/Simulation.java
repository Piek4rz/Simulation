package Simulation;

import Simulation.Flying.Bullet;
import Simulation.Flying.Cloud;
import Simulation.Flying.FlyingObject;
import Simulation.Flying.Plane.*;
import Simulation.motion.*;
import java.util.ArrayList;
import java.util.List;
import Simulation.Manager.*;


public class Simulation
{

    public static void main(String[] args)
    {

        ArrayList<RedPlane> redPlanes = new ArrayList<>();
        ArrayList<BluePlane> bluePlanes = new ArrayList<>();
        ArrayList<Cloud> clouds = new ArrayList<>();
        ArrayList<Bullet> bullets = new ArrayList<>();

        redPlanes.add(new RedPlane(new Coordinate(5, 4), Direction.LEFT));

        bluePlanes.add(new BluePlane(new Coordinate(7, 6), Direction.RIGHT));

        //bullets.add(new Bullet(redPlanes.get(0)));

        //bullets.add(new Bullet(bluePlanes.get(0)));

        //clouds.add(new Cloud(new Coordinate(10, 4)));


    }
}
