import java.util.Random;

public class VotingEligibility {
    static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90); // random age between 0-89
        }
        return ages;
    }

    static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "False";
            else if (ages[i] >= 18) result[i][1] = "True";
            else result[i][1] = "False";
        }
        return result;
    }

    static void displayTable(String[][] table) {
        System.out.println("Age\tCan Vote?");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] table = checkVoting(ages);
        displayTable(table);
    }
}
