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
        choseCalculatorAction();
    }

    protected abstract void choseCalculatorAction();

    @Override
    public Object addition() {
        return doAddition();
    }

    protected abstract Object doAddition();


    @Override
    public void subtraction() {
        doSubstraction();
    }

    protected abstract void doSubstraction();

    @Override
    public void multiply() {
        doMultiply();
    }

    protected abstract void doMultiply();

    @Override
    public void divide() {
        doDivide();
    }

    protected abstract void doDivide();

    @Override
    public void sqrt() {
        doSqrt();
        // public double Koren(double a)
        //        {
        //         return Math.Sqrt(a);
    }

    protected abstract void doSqrt();

    @Override
    public void storeHistory() {

    }
}
