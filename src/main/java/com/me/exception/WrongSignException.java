package com.me.exception;

public class WrongSignException extends CalculatorException {
    public WrongSignException(String message) {
        super(" calculator can`t do such action");
    }
}
