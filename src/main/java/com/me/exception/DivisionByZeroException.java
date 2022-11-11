package com.me.exception;

public class DivisionByZeroException extends CalculatorException {
    public DivisionByZeroException(String message) {
        super(" Divison by zero Zapresheno!");
    }
}
