import java.util.Scanner;

public class NumberFormatDemo {
    static void generateException(String text) {
        int num = Integer.parseInt(text); // Will fail if not number
        System.out.println("Number: " + num);
    }

    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number text: ");
        String text = sc.next();

        //generateException(text);
        handleException(text);
    }
}
