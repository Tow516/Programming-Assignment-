// Program5_DoWhileLoop.java
import java.util.Scanner;

public class Program5_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Storing student number and password
        int correctStudentNumber = 123456; // Replace with your student number
        String correctPassword = "password123";

        int enteredStudentNumber;
        String enteredPassword;

        do {
            System.out.print("Enter student number: ");
            enteredStudentNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter password: ");
            enteredPassword = scanner.nextLine();

            if (enteredStudentNumber != correctStudentNumber ||
                    !enteredPassword.equals(correctPassword)) {
                System.out.println("Incorrect credentials. Try again.\n");
            }

        } while (enteredStudentNumber != correctStudentNumber ||
                !enteredPassword.equals(correctPassword));

        System.out.println("Access Granted!");

        scanner.close();
    }
}