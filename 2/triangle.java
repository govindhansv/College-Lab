import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the lengths of the three sides of the triangle:");

            System.out.print("Side 1: ");
            double side1 = scanner.nextDouble();

            System.out.print("Side 2: ");
            double side2 = scanner.nextDouble();

            System.out.print("Side 3: ");
            double side3 = scanner.nextDouble();

            if (isValidTriangle(side1, side2, side3)) {
                if (isEquilateral(side1, side2, side3)) {
                    System.out.println("It is an Equilateral Triangle.");
                } else if (isIsosceles(side1, side2, side3)) {
                    System.out.println("It is an Isosceles Triangle.");
                } else {
                    System.out.println("It is a Scalene Triangle.");
                }

                // Calculate and print the area of the triangle
                double area = calculateArea(side1, side2, side3);
                System.out.println("Area of the triangle: " + area);
            } else {
                System.out.println("Invalid triangle: The sum of any two sides must be greater than the third side.");
            }
        }
    }

    // Check if the sides can form a valid triangle
    private static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Check if the triangle is equilateral
    private static boolean isEquilateral(double a, double b, double c) {
        return a == b && b == c;
    }

    // Check if the triangle is isosceles
    private static boolean isIsosceles(double a, double b, double c) {
        return a == b || b == c || a == c;
    }

    // Calculate the area of the triangle using Heron's formula
    private static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
