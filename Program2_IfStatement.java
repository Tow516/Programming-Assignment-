// Program2_IfStatement.java
import java.util.Scanner;

public class Program2_IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height in feet (e.g., 5.5 for 5'6\"): ");
        double height = scanner.nextDouble();

        if (height >= 6.0) {
            System.out.println("Tall");
        } else if (height >= 5.58 && height < 6.0) { // 5'7" is approximately 5.58 feet
            System.out.println("Average");
        } else {
            System.out.println("Short");
        }

        scanner.close();
    }
}