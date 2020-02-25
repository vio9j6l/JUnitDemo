/*
 * Course: IST 311
 * Instructor: Phil O'Connell(px04)
 * Student: JiaJia Liu
 * Email: jpl5840@psu.edu
 */

/**
  * Assists with tasks related to Input/Output
  *
  * This class provides helper methods for common tasks regarding I/O of data
  * @author Phil O'Connell (pxo4@psu.edu)
  */
public class IOHelper
{
    /**
     * Checks that given string is "Y" or "N"
     *
     * @param  str string to be checked
     * @return     true if string is "Y" or "N"
     */
    public static boolean isValidYorN(String str) {
        return ("N".equals(str) || "Y".equals(str));
    }
}
