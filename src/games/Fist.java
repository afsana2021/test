package games;
import java.util.Random;
public class Fist {

    public static final int Rock = 0;
    public static final int paper = 1;
    public static final int scissors= 2;


    public int play(){
        Random random = new Random();
        return random.nextInt(3);
    }
}
