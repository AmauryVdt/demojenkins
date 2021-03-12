package com.epsi.mycal;

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

  public int div(int valueA, int valueB) {
    return valueA / valueB;
  }

  public boolean even(int valueA) {
    return valueA % 2 == 0;
  }

  public boolean isPremier(int valueA) {
    boolean isPremier = true;
    if (valueA < 0) {
        isPremier = false;
    } else if (valueA != 0 && valueA != 1) {
        for (int i = 2; i <= valueA/2; i++) {
            if (valueA != i && valueA % i == 0) {
                isPremier = false;
                break;
            }
        }
    }
    return isPremier;
  }
}
