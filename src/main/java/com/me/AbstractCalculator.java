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
    public Object getNumbers() {
        return doGetNumbers();
    }

    protected abstract Object doGetNumbers();

    protected abstract Object getFirstNumber();

    protected abstract Object getSecondNumber();

    @Override
    public Object choseActions() {
        return choseAction();
    }

    protected abstract Object choseAction();

    @Override
    public Object addition() {
        return doAddition(getFirstNumber(),getSecondNumber());
    }

    protected abstract Object doAddition(Object firstNumber, Object secondNumber);




















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
