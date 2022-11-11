package com.me;

public interface Calculator {

    void getTwoNumbers();

    void choseActions();

    Object addition();

    Object subtraction();

    Object multiply();

    Object divide();

    Object sqrt();

    void storeHistory(); //записывать все действия в стрингбилдер и потом выводить на экран

    Object sayHello();
}
