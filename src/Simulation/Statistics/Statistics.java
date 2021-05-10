package Simulation.Statistics;

import Simulation.Simulation;

public final class Statistics
{
    private int kills;
    private int alive;

    public Statistics(int alive)
    {
        this.alive = alive;
        this.kills = 0;
    }

    public void addKill()
    {
        kills++;
    }

    public void addAlive()
    {
        alive++;
    }

    public void subAlive()
    {
        alive--; //TODO catch alive < 0
    }


}
