package com.epsi.mycal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testAdd() {
    int a = 2;
    int b = 3;

    Calculator calc = new Calculator();
    int actual = calc.add(a, b);

    assertEquals(5, actual);
  }

  @Test
  public void testSub() {
    int a = 4;
    int b = 2;

    Calculator calc = new Calculator();
    int actual = calc.sub(a, b);

    assertEquals(2, actual);
  }

  @Test
  public void testMul() {
    int a = 4;
    int b = 2;

    Calculator calc = new Calculator();
    int actual = calc.mul(a, b);

    assertEquals(8, actual);
  }

  @Test
  public void testDiv() {
    int a = 4;
    int b = 2;

    Calculator calc = new Calculator();
    int actual = calc.div(a, b);

    assertEquals(2, actual);
  }

  @Test
  public void testIsPair() {
    int a = 4;
    int b = 3;

    Calculator calc = new Calculator();
    boolean actual = calc.isPair(a);
    assertTrue(actual);

    actual = calc.isPair(b);
    assertFalse(actual);
  }

  @Test
  public void testIsPrime() {
    int prime = 3;
    int notPrime = 6;

    Calculator calc = new Calculator();
    boolean actual = calc.isPrime(prime);
    assertTrue("is not prime", actual);

    actual = calc.isPrime(notPrime);
    assertFalse("is prime", actual);
  }

}
