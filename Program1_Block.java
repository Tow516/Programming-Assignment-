// Program1_Block.java
public class Program1_Block {
    public static void main(String[] args) {
        // Student number: Replace with your actual student number
        int studentNumber = 123456; // Example student number

        // Start of block
        {
            // Declaring variables inside the block
            int num1 = studentNumber;
            int num2 = 100;

            // Calculating sum
            int sum = num1 + num2;

            // Printing result
            System.out.println("Inside the block:");
            System.out.println("Student Number: " + num1);
            System.out.println("Number 2: " + num2);
            System.out.println("Sum: " + sum);
        } // End of block

        // Attempting to access variables outside the block (will cause error)
        // Uncomment the line below to see the compilation error
        // System.out.println("Trying to access num1 outside block: " + num1);

        System.out.println("\nOutside the block: Variables are not accessible here");
        System.out.println("If we try to access num1 or num2 here, we get a compilation error!");
    }
}