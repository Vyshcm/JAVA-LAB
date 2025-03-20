import java.util.Scanner;

public class EmployeeSalary {
   
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("### Employee Salary Calculation ###");
        
        System.out.print("Enter Designation (Manager/Developer/Intern): ");
        String designation = scanner.next();
        
        System.out.print("Enter Years of Experience: ");
        int experience = scanner.nextInt();
        
        int baseSalary;
        switch (designation.toLowerCase()) {
            case "manager":
                baseSalary = 50000;
                break;
            case "developer":
                baseSalary = 30000;
                break;
            case "intern":
                baseSalary = 15000;
                break;
            default:
                System.out.println("Invalid designation! Exiting...");
                return;
        }
        
        double bonus;
        if (experience >= 5) {
            bonus = 0.2;
        } else if (experience >= 3) {
            bonus = 0.1;
        } else {
            bonus = 0;
        }
        
        double totalSalary = baseSalary + (baseSalary * bonus);
        
        System.out.println("------------------------------------");
        System.out.println("Employee Salary Details");
        System.out.println("------------------------------------");
        System.out.println("Designation: " + designation);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Experience Bonus: " + (bonus * 100) + "%");
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("------------------------------------");
    }
} 

