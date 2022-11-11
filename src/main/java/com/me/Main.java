package com.me;

import com.me.calculators.ConsoleCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new ConsoleCalculator();
        calculator.getNumbers();
        calculator.choseActions();
    }
}
