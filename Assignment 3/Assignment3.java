/*
*  Author: Connor Baker
*  Version: 0.1a
*  Created: October 10, 2015
*  Last Updated: March 22, 2016
*
*  Description: To be used for performing statistical analysis on a
*  series of arrays.
*
*  TODO: Create if-else that deals with plurality of bills
*/

// Import necessary packages
import java.util.Scanner;

public class Assignment3 {

	public static void main(String args[]) {

		String myName = "Connor Baker";

		// Create a scanner to grab the number of dollars input by the user
		Scanner myScanner = new Scanner(System.in);
		System.out.println("\n\nWelcome to the bank of "+myName+"'s ATM");
		System.out.print("Please enter the amount you wish to withdraw in dollars: $");
		int withdraw = myScanner.nextInt();
		System.out.println("You have requested to withdraw "+withdraw+" dollars.");

		/*
		*  To do this code we need to make heavy use of modulus and dividend.
		*  We take the variable withdraw, divide it by 100, take the quotient and
		*  remainder, and continue to divide by 50, 20, 10, 5, and then 1. As such,
		*  we can find how many of each bill to hand back (the quotient), and the
		*  amount we have yet to convert to a bill (the modulus).
	  */

		// Initialize the variables used for these calculations
		int mod_amount_remaining;
		int quotient_amount_remaining;

			quotient_amount_remaining = withdraw / 100;
			System.out.println("\n"+quotient_amount_remaining+" one hundred dollar bill(s)"); // Print the number of hundreds handed back
			mod_amount_remaining = withdraw % 100;

			quotient_amount_remaining = mod_amount_remaining / 50;
			System.out.println("\n"+quotient_amount_remaining+" fifty dollar bill(s)"); // Print the number of fifties handed back
			mod_amount_remaining = mod_amount_remaining % 50;

			quotient_amount_remaining = mod_amount_remaining / 20;
			System.out.println("\n"+quotient_amount_remaining+" twenty dollar bill(s)"); // Print the number of twenties handed back
			mod_amount_remaining = mod_amount_remaining % 20;

			quotient_amount_remaining = mod_amount_remaining / 10;
			System.out.println("\n"+quotient_amount_remaining+" ten dollar bill(s)"); // Print the number of tens handed back
			mod_amount_remaining = mod_amount_remaining % 10;

			quotient_amount_remaining = mod_amount_remaining / 5;
			System.out.println("\n"+quotient_amount_remaining+" five dollar bill(s)"); // Print the number of fives handed back
			mod_amount_remaining = mod_amount_remaining % 5;

			// No need for the modulus after printing the number of ones: At Connor Baker's Bank, we don't do change
			quotient_amount_remaining = mod_amount_remaining / 1;
			System.out.println("\n"+quotient_amount_remaining+" one dollar bill(s)"); // Print the number of ones handed back

			// Sanitize variables
			withdraw = 0;
			mod_amount_remaining = 0;
			quotient_amount_remaining = 0;

		// Connor Says: "Happy customers are repeat customers"
		System.out.println("\nHave a fantastic day!");

	} // end main...

} // end class Assignment3...
