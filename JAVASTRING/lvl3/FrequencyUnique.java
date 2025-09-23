import java.util.Scanner;

public class FrequencyUnique {
    static char[] uniqueChars(String text) {
        int n = text.length();
        char[] result = new char[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) { isUnique = false; break; }
            }
            if (isUnique) result[uniqueCount++] = ch;
        }
        char[] finalResult = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) finalResult[i] = result[i];
        return finalResult;
    }

    static String[][] frequencyWithUnique(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;

        char[] uniques = uniqueChars(text);
        String[][] result = new String[uniques.length][2];
        for (int i = 0; i < uniques.length; i++) {
            result[i][0] = String.valueOf(uniques[i]);
            result[i][1] = String.valueOf(freq[uniques[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freqTable = frequencyWithUnique(text);
        System.out.println("Char\tFrequency");
        for (String[] row : freqTable) System.out.println(row[0] + "\t" + row[1]);
    }
}
