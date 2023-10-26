import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float firstNumberErkin = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float secondNumberErkin = scanner.nextFloat();

        float sum = firstNumberErkin + secondNumberErkin;
        float difference = firstNumberErkin - secondNumberErkin;
        float product = firstNumberErkin * secondNumberErkin;
        float quotient = firstNumberErkin / secondNumberErkin;

        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %.2f\n", product);
        System.out.printf("Quotient: %.2f\n", quotient);

        scanner.close();
    }
}
