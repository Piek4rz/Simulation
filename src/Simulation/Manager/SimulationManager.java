package Simulation.Manager;

import java.util.*;
import Simulation.Flying.*;
import Simulation.Flying.Plane.*;
import Simulation.motion.*;

public class SimulationManager
{
    private ArrayList<RedPlane> redTeam;
    private ArrayList<BluePlane> blueTeam;
    private ArrayList<Cloud> clouds;
    private ArrayList<Bullet> bullets = new ArrayList<>();
    private int mapWidth;
    private int mapHeight;

    public SimulationManager(int teamsAbundance, int mapWidth, int mapHeight) //TODO catch: planes count 2 times lower than map height
    {
        int cloudsCount = mapWidth * mapHeight / 10;
        Random random = new Random();

        this.mapHeight = mapHeight;
        this.mapWidth = mapWidth;

        for (int i = 0; i < teamsAbundance; i++)
        {
            this.redTeam.add(new RedPlane(new Coordinate(0, mapHeight - i * 2), Direction.RIGHT));
            this.blueTeam.add(new BluePlane(new Coordinate(mapWidth, i * 2), Direction.LEFT));
        }

        for (int i = 0; i < cloudsCount; i++)
        {
            this.clouds.add(new Cloud(new Coordinate(random.nextInt(mapWidth), random.nextInt(mapWidth))));
        }

        //TODO Sleep(1000)
    }

    public boolean round()
    {

        return !redTeam.isEmpty() && !blueTeam.isEmpty();
    }


}
