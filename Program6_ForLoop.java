// Program6_ForLoop.java
import java.util.Scanner;

public class Program6_ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Pattern:");

        for (int i = number; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
}