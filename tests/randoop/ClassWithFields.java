package randoop;

/**
 * ClassWithFields is a class used for tests of handling of 
 * public fields in setting up for test generation.
 * 
 * @author bjkeller
 *
 */
public class ClassWithFields {
  public ClassWithFields() {}
  
  public int oneField = 1;
  //public int twoField; //not here!!!!
  public int threeField = 3;
  public static int fourField = 4;
  public static final int FIVEFIELD = 5;
  public static int sixField = 6;
  private int sevenField = 7;
  private static int eightField = 8;
  protected int nineField = 9;
  
  public int oneMethod() {
    return 0;
  }
}
