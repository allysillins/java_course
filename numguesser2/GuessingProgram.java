/*
 * A game to guess the number a user is thinking
 * by setting high and low bounds, guessing the
 * midpoint, and updating the bounds based on user
 * feedback of higher/lower/correct
 * @author Ally Sillins
 * @version 1.0
 */

package numguesser2;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessingProgram {

    public static void main(String[] args) {

        RandomNumberGuesser game = new RandomNumberGuesser(1, 100);

        do {
            playOneGame(game);
        } while (shouldPlayAgain());

        System.out.println("Good bye.");
    }

    /**
     * Play the game of guessing midpoints until the
     * user says the guess is correct 'c'.
     */
    public static void playOneGame(RandomNumberGuesser game) {
        int guessNumber;
        char userResponse;
        boolean guessCorrect = false;

        System.out.println("Think of a number from 1 and 100.");
        do {
            guessNumber = game.getCurrentGuess();
            userResponse = getUserResponseToGuess(guessNumber);

            if (userResponse == 'h') {
                game.higher();
            }
            else if (userResponse == 'l') {
                game.lower();
            }
            else if (userResponse == 'c') {
                System.out.println("You picked " + guessNumber + "? Great pick.");
                game.reset();
                guessCorrect = true;
            }
        } while (!guessCorrect);

    }

    /**
     * After correct guess is made, determine if playing again
     * @return boolean for if player wants to play again
     */
    public static boolean shouldPlayAgain() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Do you want to play again? (y/n): ");
        return (scnr.next().charAt(0) == 'y');
    }

    /**
     * Ask if latest guess is accurate. Return user response
     * @param guess latest midpoint value to guess
     * @return user reponse h/l/c about the guess
     */
    public static char getUserResponseToGuess(int guess) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("" + "Is it " + guess +  "? (h/l/c): ");
        return scnr.next().charAt(0);
    }

}