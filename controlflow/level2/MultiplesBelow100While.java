import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Check input validity
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 100; // Start from 100
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--; // Decrement counter
            }
        }

        sc.close();
    }
}
