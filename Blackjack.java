import java.util.*;

public class Blackjack {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        Random random = new Random();

        int totalSum;                    // total value
        int card1;                       // first random card
        int card2;                       // second random card
        int latestCard;                  // random card when user wants to keep picking
        String userText = "y";           // user input (if they want to still play y/n) & initialize

        while (userText.equals("y")) {        // repeat as long as user wants to play
            card1 = random.nextInt(9) + 1;    // # 1 to 10
            card2 = random.nextInt(9) + 1;    // # 1 to 10
            totalSum = card1 + card2;         // get total value of cards in hand
            System.out.println("" + "First cards: " + card1 + " " + card2);     // show cards
            System.out.println("" + "Total: " + totalSum);                      // show total
            System.out.println("" + "Do you want another card? (y/n): ");       // ask if user wants to play again
            userText = scnr.nextLine();                                         // get response from user

            while (userText.equals("y") && totalSum <= 21) {               // only repeat while user hasn't busted yet
                latestCard = random.nextInt(9) + 1;
                System.out.println("" + "Card: " + latestCard);
                totalSum = totalSum + latestCard;
                System.out.println("" + "Total: " + totalSum);

                if (totalSum <= 21) {
                    System.out.println("" + "Do you want another card? (y/n): ");
                    userText = scnr.nextLine();
                }
                else {
                    System.out.println("" + "Bust.");
                }

            }

            System.out.println("" + "Would you like to play again? (y/n): ");
            userText = scnr.nextLine();
        }

    }
}