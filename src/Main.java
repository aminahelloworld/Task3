
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, delta, x1, x2;
        int roots;

        System.out.print("Enter a, b and c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if (a == 0) {
            System.out.println("Error: a cannot be zero.");
            input.close();
            return;
        }

        delta = b * b - 4 * a * c;

        if (delta > 0) {
            roots = 2;
        } else if (delta == 0) {
            roots = 1;
        } else {
            roots = 0;
        }

        System.out.printf("a = %.2f%n", a);
        System.out.printf("b = %.2f%n", b);
        System.out.printf("c = %.2f%n", c);

        switch (roots) {
            case 2:
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("x1 = %.2f%n", x1);
                System.out.printf("x2 = %.2f%n", x2);
                break;

            case 1:
                x1 = -b / (2 * a);

                System.out.printf("x1 = %.2f%n", x1);
                break;

            case 0:
                System.out.println("No real roots.");
                break;
        }

        input.close();
    }
}