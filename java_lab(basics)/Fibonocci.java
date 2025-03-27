import java.util.Scanner;

public class Fibonocci {
    
    public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("### Fibonacci Series Generator ###");
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        long first = 0, second = 1;
        System.out.println("Fibonacci Series:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
    }
}

    

