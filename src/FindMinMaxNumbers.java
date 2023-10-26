import java.util.Random;

public class FindMinMaxNumbers {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int count = 0;

        while (count < 10) {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;

            if (randomNumber < min) {
                min = randomNumber;
            }
            if (randomNumber > max) {
                max = randomNumber;
            }

            count++;
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
