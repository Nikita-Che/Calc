package com.me.calculators;

import com.me.AbstractCalculator;
import com.me.exception.NotNumberException;
import com.me.exception.WrongSignException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleCalculator extends AbstractCalculator {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static int firstNumber = 0;
    public static int secondNumber = 0;
    public static int thirdNumber = 0;
    public static int bufResult = 0;
    public static String action = "";
    public static String secondAction = "";
    public static double sqrtNumber = 0.0;

    @Override
    protected void doGetNumbers() {
        System.out.println("Skolko budet Chisel a ept?");
        try {
            int count = Integer.parseInt(reader.readLine());
            switch (count) {
                case 2:
                    getFirstNumber();
                    getSecondNumber();
                    doChoseAction();
                case 3:
                    getFirstNumber();
                    getSecondNumber();
                    doChoseAction();
                    /*
                    не понятно как тут сделать логику без дубляжа
                    по сути нужен буферный int который будет хранить результат первого вычисления
                    но все методы работают только с 2мя числами. Значит видимо надо вынести числа в параметры
                    и в зависитмости от того 2 или 3 числа выбраны в расчет уже передавать 1 и 2 иди буфер и 3
                    */
                    getThirdNumber();
                    doChoseAction();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getFirstNumber() {
        System.out.println("Please Enter first Number");
        firstNumber = getNumberFromUserConsole();
    }

    public void getSecondNumber() {
        System.out.println("Please Enter second Number");
        secondNumber = getNumberFromUserConsole();
    }

    private void getThirdNumber() {
        System.out.println("Please Enter third Number");
        thirdNumber = getNumberFromUserConsole();
    }

    private int getNumberFromUserConsole() {
        int number = 0;
        try {
            String buffnumber = reader.readLine();
            if (buffnumber.matches("[0-9]*]")) {
                number = Integer.parseInt(buffnumber);
            }
        } catch (IOException | NotNumberException e) {
            e.printStackTrace();
        }
        return number;
    }

    @Override
    protected void doChoseAction() {
        getActionFromUserConsole();
        switch (action) {
            case "+":
                doAddition();
            case "-":
                doSubtraction();
            case "*":
                doMultiply();
            case "/":
                doDivide();
            case "koren":
                doSqrt();
        }
    }

    private void getActionFromUserConsole() {
        String action = "";
        try {
            String bufaction = reader.readLine();
            if ("+-/*".matches(bufaction)) {
                action = bufaction;
            }
        } catch (IOException | WrongSignException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object doAddition() {
        return firstNumber + secondNumber;
    }

    @Override
    protected int doSubtraction() {
        return firstNumber - secondNumber;
    }

    @Override
    protected int doMultiply() {
        return firstNumber * secondNumber;
    }

    @Override
    protected Object doDivide() {
        return firstNumber / secondNumber;
    }

    @Override
    protected double doSqrt() {
        System.out.println(" Please entre DOUBLE number"); //вынесит выше. тут только ретУрн
        sqrtNumber = getNumberFromUserConsole();
        return Math.sqrt(sqrtNumber);
    }

    @Override
    public String sayHello() {
        return "Hello тебе разработчик";
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
