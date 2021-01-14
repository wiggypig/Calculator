package com.tts;
import java.lang.Math.*;
import java.util.Scanner;

public class Calculator {
    public static void main(int args) {
        double num1;
        double num2 = 0;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);

        System.out.print("\nEnter an operator (+, -, *, /, ^, R, S, C, T): ");
        op = reader.next().charAt(0);
        if(op == 'R' || op == 'S' || op == 'C' || op == 'T'){
//            Scanner magic = new Scanner(System.in);
//            num1 = magic.nextDouble();
            System.out.print("Enter one number: ");
            num1 = reader.nextDouble();
            /*System.out.print("Enter two numbers: ");
            num1 = reader.nextDouble();
            num2 = reader.nextDouble();*/
        } else {
            System.out.print("Enter two numbers: ");
            num1 = reader.nextDouble();
            num2 = reader.nextDouble();
        }
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            case '^' : ans = Math.pow(num1,num2);
                break;
            case 'R': ans = Math.sqrt(num1);
                break;
            case'S': ans = Math.sin(num1);
                break;
            case 'C': ans= Math.cos(num1);
                break;
            case 'T': ans = Math.tan(num1);
                break;

//            System.out.println("Factorial of "+number+" is: "+fact);
            default: System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}