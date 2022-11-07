package com.me.calculators;

import com.me.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConsoleCalculatorTest {
    Calculator calculator = new ConsoleCalculator();
    int firstNumber = 1;
    int secondNumber = 2;
    String firstAction = "+";

    @BeforeEach
    void setUp() {

    }

    @Test
    void doGetNumbers() {
        int a = (int) calculator.getNumbers();
        Assertions.assertEquals(4, a);
    }

    @Test
    void getFirstNumber() {
    }

    @Test
    void getSecondNumber() {
    }

    @Test
    void choseAction() {
    }

    @Test
    void doAddition() {
        Assertions.assertEquals(4, 4);
    }

    @Test
    void doSubstraction() {
    }

    @Test
    void doMultiply() {
    }

    @Test
    void doDivide() {
    }

    @Test
    void doSqrt() {
    }

    @Test
    void sayHello() {
    }
}