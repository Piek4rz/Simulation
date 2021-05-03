

public final class Plane extends FlyingPoint
{
    private String team;

    Plane(Coordinates position, String team, String color)
    {
        this.setPosition(position);
        this.team = team;
    }

    public Directions findEnemy()
    {
        System.out.println("Szuka przeciwnika");
        return Directions.right;
    }

    public Bullet shoot()
    {
        Bullet bullet = new Bullet(this.getPosition());
        return bullet;
    }



}
