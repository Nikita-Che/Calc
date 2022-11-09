package com.me.calculators;

import com.me.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleCalculatorTest {
    Calculator calculator = new ConsoleCalculator();
    int firstNumber = 1;
    int secondNumber = 0;

    String firstAction = "+";

    @BeforeEach
    void setUp() {
        doGetNumbers();
    }

    @Test
    void doGetNumbers() {
        calculator.getNumbers();
        assertEquals(1, firstNumber);
        assertEquals(1, secondNumber);
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
        assertEquals(4, 4);
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