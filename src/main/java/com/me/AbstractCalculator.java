package com.me;

/*Так как калькуляторы могут быть разными, и реализация может быть разной,
  и принимать он может все что угодно, в том числе и строки и даблы то всю проверку на правильность ввода,
  а так же остальные ошибки буду спускать в непосредственную реализацию калькулятора. Абстрактный класс
  будет реализовывать только общий каркас и работать с объектами, опять же, потому что допускаемые принимаемые
  значения могут быть разными.
*/
public abstract class AbstractCalculator implements Calculator {

    @Override
    public void getNumbers() {
        doGetNumbers(getFirstNumber(), getSecondNumber(), getThirdNumber());
    }

    protected abstract void doGetNumbers(Object firstNumber, Object secondNumber, Object thirdNumber);

    protected abstract Object getFirstNumber();

    protected abstract Object getSecondNumber();

    protected abstract Object getThirdNumber();


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
