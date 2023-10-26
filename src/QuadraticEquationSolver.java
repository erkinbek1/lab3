import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero. Quadratic equation is not valid.");
        } else {
            System.out.print("Enter coefficient b: ");
            double b = scanner.nextDouble();

            System.out.print("Enter coefficient c: ");
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;

            double x1, x2;
            switch ((int) Math.signum(discriminant)) {
                case 1:
                    x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    System.out.printf("x1: %.2f, x2: %.2f\n", x1, x2);
                    break;
                case 0:
                    x1 = -b / (2 * a);
                    System.out.printf("x1: %.2f\n", x1);
                    break;
                case -1:
                    double realPart = -b / (2 * a);
                    double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                    System.out.printf("x1: %.2f + %.2fi, x2: %.2f - %.2fi\n", realPart, imaginaryPart, realPart, imaginaryPart);
                    break;
            }
        }

        scanner.close();
    }
}
