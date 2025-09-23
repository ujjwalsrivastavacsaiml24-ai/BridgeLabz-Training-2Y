import java.util.Scanner;

public class RockPaperScissors {
    static String getComputerChoice() {
        int num = (int)(Math.random() * 3); // 0,1,2
        if (num == 0) return "rock";
        else if (num == 1) return "paper";
        else return "scissors";
    }

    static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper")))
            return "User";
        else
            return "Computer";
    }

    static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] result = new String[2][3];
        result[0][0] = "User";
        result[0][1] = String.valueOf(userWins);
        result[0][2] = String.valueOf((userWins * 100) / games) + "%";

        result[1][0] = "Computer";
        result[1][1] = String.valueOf(compWins);
        result[1][2] = String.valueOf((compWins * 100) / games) + "%";

        return result;
    }

    static void displayStats(String[][] stats) {
        System.out.println("\nPlayer\tWins\tWin%");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0;
        for (int i = 1; i <= games; i++) {
            System.out.print("Game " + i + " - Enter rock, paper, or scissors: ");
            String user = sc.next().toLowerCase();
            String computer = getComputerChoice();

            System.out.println("Computer chose: " + computer);
            String winner = findWinner(user, computer);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            System.out.println("Winner: " + winner);
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayStats(stats);
    }
}
