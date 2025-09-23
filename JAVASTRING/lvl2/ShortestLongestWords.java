import java.util.Scanner;

public class ShortestLongestWords {
    static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    static String[] customSplit(String text) {
        int n = customLength(text);
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int start = 0, wordIndex = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[wordIndex++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }

    static String[] findShortestLongest(String[][] wordTable) {
        int min = Integer.parseInt(wordTable[0][1]);
        int max = min;
        String minWord = wordTable[0][0];
        String maxWord = wordTable[0][0];

        for (String[] row : wordTable) {
            int len = Integer.parseInt(row[1]);
            if (len < min) {
                min = len;
                minWord = row[0];
            }
            if (len > max) {
                max = len;
                maxWord = row[0];
            }
        }
        return new String[]{minWord, maxWord};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] table = wordsWithLengths(words);
        String[] result = findShortestLongest(table);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
