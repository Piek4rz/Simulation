package Simulation.Manager;

import Simulation.motion.Direction;

import java.util.Random;

public class DirectionManager
{
    public static Direction randDirection()
    {
        {
            Random random = new Random();

            switch(random.nextInt() % 8)
            {
                case 0 -> {return Direction.UP;}
                case 1 -> {return  Direction.RIGHT_UP;}
                case 2 -> {return  Direction.RIGHT;}
                case 3 -> {return Direction.RIGHT_DOWN;}
                case 4 -> {return Direction.DOWN;}
                case 5 -> {return Direction.LEFT_DOWN;}
                case 6 -> {return Direction.LEFT;}
                case 7 -> {return Direction.LEFT_UP;}
            }
        }
        return Direction.ERROR;
    }
}
