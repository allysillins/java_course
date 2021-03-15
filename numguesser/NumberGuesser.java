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

public class NumberGuesser {
    private int low;
    private int high;
    private int originalUpper;
    private int originalLower;

    /**
     * Constructor
     * @param lowerBound lower and originalLower user inserted field
     * @param upperBound upper and originalUpper user inserted field
     */
    public NumberGuesser(int lowerBound, int upperBound) {
        low = lowerBound;
        originalLower = lowerBound;
        high = upperBound;
        originalUpper = upperBound;
    }

    /**
     * @return current guess as midpoint
     */
    public int getCurrentGuess() {
        return ((high + low) / 2);
    }

    /**
     * Update lower parameter
     * given number is higher
     */
    public void higher() {
        low = getCurrentGuess() + 1;
    }

    /**
     * Update higher parameter
     * given number is lower
     */
    public void lower() {
        high = getCurrentGuess() - 1;
    }

    /**
     * reset low & high bounds to
     * original values
     */
    public void reset() {
        low = originalLower;
        high = originalUpper;
    }

}