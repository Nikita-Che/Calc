package com.me.calculators;

import com.me.AbstractCalculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleCalculator extends AbstractCalculator {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //убрать инициализацию после реализации методов
    int firstNumber = 1;
    int secondNumber = 1;
    String firstAction = "";

    @Override
    protected void doGetNumbers() {
        firstNumber = (int) getFirstNumber();
        secondNumber = (int) getSecondNumber();
        String chose = (String) choseAction();
        switch (chose) {
            case "+":
                doAddition(firstNumber, secondNumber);
        }
    }

    @Override
    protected Object getFirstNumber() {
        //запросить от пользователя через консоль число и добавить проверки на ошибки
        return firstNumber + 1;
    }

    @Override
    protected Object getSecondNumber() {
        //запросить от пользователя через консоль число и добавить проверки на ошибки
        return secondNumber + 1;
    }

    @Override
    protected Object choseAction() {
        //запросить от пользователя через консоль знак и добавить проверки на ошибки
        return firstAction = "+";
    }

    @Override
    protected Object doAddition(Object firstNumber, Object secondNumber) {
        return (int) firstNumber + (int) secondNumber;
    }


    @Override
    protected void doSubstraction() {

    }

    @Override
    protected void doMultiply() {

    }

    @Override
    protected void doDivide() {

    }

    @Override
    protected void doSqrt() {

    }


    @Override
    public void sayHello() {
        System.out.println("Hello тебе разработчик");
    }
}


//    private final static ArrayStorage ARRAY_STORAGE = new ArrayStorage();
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Resume r;
//        while (true) {
//            System.out.print("Введите одну из команд - (list | save uuid | delete uuid | get uuid | update uuid | clear | exit): ");
//            String[] params = reader.readLine().trim().toLowerCase().split(" ");
//            if (params.length < 1 || params.length > 2) {
//                System.out.println("Неверная команда.");
//                continue;
//            }
//            String uuid = null;
//            if (params.length == 2) {
//                uuid = params[1].intern();
//            }
//            switch (params[0]) {
//                case "list":
//                    printAll();
//                    break;
//                case "size":
//                    System.out.println(ARRAY_STORAGE.size());
//                    break;
//                case "save":
//                    r = new Resume(uuid);
//                    ARRAY_STORAGE.save(r);
//                    printAll();
//                    break;
//                case "update":
//                    r = new Resume(uuid);
//                    ARRAY_STORAGE.update(r);
//                    printAll();
//                    break;
//                case "delete":
//                    ARRAY_STORAGE.delete(uuid);
//                    printAll();
//                    break;
//                case "get":
//                    System.out.println(ARRAY_STORAGE.get(uuid));
//                    break;
//                case "clear":
//                    ARRAY_STORAGE.clear();
//                    printAll();
//                    break;
//                case "exit":
//                    return;
//                default:
//                    System.out.println("Неверная команда.");
//                    break;
//            }
//        }
//    }
//
//    static void printAll() {
//        Resume[] all = ARRAY_STORAGE.getAll();
//        System.out.println("----------------------------");
//        if (all.length == 0) {
//            System.out.println("Empty");
//        } else {
//            for (Resume r : all) {
//                System.out.println(r);
//            }
//        }
//        System.out.println("----------------------------");
//    }