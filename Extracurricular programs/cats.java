/*
*  Author: Connor Baker
*  Version: 0.1a
*  Created: December 11, 2015
*  Last Updated: March 22, 2016
*
*  Description: Print "cats" in rows of 10 to a text file.
*/

// Import necessary packages
import java.io.*;

public class cats {
  public static void main(String args[]) throws IOException {
    final int NUMBERS_PER_LINE = 10; // Ten integers per line
    int iteration = 0;
    for (int number = 0; number <= 2000000; number++) {
      PrintWriter writer = new PrintWriter(new FileOutputStream(new File("file.txt"),true));
      writer.print("cats");
      iteration++;
      if (iteration % NUMBERS_PER_LINE == 0) {
        writer.print("\n");
      }
      writer.close();
    }
  }
}
