/*
 * A class to guess a number the user chooses
 * that can be used in many different guessing
 * games, created by different developers in
 * different contexts.
 * @author Ally Sillins
 * @version 1.0
 */

package numguesser;
import java.util.ArrayList;

/*
 * upper and lower
 */

public class NumberGuesser {
    private int low;
    private int high;
    private int currentGuess;
    private int oldGuess;

    public NumberGuesser(int lowerBound, int upperBound) {
        lowe = lowerBound;
        high = higherBound;
    }

    public void higher() {
        high = oldGuess;
    }

    public void lower() {
        low = oldGuess;
    }

    public static int getCurrentGuess(int lowerBound, int upperBound) {
        System.out.println("50");
    }

}