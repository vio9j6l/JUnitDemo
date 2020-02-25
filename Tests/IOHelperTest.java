/*
 * Course: IST 311
 * Instructor: Phil O'Connell(px04)
 * Student: JiaJia Liu
 * Email: jpl5840@psu.edu
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class IOHelperTest
{
  @Test
  public void isValidYorN__Pass_Y__Returns_True() {
    assertTrue(IOHelper.isValidYorN("Y"));
  }

  @Test
  public void isValidYorN__Pass_y__Returns_True() {
    assertTrue(IOHelper.isValidYorN("y"));
  }

  @Test
  public void isValidYorN__Pass_N__Returns_True() {
    assertTrue(IOHelper.isValidYorN("N"));
  }

  @Test
  public void isValidYorN__Pass_x__Returns_False() {
    assertFalse(IOHelper.isValidYorN("x"));
  }

  @Test
  public void isValidYorN__Pass_character__Returns_False() {
    assertFalse(IOHelper.isValidYorN("#"));
  }

  @Test
  public void isValidYorN__Pass_long_string__Returns_False() {
    assertFalse(IOHelper.isValidYorN("abc"));
  }

  @Test
  public void isValidYorN__Pass_whitespace__Returns_False() {
    String[] testValues = {"", " ", "  ", "\t", "\r", "\n"};

    for (String testValue : testValues) {
      String message = "Testing '" + testValue + "'";
      assertFalse(message, IOHelper.isValidYorN((testValue)));
    }
    /*
    assertFalse(IOHelper.isValidYorN(""));
    assertFalse(IOHelper.isValidYorN(" "));
    assertFalse(IOHelper.isValidYorN("  "));
    assertFalse(IOHelper.isValidYorN("\t"));
    assertFalse(IOHelper.isValidYorN("\r"));
    assertFalse(IOHelper.isValidYorN("\n"));

     */
  }
}