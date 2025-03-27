import java.util.Scanner;

class Student {
    // Fields
    int studentId;
    String name;
    double marks;

    // Constructor to initialize all fields
    Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Pass Status: " + (isPassed() ? "Passed" : "Failed"));
    }

    // Method to check pass status
    boolean isPassed() {
        return marks >= 40.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Create an array of Student objects
        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            // Create a new student object
            students[i] = new Student(id, name, marks);
        }

        // Display student details and check pass status
        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            students[i].displayDetails();
            System.out.println("----------------------");
        }

        sc.close();
    }
}
