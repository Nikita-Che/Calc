package com.me;

import com.me.calculators.ConsoleCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new ConsoleCalculator();
        calculator.sayHello();
        //задать вопрос сколько будет чисел?
        calculator.getTwoNumbers();
        System.out.println(Math.sqrt(4));
    }
}
