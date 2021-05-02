package Flying;
import java.util.Random;

public final class Cloud extends Flying
{
    Cloud()
    {
        Random rand = new Random();
        this.setWidth(rand.nextInt(3) + 1);
        this.setLength(rand.nextInt(3) + 1);
    }
}
