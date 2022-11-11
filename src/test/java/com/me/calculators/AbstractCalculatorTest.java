package com.me.calculators;

import com.me.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.me.calculators.ConsoleCalculator.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class AbstractCalculatorTest {
    private final Calculator calculator;
    String hello;
    String firstFalseNumber = "qqwe123";
    int zeroDivizion = 0;

    protected AbstractCalculatorTest(Calculator calculator) {
        this.calculator = calculator;
        hello = (String) calculator.sayHello();
    }

    @BeforeEach
    void setUp() {
        firstNumber = 10;
        secondNumber = 2;
        action = "+";
        sqrtNumber = 4.0;
    }

//    @Test
//    void doGetNumbers() {
//        assertEquals(10, firstNumber);
//        assertEquals(2, secondNumber);
//    }

    @Test
    void getFirstNumber() {
        assertEquals(10, firstNumber);
    }

    @Test
    void notNumberFirstNumberException() {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            firstNumber = Integer.parseInt(firstFalseNumber);
            getFirstNumber();
        });
    }

    @Test
    void getSecondNumber() {
        assertEquals(2, secondNumber);
    }

    @Test
    void choseAction() {
        assertEquals("+", action);
        //передать сюда разные + - / * и проверить на то что правильно передается
    }

    @Test
    void doAddition() {
        int expected = (int) calculator.addition();
        assertEquals(expected, 12);
    }

    @Test
    void doSubstraction() {
        int expected = (int) calculator.subtraction();
        assertEquals(expected, 8);
        //поделить на ноль и проверить упадет ли
    }

    @Test
    void doMultiply() {
        int expected = (int) calculator.multiply();
        assertEquals(expected, 20);
    }

    @Test
    void doDivide() {
        int expected = (int) calculator.divide();
        assertEquals(expected, 5);
        //поделить на ноль и проверить упадет ли
    }

    @Test
    void divideByZEro() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            secondNumber = zeroDivizion;
            doDivide();
        });
    }

//    @Test
//    void doSqrt() {
//        double expected = (double) calculator.sqrt();
//        assertEquals(expected, 2.0);
//    }

    @Test
    void sayHello() {
        assertEquals("Hello тебе разработчик", hello);
    }
}
