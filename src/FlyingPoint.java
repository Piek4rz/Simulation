public abstract class FlyingPoint
{
    private Coordinates position;
    private Directions front;


    public Coordinates getPosition()
    {
        return position;
    }

    public void setPosition(Coordinates position)
    {
        this.position = position;
    }

    public void move(Directions directions)
    {
        switch(directions)
        {
            case up -> position.changePosition(0, 1);
            case upRight -> position.changePosition(1, 1);
            case right -> position.changePosition(1, 0);
            case downRight -> position.changePosition(1, -1);
            case down -> position.changePosition(0, -1);
            case downLeft -> position.changePosition(-1, -1);
            case left -> position.changePosition(-1, 0);
            case upLeft -> position.changePosition(-1, 1);
        }
    }

    public void paint()
    {

    }


}
