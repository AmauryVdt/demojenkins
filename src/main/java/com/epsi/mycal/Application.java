package com.epsi.mycal;

/**
 * Application launcher.
 * @version 1.0
 *
 */
public class Application {

  /**
   * Entry-point of application.
   * @param args List of arguments when application is launch.
   */
  public static void main(String[] args) {
    ConsoleUi ui = new ConsoleUi();
    ui.process();
  }

}
