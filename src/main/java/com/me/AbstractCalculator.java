package com.me;

public abstract class AbstractCalculator implements Calculator {

    @Override
    public void getNumbers() {
        getFirstNumber();
        getSecondNumber();
        getThirdNumber();
        doGetNumbers();
    }

    protected abstract void doGetNumbers();

    abstract void getFirstNumber();

    abstract void getSecondNumber();

    abstract void getThirdNumber();

    @Override
    public void choseActions() {
        doAction();
    }

    protected abstract void doAction();

    @Override
    public void addition() {
        choseFirstAction();
        choseSecondAction();
        doAddition();
    }

    protected abstract void doAddition();

    protected abstract void choseFirstAction();

    protected abstract void choseSecondAction();

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
