public class Coordinates
{
    private int x;
    private int y;

    Coordinates(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void changePosition(int x, int y)
    {
        this.x += x;
        this.y += y;
    }

}
