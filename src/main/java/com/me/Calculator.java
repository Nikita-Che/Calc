package com.me;

public interface Calculator {

    Object getNumbers();

    Object choseActions();

    Object addition();

    void subtraction();

    void multiply();

    void divide();

    void sqrt();

    void storeHistory(); //записывать все действия в стрингбилдер и потом выводить на экран

    void sayHello();
}
