/*
*  Author: Connor Baker
*  Version: 0.1a
*  Created: December 11, 2015
*  Last Updated: March 22, 2016
*
*  Description: Simulate a T9 dialer pad, and convert text to their numerical
*  equivalent.
*/

// Import necessary packages
import java.util.Scanner;

public class Assignment7 { // start public class Assignment7

	public static void main(String args[]) { // start main method
    System.out.println("Connor Baker!"); // print my name
    Scanner grabber = new Scanner(System.in); // create the scanner to grab input
    System.out.println("Enter a phone number (may contain letters)"); // print instructions
    String input = grabber.nextLine(); // tie scanner to a string
		String output = replaceLetters(input); // invoke the replaceLetters method to sanitize input
		System.out.println("You entered the string: " +input); // display entered string
		System.out.println("Processed string: " +output); // display the processed string
	} // end main method

	public static String replaceLetters(String input) { // start replaceLetters method
		String inputProcessed = input.replaceAll("[A-Ca-c]", "2"); // replace letters with T9 assignments
		inputProcessed = inputProcessed.replaceAll("[D-Fd-f]", "3");
		inputProcessed = inputProcessed.replaceAll("[G-Ig-i]", "4");
		inputProcessed = inputProcessed.replaceAll("[J-Lj-l]", "5");
		inputProcessed = inputProcessed.replaceAll("[M-Om-o]", "6");
		inputProcessed = inputProcessed.replaceAll("[P-Sp-s]", "7");
		inputProcessed = inputProcessed.replaceAll("[T-Vt-v]", "8");
		inputProcessed = inputProcessed.replaceAll("[W-Zw-z]", "9");
		return inputProcessed; // return the processed string
	} // end replaceLetters method
} // end Assignment7
