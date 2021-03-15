/*
 * unit tests for the NumberGueser
 * program
 * @author Ally Sillins
 * @version 1.0
 */

package numguesser;
import java.util.ArrayList;

public class NumberGuesserTester {

    public static void main(String[] args) {

        System.out.println("Beginning tests.");

        // test that getCurrentGuess gets the midpoint correctly
        NumberGuesser guesser = new NumberGuesser(1, 100);
        if (guesser.getCurrentGuess() != 50) {
            System.out.println("    FAILED NumberGuesser(1,100)");
        }

        System.out.println("Tests complete.");
    }
}
