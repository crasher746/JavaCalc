package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double firstNum = 0.0, secondNum = 0.0, result = 0.0;
        String operation = new String();
        Boolean logic = false, logicZero = false;

        System.out.println("Input first integer argument: ");
        Scanner in = new Scanner(System.in);

        firstNum = in.nextDouble();
        System.out.println("A = " + firstNum);

        while(!logic) {
            System.out.println("Input operation (+, -, *, /): ");
            operation = in.next();

            if (("+".compareTo(operation) == 0) || ("-".compareTo(operation) == 0) ||
                    ("*".compareTo(operation) == 0) || ("/".compareTo(operation) == 0)) {
                logic = true;
            } else logic = false;

        }
        System.out.println("Operation: '" + operation + "'");

        while (!logicZero) {
            System.out.println("Input second integer argument: ");
            secondNum = in.nextDouble();
            if ((secondNum == 0.0) && ("/".compareTo(operation) == 0)) {
                logicZero = false;
                System.out.println("Dividing by zero is impossible!");
            }
            else logicZero = true;
        }
        System.out.println("B = " + secondNum);


        System.out.println("Wait a minute, I calculate...");


        switch(operation) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
        }
        System.out.println("Your result: " + firstNum + " " + operation + " " + secondNum + " = " + result);

    }
}
