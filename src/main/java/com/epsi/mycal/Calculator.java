package com.epsi.mycal;

/**
 * Calculator engine.
 * @version 1.0
 */
public class Calculator {

  /**
   * Addition function.
   * @param valueA First value to addition.
   * @param valueB Second value to addition.
   * @return Value of addition result.
   */
  public int add(int valueA, int valueB) {
    return valueA + valueB;
  }

  /**
   * Subtraction function.
   * @param valueA First value to subtraction.
   * @param valueB Second value to subtraction.
   * @return Value of subtraction result.
   */
  public int sub(int valueA, int valueB) {
    return valueA - valueB;
  }

  /**
   * Multiplication function.
   * @param valueA First value to multiplication.
   * @param valueB Second value to multiplication.
   * @return Value of multiplication result.
   */
  public int mul(int valueA, int valueB) {
    return valueA * valueB;
  }

  /**
   * Division function.
   * @param valueA First value to division.
   * @param valueB Second value to division.
   * @return Value of division result.
   */
  public int div(int valueA, int valueB) {
    return valueA / valueB;
  }

  /**
   * Check if value is pair.
   * @param value to test.
   * @return True if pair.
   */
  public boolean isPair(int value) {
    return (value % 2 == 0);
  }

  /**
   * Check if Prime number.
   * @param value to check
   * @return True if prime.
   */
  public boolean isPrime(int value) {
    boolean isPremier = true;

    if (value < 0) {
      isPremier = false;
    } else if (value != 0 && value != 1) {
      for (int i = 2; i <= value / 2; i++) {
        if (value != i && value % i == 0) {
          isPremier = false;
          break;
        }
      }
    }

    return isPremier;
  }

}
