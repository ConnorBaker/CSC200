/*
*  Author: Connor Baker
*  Version: 0.1a
*  Created: November 14, 2015
*  Last Updated: March 22, 2016
*
*  Description: Find the mean, max, and min of a series of numbers.
*
*  TODO: Create comments.
*/

// Import necessary packages
import java.util.Scanner;

public class Assignment5 {
  public static void main(String[] args) {
    System.out.println("Connor Baker Presents:");
    System.out.println("Weird Math!\n");
    System.out.println("Please enter a series of numbers, ending the");
    System.out.println("series with an entry of 0.0");
    double input = 0.0;
    double sum = 0.0;
    double average = 0.0;
    double min = Double.POSITIVE_INFINITY;
    double max = Double.NEGATIVE_INFINITY;
    int number_of_numbers = 0;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Next number: ");
      input = scanner.nextDouble();
      if (input != 0.0) {
        sum = input + sum;
        if (max < input) {
          max = input;
        }
        if (min > input) {
          min = input;
        }
        number_of_numbers++;
      }
    } while (input != 0.0);
    average = sum / number_of_numbers;
    System.out.println("Max : "+max);
    System.out.println("Min : "+min);
    System.out.println("Mean: "+average);
  }
}
