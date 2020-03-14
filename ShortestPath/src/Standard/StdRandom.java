package Standard;
import java.util.*;
public final class StdRandom {

    private static Random random;
    private static long seed;
    static {
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }
    private StdRandom() {
    }
    public static double uniform() {
        return random.nextDouble();
    }
    public static int uniform(int n) {
        if (n <= 0) throw new IllegalArgumentException("argument must be positive: " + n);
        return random.nextInt(n);
    }





}
