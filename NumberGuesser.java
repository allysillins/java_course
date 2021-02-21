/*  The number guesser program figures out the number
    chosen by a human user. The human user will think
    of a number between 1 and 100. The program will
    make guesses and the user will tell the program to
    guess higher or lower.
 */

import java.util.Scanner;

public class NumberGuesser {

// One full guessing game round
  public static void playOneGame() {
      int lowRange = 1;      // start range is 1 - 100
      int highRange = 100;   // start range is 1 - 100
      System.out.println("Guess a number between 1 and 100.");
      int guessNumber = 50;  // initial midpoint guess is 50
     char userResponse = 'y';
     while (userResponse != 'c') {
         userResponse = getUserResponsetoGuess(guessNumber);

         // if user says # is higher, # is now between guessNumber & highRange
         if (userResponse == 'h') {
             lowRange = guessNumber;
             guessNumber = getMidpoint(lowRange, highRange);
         }
         // if user says # is lower, # is now between lowRange & guessNumber
         else if (userResponse == 'l') {
             highRange = guessNumber;
             guessNumber = getMidpoint(lowRange, highRange);
         }
     }
  }

// Ask user if they want to play again. Return true if yes, false if no.
  public static boolean shouldPlayAgain() {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Great! Do you want to play again? (y/n): ");
      char playAgain = scnr.next().charAt(0);

      if (playAgain == 'y') {
          return true;
      }
      else {
          return false;
      }
  }

// Ask user if value is h, l, c of generated guess and return user's char response
  public static char getUserResponsetoGuess(int guess) {
     Scanner scnr = new Scanner(System.in);
     System.out.println("" + "Is it " + guess +  "? (h/l/c): ");
     return scnr.next().charAt(0);
  }

// Find midpoint between 2 values
// TODO: set middle to always round down.
  public static int getMidpoint(int low, int high) {
     return (low + high) / 2;
  }

  public static void main(String[] args) {
     do {
        playOneGame();
     } while (shouldPlayAgain());
  }

}