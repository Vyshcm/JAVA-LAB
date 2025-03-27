import java.util.Scanner;

public class GradeDisplay {
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mark in  percentage: ");
        int percentage = scanner.nextInt();
        
        String grade;
        switch (percentage / 10) {
            case 10, 9:
                grade = "A - Excellent work!";
                break;
            case 8:
                grade = "B - Good job!";
                break;
            case 7:
                grade = "C - You can do better";
                break;
            case 6:
                grade = "D - Work harder";
                break;
            default:
                grade = "F - Failed. Try again";
        }
        
        System.out.println(grade);
    }
}

