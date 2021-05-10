package Simulation.motion;

public final class Coordinate
{
    private int x;
    private int y;

    public Coordinate(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Coordinate(Coordinate coordinate)
    {
        this.x = coordinate.getX();
        this.y = coordinate.getY();
    }

    @Override
    public boolean equals(Object object)
    {
        if (object == null) { return false;}
        if (!(object instanceof Coordinate)) {return false;}

        Coordinate coordinate = (Coordinate) object;

        return coordinate.x == this.x && coordinate.y == this.y;
    }

    public void changeCoordinate(Direction direction)
    {
        switch(direction)
        {
            case RIGHT -> { this.x += 1; }
            case LEFT -> { this.x -= 1; }
            case DOWN -> { this.y -= 1; }
            case UP -> { this.y += 1; }
            case RIGHT_UP -> { this.x += 1; this.y += 1; }
            case RIGHT_DOWN -> { this.x += 1; this.y -= 1; }
            case LEFT_DOWN -> { this.x -= 1; this.y -= 1; }
            case LEFT_UP -> { this.x -= 1; this.y += 1; }
        }
    }

    @Override
    public String toString()
    {
        return this.x + "," + this.y;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }
}
