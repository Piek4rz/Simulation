package Simulation.motion;

public class Coordinate
{
    private int x;
    private int y;

    public Coordinate(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void changeCoordinate(Direction direction)
    {
        switch(direction)
        {
            case right -> { this.x += 1; }
            case left -> { this.x -= 1; }
            case down -> { this.y -= 1; }
            case up -> { this.y += 1; }
            case rightUp -> { this.x += 1; this.y += 1; }
            case rightDown -> { this.x += 1; this.y -= 1; }
            case leftDown -> { this.x -= 1; this.y -= 1; }
            case leftUp -> { this.x -= 1; this.y += 1; }
        }
    }
}
