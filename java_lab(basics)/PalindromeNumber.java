import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int reversed = 0, original = num, digit;

        while (num > 0) {
            digit = num % 10;  
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println(original == reversed ? "Palindrome" : "Not a palindrome");
    }
}

