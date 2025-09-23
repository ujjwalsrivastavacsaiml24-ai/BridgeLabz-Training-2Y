import java.util.Scanner;

public class FriendsAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = sc.nextInt();

        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("The youngest friend is Amar.");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("The youngest friend is Akbar.");
        } else {
            System.out.println("The youngest friend is Anthony.");
        }

        
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("The tallest friend is Amar.");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("The tallest friend is Akbar.");
        } else {
            System.out.println("The tallest friend is Anthony.");
        }

        sc.close();
    }
}
