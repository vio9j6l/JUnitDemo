/*
 * Course: IST 311
 * Instructor: Phil O'Connell(px04)
 * Student: JiaJia Liu
 * Email: jpl5840@psu.edu
 */

import java.util.Scanner;

public class Main
{

  static final Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    boolean isValid = false;

    do {
      System.out.print("Enter Y or N: ");
      String userInput = keyboard.nextLine();
      isValid = IOHelper.isValidYorN(userInput);
    } while (!isValid);
  }

}
