import java.util.Scanner;

public class DeckOfCards {
    static String[] initializeDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    static String[] shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int random = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
        return deck;
    }

    static String[][] distributeCards(String[] deck, int players, int cards) {
        if (players * cards > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }
        String[][] result = new String[players][cards];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cards = sc.nextInt();

        String[][] distributed = distributeCards(deck, players, cards);
        if (distributed != null) {
            for (int i = 0; i < players; i++) {
                System.out.print("Player " + (i+1) + ": ");
                for (int j = 0; j < cards; j++) {
                    System.out.print(distributed[i][j] + " | ");
                }
                System.out.println();
            }
        }
    }
}
