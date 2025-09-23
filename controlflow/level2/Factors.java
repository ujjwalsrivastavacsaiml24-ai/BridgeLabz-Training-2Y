import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if input is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) { // Check divisibility
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
