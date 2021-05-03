public final class Statistics
{
    private static int teamRedAlive = 0;
    private static int teamRedKillsCount = 0;
    private static int teamGreenAlive = 0;
    private static int teamGreenKillsCount = 0;
    private static int countOfRounds = 0;

    public void addGreenPlane()
    {

    }
    public void addRedPlane()
    {

    }

    public void addRedKill()
    {

    }
    public void addGreenKill()
    {

    }

    public void setStatistics(int teamRed, int teamGreen)
    {
         teamRedAlive = teamRed;
         teamGreenAlive = teamGreen;
    }

    public int getTeamRedAlive()
    {
        return teamRedAlive;
    }
    public int getTeamGreenAlive()
    {
        return teamGreenAlive;
    }

    public void addRound()
    {

    }


}
