import java.util.Scanner;

class Rectangle {
    private double length, width;

    // Default constructor with length and width set to 1
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Parameterized constructor to initialize given values
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class
public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Rectangle rect1 = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.printf("Area: %.2f\n", rect1.calculateArea());
        System.out.printf("Perimeter: %.2f\n", rect1.calculatePerimeter());

        // Taking user input for length and width
        System.out.print("\nEnter length of the rectangle: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();

        // Using parameterized constructor
        Rectangle rect2 = new Rectangle(length, width);
        System.out.println("\nRectangle with user-defined values:");
        System.out.printf("Area: %.2f\n", rect2.calculateArea());
        System.out.printf("Perimeter: %.2f\n", rect2.calculatePerimeter());

        sc.close();
    }
}
