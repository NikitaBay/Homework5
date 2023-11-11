package lottery;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int[] numberBalls = new int[100];
        Random random = new Random();

        for(int i = 0; i < 100; i++) {
            numberBalls[i] = random.nextInt(100);
        }
        int[] selectedNumberBalls = Arrays.copyOf(numberBalls, 10);
        System.out.println("Шары под номером " + Arrays.toString(selectedNumberBalls));
    }
}
