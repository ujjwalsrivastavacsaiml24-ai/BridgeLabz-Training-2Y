import java.util.Scanner;

public class FirstNonRepeating {
    static char firstNonRepeatingChar(String text) {
        int[] freq = new int[256]; // ASCII chars
        int n = text.length();

        // Count frequencies
        for (int i = 0; i < n; i++) {
            freq[text.charAt(i)]++;
        }

        // Find first non-repeating
        for (int i = 0; i < n; i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; // null char if none
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char result = firstNonRepeatingChar(text);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
