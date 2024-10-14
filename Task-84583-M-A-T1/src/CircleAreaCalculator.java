
import java.util.Scanner;

public class CircleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius;

        System.out.println("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        double area = calculateArea(radius);

        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }

    public static double calculateArea(double radius) {
        final double PI = 3.14;
        if (radius < 0) {
            return 0.0;
        }
        return PI * radius * radius;
    }
}
