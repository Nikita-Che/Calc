package com.me;

public interface Calculator {

    void getFirstNumber();

    void getSecondNumber();

    void getThirdNumber();

    void choseFirstAction();

    void choseSecondAction();

    void addition();

    void subtraction();

    void multiply();

    void divide();

    void storeHistory(); //записывать все действия в стрингбилдер и потом выводить на экран

    // public double Koren(double a)
    //        {
    //            return Math.Sqrt(a);

    //вынести все проверки в абстрактный класс в отдельный метод а сам метод уже готовое будет делать. Т
    // То есть вводим число и сразу проверяем, потом второе и проверяем и если все проверки
    //прошли нормально то уже можно в мето отдавать работу. и все расслоить так же. проверки делать реализациями калькулятора конткрентного.

    //использовать из майна с бейджавы консоль.

}
