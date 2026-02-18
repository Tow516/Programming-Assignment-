// Program4_WhileLoop.java
import java.util.Scanner;

public class Program4_WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int counter = 1;
        System.out.print("Numbers from 1 to " + number + ": ");

        while (counter <= number) {
            System.out.print(counter);
            if (counter < number) {
                System.out.print(", ");
            }
            counter++;
        }
        System.out.println();

        scanner.close();
    }
}