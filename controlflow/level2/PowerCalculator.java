import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for base number and exponent
        System.out.print("Enter a positive integer as base number: ");
        int number = sc.nextInt();
        System.out.print("Enter a positive integer as power: ");
        int power = sc.nextInt();

        // Check if inputs are positive
        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive integers for base and non-negative integer for power.");
        } else {
            int result = 1; // Initialize result

            // Loop to calculate power
            for (int i = 1; i <= power; i++) {
                result *= number; // Multiply result by number
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
