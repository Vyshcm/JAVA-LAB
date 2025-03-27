import java.util.Scanner;

class BankAccount {
    private String accountNumber, accountHolder;
    private double balance;
    
    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.printf("Balance: %.2f\n", balance);
    }
}

// Main class
public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Create BankAccount object with user input
        BankAccount account = new BankAccount(accNo, name, balance);
        
        System.out.print("Enter amount to deposit: ");
        account.deposit(sc.nextDouble());
        
        System.out.print("Enter amount to withdraw: ");
        account.withdraw(sc.nextDouble());
        
        account.displayAccountInfo();
        sc.close();
    }
}
