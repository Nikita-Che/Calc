package com.me;

public interface Calculator {

    void getNumbers();

    void choseActions();

    Object addition();

    Object subtraction();

    Object multiply();

    Object divide();

    Object sqrt();

    void storeHistory(); //записывать все действия в стрингбилдер и потом выводить на экран

    Object sayHello();
}
