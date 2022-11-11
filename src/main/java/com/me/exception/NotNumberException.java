package com.me.exception;

public class NotNumberException extends NumberFormatException {
    public NotNumberException() {
        super("this is not a number");
    }
}
