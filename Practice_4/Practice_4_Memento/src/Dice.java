import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    static int min = 1;
    static int max = 6;
    public static int roll() {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public static int rollStat(){
        int [] arr = new int [6];

        for( int i = 0 ; i < 6; i++){
            arr[i] = roll();
        }

        Arrays.sort(arr);

        return arr[3] + arr[4] + arr[5];
    }
}
