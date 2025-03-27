import java.util.Scanner;

public class ArmstrongCheck {
   
    public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("### Armstrong Number Checker ###");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int temp = num, sum = 0, digits = String.valueOf(num).length();
        
        System.out.println("Number of digits: " + digits);
        System.out.println("Processing each digit:");
        
        while (temp > 0) {
            int digit = temp % 10;
            System.out.println("Digit: " + digit + " ^ " + digits + " = " + Math.pow(digit, digits));
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        System.out.println("Computed sum of digits' powers: " + sum);
        if (num == sum) {
            System.out.println(num + " is an Armstrong Number!");
        } else {
            System.out.println(num + " is NOT an Armstrong Number.");
        } 
    }
} 

