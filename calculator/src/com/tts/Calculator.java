package com.tts;
import java.lang.Math.*;
import java.util.Scanner;

public class Calculator {
    public static void main(int args) {
        double num1 = 0;
        double num2 = 0;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);

        System.out.print("\nEnter an operator (+, -, *, /, ^, R, S, C, T): ");
        op = reader.next().charAt(0);
        /*if(op == 'R' || op == 'S' || op == 'C' || op == 'T'){
            System.out.print("Enter one number: ");
            num1 = reader.nextDouble();
            *//*System.out.print("Enter two numbers: ");
            num1 = reader.nextDouble();
            num2 = reader.nextDouble();*//*
        } else {
            System.out.print("Enter two numbers: ");
            num1 = reader.nextDouble();
            num2 = reader.nextDouble();
        }*/
        // Choose a single or double operand
        switch (op){
            case 'R':
            case 'S':
            case 'C':
            case 'T':
                System.out.print("Enter one number: ");
                num1 = reader.nextDouble();
                break;
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                System.out.print("Enter two numbers: ");
                num1 = reader.nextDouble();
                num2 = reader.nextDouble();
        }
        // Perform the operators
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            case '^': ans = Math.pow(num1,num2);
                break;
            case 'R': ans = Math.sqrt(num1);
                break;
            case 'S': ans = Math.sin(num1);
                break;
            case 'C': ans= Math.cos(num1);
                break;
            case 'T': ans = Math.tan(num1);
                break;
// need the factorial code
//            System.out.println("Factorial of "+number+" is: "+fact);
            default: System.out.print("Error! Enter correct operator");
                return;
        }


        // Handle the output
        switch(op) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                doubleTheNumOutput(op, num1, num2, ans);
                break;
            case 'R':
            case 'S':
            case 'C':
            case 'T':
                singleNumOutput(op, num1, ans);
                break;
            default: System.out.print("Unspecified Error! Please restart program!");
        }

    }

    private static void singleNumOutput(char op, double num1, double ans) {
        System.out.print("\nThe result is given as follows:\n");
        System.out.print(num1 + " " + op + " = " + ans);
    }

    private static void doubleTheNumOutput(char op, double num1, double num2, double ans) {
        System.out.print("\nThe result is given as follows:\n");
        System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
    }


}