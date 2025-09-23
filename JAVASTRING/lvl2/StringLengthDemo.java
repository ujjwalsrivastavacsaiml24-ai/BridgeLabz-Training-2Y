import java.util.Scanner;

public class StringLengthDemo {
    static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Stop counting when exception occurs
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int userDefined = customLength(text);
        int builtIn = text.length();

        System.out.println("User-defined length: " + userDefined);
        System.out.println("Built-in length: " + builtIn);
    }
}
