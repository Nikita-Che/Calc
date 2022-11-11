package com.me.exception;

public class OverLoadException extends CalculatorException {
    public OverLoadException(String message) {
        super("Не помню зачем добавил");
    }
}
