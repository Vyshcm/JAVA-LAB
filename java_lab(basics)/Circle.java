import java.util.Scanner;
public class Circle {
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area: " + (Math.PI * r * r));
        System.out.println("Perimeter: " + (2 * Math.PI * r));
    }
}

