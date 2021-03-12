package com.epsi.mycal;

import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * Console Interface.
 * @version 1.0
 *
 */
public class ConsoleUi {

  /**
   * Display main menu.
   */
  public void displayFunctionAvailable() {
    System.out.println("Function availables: \n\t1 : add\n\t2 : sub....");
  }

  /**
   * UI process.
   */
  public void process() {
    int value1;
    int value2;
    int result;
    boolean resultBool;

    Calculator calc = new Calculator();

    this.displayFunctionAvailable();
    Scanner input = new Scanner(System.in, Charset.defaultCharset());

    int value = input.nextInt();

    switch (value) {
      case 1:
        System.out.println("Saisir valeur 1 : ");
        value1 = input.nextInt();
        System.out.println("Saisir valeur 2 : ");
        value2 = input.nextInt();
        result = calc.add(value1, value2);
        System.out.println("Result " + result);
        break;
      case 2:
        System.out.println("Saisir valeur 1 : ");
        value1 = input.nextInt();
        System.out.println("Saisir valeur 2 : ");
        value2 = input.nextInt();
        result = calc.sub(value1, value2);
        System.out.println("Result " + result);
        break;
      case 3:
        System.out.println("Saisir valeur 1 : ");
        value1 = input.nextInt();
        System.out.println("Saisir valeur 2 : ");
        value2 = input.nextInt();
        result = calc.mul(value1, value2);
        System.out.println("Result " + result);
        break;
      case 4:
        System.out.println("Saisir valeur 1 : ");
        value1 = input.nextInt();
        System.out.println("Saisir valeur 2 : ");
        value2 = input.nextInt();
        result = calc.div(value1, value2);
        System.out.println("Result " + result);
        break;
      case 5:
        System.out.println("Saisir valeur : ");
        value1 = input.nextInt();
        resultBool = calc.isPair(value1);
        System.out.println("Is Pair : " + resultBool);
        break;
      case 6:
        System.out.println("Saisir valeur : ");
        value1 = input.nextInt();
        resultBool = calc.isPrime(value1);
        System.out.println("Is Pair : " + resultBool);
        break;
      default:
        System.out.println("Function not found !");
        break;
    }

    input.close();
  }

}
