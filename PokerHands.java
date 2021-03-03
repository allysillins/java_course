/*  Ally Sillins

    Poker Hands is a game that reads five cards from
    the user, analyzes them, and prints out the
    category of hand they represent: straight flush,
    four of a king, full house, flush, straight, three
    of a king, two pairs, pair, high card.
 */

import java.util.*;

public class PokerHands {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] hand = new int[5];

        // Get 5 cards from the user and put them in an array
        System.out.println("Enter five numeric cards, no face values. Use 2 - 9.");
        for (int i = 0; i < 5; ++i) {
            System.out.print("Card " + (i + 1) + ": ");
            hand[i] = scnr.nextInt();
        }

        // Sort cards in order of lowest to highest
        Arrays.sort(hand);

        // check what hand we have & print answer
        if (containsFourOfaKind(hand)){                // Four matching cards
            System.out.println("Four of a kind!");
        }
        else if (containsFullHouse(hand)){             // A pair, and a three of a kind
            System.out.println("Full House!");
        }
        else if (containsStraight(hand)){              // Card values can be arranged in order
            System.out.println("Straight!");
        }
        else if (containsThreeOfaKind(hand)){          // Three matching cards
            System.out.println("Three of a kind!");
        }
        else if (containsTwoPair(hand)){               // Two different pairs
            System.out.println("Two Pair!");
        }
        else if (containsPair(hand)) {                 // Two of the cards are identical
            System.out.println("Pair!");
        }
        else {                                         // There are no matching cards, and the hand is not a straight
            System.out.println("High Card!");
        }
    }

    public static int counter(int array[], int compareValue) {
        int count = 0;
        for (int i = 0; i < 5; i++){
            if (array[i] == compareValue) {
                ++count;
            }
        }
        return count;
    }

    public static boolean containsStraight(int[] hand) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (hand[i+1] - hand[i] == 1) {
                ++count;
            }
        }
        if (count == 4) {
            return true;
        }
        return false;
    }

    public static boolean containsPair(int[] hand) {
        List countPairs = new ArrayList();
        for (int i = 0; i < 5; i++) {
            countPairs.add(counter(hand, hand[i]));
        }
        if (countPairs.contains(2)) {
            return true;
        }
        return false;
    }

    public static boolean containsTwoPair(int[] hand) {
        int value = 0;
        boolean pair = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((hand[j] == hand[i]) && (i != j)) {
                    value = hand[i];
                    pair = true;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (pair && (hand[j] == hand[i]) && (i != j) && (hand[i] != value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsThreeOfaKind(int[] hand) {
        List countPairs = new ArrayList();
        for (int i = 0; i < 5; i++){
            countPairs.add(counter(hand, hand[i]));
        }
        if (countPairs.contains(3)) {
            return true;
        }
        return false;
    }

    public static boolean containsFullHouse(int[] hand) {
        List countPairs = new ArrayList();
        for (int i = 0; i < 5; i++){
            countPairs.add(counter(hand, hand[i]));
        }
        if (countPairs.contains(2) && countPairs.contains(3)) {
            return true;
        }
        return false;

    }

    public static boolean containsFourOfaKind(int[] hand) {
        List countPairs = new ArrayList();
        for (int i = 0; i < 5; i++){
            countPairs.add(counter(hand, hand[i]));
        }
        if (countPairs.contains(4)) {
            return true;
        }
        return false;
    }
}
