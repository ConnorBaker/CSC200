/*
*  Author: Connor Baker
*  Version: 0.1a
*  Created: November 7, 2015
*  Last Updated: March 22, 2016
*
*  Description: In rows of 10, print out numbers divisible by either five OR
*  six, over the inclusive interval of 100 to 200.
*
*  TODO: Add comments.
*/

public class Assignment4 {
  public static void main(String args[]) {
    final int NUMBERS_PER_LINE = 10; // Ten integers per line
    int iteration = 0;
    for (int number = 100; number <= 200; number++) {
      if ((number % 5 == 0) ^ (number % 6 == 0)) {
        System.out.print(number + " ");
        iteration++;
        if (iteration % NUMBERS_PER_LINE == 0) {
          System.out.print("\n");
        }
      }
    }
    System.out.println("\n\nConnor Baker would REALLY liked to have");
    System.out.println("that XOR was a thing before starting this.");
  }
}
