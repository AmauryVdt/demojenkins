package com.epsi.mycal;

/** Class to use different operation.
 * 
 * @author amaur
 *
 */
public class Calculator {
  public int add(int valueA, int valueB) {
    return valueA + valueB;
  }

  public int sub(int valueA, int valueB) {
    return valueA - valueB;
  }

  public int mul(int valueA, int valueB) {
    return valueA * valueB;
  }

  /** Division Function
   * 
   * @param valueA
   * @param valueB
   * @return
   */
  public double div(int valueA, int valueB) {
    double result = 0;
    try {
      result = (double) valueA / (double) valueB;
    } catch (Exception e) {
      System.out.println(e);
    }
    return result;
  }

  public boolean isEven(int valueA) {
    return valueA % 2 == 0;
  }

  /** isPremier Function
   * 
   * @param valueA
   * @return
   */
  public boolean isPremier(int valueA) {
    boolean isPremier = true;
    if (valueA < 0) {
      isPremier = false;
    } else if (valueA != 0 && valueA != 1) {
      for (int i = 2; i <= valueA / 2; i++) {
        if (valueA != i && valueA % i == 0) {
          isPremier = false;
          break;
        }
      }
    }
    return isPremier;
  }
}
