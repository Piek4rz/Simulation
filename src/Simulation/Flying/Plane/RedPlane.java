package Simulation.Flying.Plane;

import Simulation.Flying.FlyingObject;
import Simulation.Statistics.Statistics;
import Simulation.motion.*;

public final class RedPlane extends Plane
{
    private static Statistics statistics = new Statistics(0);

    public RedPlane(Coordinate position, Direction front)
    {
        super(position, front);
        statistics.addAlive();
    }

    @Override
    public void destroy()
    {
        super.destroy();
        statistics.subAlive();
    }

    public static Statistics getStatistics()
    {
        return statistics;
    }

}
