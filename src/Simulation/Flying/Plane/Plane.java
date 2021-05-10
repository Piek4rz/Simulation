package Simulation.Flying.Plane;

import Simulation.Flying.Bullet;
import Simulation.Flying.FlyingObject;
import Simulation.motion.*;

import java.util.ArrayList;

public abstract class Plane extends FlyingObject
{
    private boolean isReloaded;
    private boolean isVisible;

    public Plane(Coordinate position, Direction front)
    {
        this.position = position;
        this.front = front;
        this.isReloaded = true;
        this.isVisible = true;
    }

    public Direction getFront()
    {
        return this.front;
    }

    public boolean getVisibility()
    {
        return this.isVisible;
    }

    public void changeVisibilityStatus(boolean isVisible)
    {
        this.isVisible = isVisible;
    }

    public void destroy()
    {

    }

    public void shoot(ArrayList<Bullet> bullets)
    {
        if (!this.isReloaded) {return;}
        bullets.add(new Bullet(this));
        this.isReloaded = false;
    }

    public void loadAmmunition()
    {
        this.isReloaded = true;
    }


    public Direction scan() //TODO scanning area 1/10 around plane, avoid collisions, avoid walls; planes should follow middle of map
    {
        return null;
    }

}
