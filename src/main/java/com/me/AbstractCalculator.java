package com.me;

/*Так как калькуляторы могут быть разными, и реализация может быть разной,
  и принимать он может все что угодно, в том числе и строки и даблы то всю проверку на правильность ввода,
  а так же остальные ошибки буду спускать в непосредственную реализацию калькулятора. Абстрактный класс
  будет реализовывать только общий каркас и работать с объектами, опять же, потому что допускаемые принимаемые
  значения могут быть разными.
*/
/*
 для третьего числа можно добавить булевый метод который спросит "будешь делать еще действие?"
*/
public abstract class AbstractCalculator implements Calculator {

    @Override
    public void getTwoNumbers() {
        doGetNumbers();
    }

    protected abstract void doGetNumbers();

    @Override
    public void choseActions() {
        choseFirstCalculatorAction();
    }

    protected abstract void choseFirstCalculatorAction();

    @Override
    public Object addition() {
        return doAddition();
    }

    protected abstract Object doAddition();


    @Override
    public Object subtraction() {
        return doSubstraction();
    }

    protected abstract int doSubstraction();

    @Override
    public Object multiply() {
        return doMultiply();
    }

    protected abstract int doMultiply();

    @Override
    public Object divide() {
        return doDivide();
    }

    protected abstract Object doDivide();

    @Override
    public Object sqrt() {
        return  doSqrt();
    }

    protected abstract double doSqrt();

    @Override
    public void storeHistory() {

    }
}
