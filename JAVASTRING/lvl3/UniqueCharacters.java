import java.util.Scanner;

public class UniqueCharacters {
    // Method to find length without using length()
    static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to find unique characters
    static char[] findUniqueChars(String text) {
        int n = getLength(text);
        char[] result = new char[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Check previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result[uniqueCount++] = ch;
            }
        }

        // Create final array with only unique chars
        char[] finalResult = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] uniques = findUniqueChars(text);
        System.out.print("Unique characters: ");
        for (char c : uniques) {
            System.out.print(c + " ");
        }
    }
}
