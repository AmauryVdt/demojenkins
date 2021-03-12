package com.epsi.mycal;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Application {

  /** This is the entry point of the program
   * 
   * @param args tab with arguments
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Hello World!");
    
    System.out.println("Bienvenue dans la calculatrice !");
    Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

    System.out.println("\n Please enter two numbers");
    System.out.println("\n First numbers : ");
    int firstNumber = scanner.nextInt();
    System.out.print("\n Second number: ");
    int secondNumber = scanner.nextInt();
    System.out.println("\n Select between (,/,+,-)\n");
    String operation = scanner.next();

    Calculator calculator = new Calculator();
    int result = 0;

    switch (operation){
       case "":
          result = calculator.mul(firstNumber, secondNumber);
          break;
       case "/":
          result = (int)calculator.div(firstNumber, secondNumber);
          break;
       case "+":
          result = calculator.add(firstNumber, secondNumber);
          break;
       case "-":
          result = calculator.sub(firstNumber, secondNumber);
          break;
       default :
          System.out.println("Please select a valid operator");
          break;
    }

    System.out.println("Your result :" + result);
    
    scanner.close();

  }

}
