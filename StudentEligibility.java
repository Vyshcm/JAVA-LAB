import java.util.Scanner;

public class StudentEligibility {
    public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks for Mathematics: ");
        int math = scanner.nextInt();
        
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();
        
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();
        
        int totalMarks = math + physics + chemistry;
        int mathPhysicsTotal = math + physics;
        
        String result = (totalMarks >= 200 || mathPhysicsTotal >= 150) ? "Eligible" : "Not Eligible";
        System.out.println("Student is " + result);
    }
}
