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
    public void getNumbers() {
        doGetNumbers();
    }

    protected abstract void doGetNumbers();

    @Override
    public void choseActions() {
        doChoseAction();
    }

    @Override
    public Object addition() {
        return doAddition();
    }

    @Override
    public Object subtraction() {
        return doSubtraction();
    }

    @Override
    public Object multiply() {
        return doMultiply();
    }

    @Override
    public Object divide() {
        return doDivide();
    }

    @Override
    public Object sqrt() {
        return doSqrt();
    }

    @Override
    public void storeHistory() {

    }

    protected abstract Object doAddition();

    protected abstract Object doDivide();

    protected abstract void doChoseAction();

    protected abstract int doSubtraction();

    protected abstract double doSqrt();

    protected abstract int doMultiply();
}
