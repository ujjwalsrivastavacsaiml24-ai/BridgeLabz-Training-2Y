import java.util.Scanner;

public class FrequencyChars {
    static String[][] frequencyUsingAscii(String text) {
        int[] freq = new int[256];
        int n = text.length();

        // Count frequencies
        for (int i = 0; i < n; i++) {
            freq[text.charAt(i)]++;
        }

        // Count how many unique chars
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }

        // Store results
        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freqTable = frequencyUsingAscii(text);
        System.out.println("Char\tFrequency");
        for (String[] row : freqTable) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
