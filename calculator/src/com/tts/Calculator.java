package com.tts;
import java.lang.Math.*;
import java.util.Scanner;

public class Calculator {
    // variables - class global
    boolean flag = true;
    char op;
    double num1 = 0;
    double num2 = 0;
    double ans;

    public void main(int args) {

        // setup scanner to get the input from the console
        Scanner reader = new Scanner(System.in);

        // like a game loop - keep running until Q is selected
        do{



            System.out.print("\nEnter an operator (+, -, *, /, ^, R, S, C, T, Q): ");
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
                    ans = performOperation(op, num1, num2);
                    singleNumOutput(op, num1, ans);
                    break;
                case 'Q':
                    System.out.println("Thanks and good-bye");
                    flag = false;
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                    System.out.print("Enter two numbers: ");
                    num1 = reader.nextDouble();
                    num2 = reader.nextDouble();
                    ans = performOperation(op, num1, num2);
                    doubleTheNumOutput(op, num1, num2, ans);
                    break;
                default:
                    System.out.println("Let's try that again. ");
                    break;
            }
           /* // Perform the operators
            // need the factorial code
            //            System.out.println("Factorial of "+number+" is: "+fact);
            switch (op) {
                case '+' -> ans = num1 + num2;
                case '-' -> ans = num1 - num2;
                case '*' -> ans = num1 * num2;
                case '/' -> ans = num1 / num2;
                case '^' -> ans = Math.pow(num1, num2);
                case 'R' -> ans = Math.sqrt(num1);
                case 'S' -> ans = Math.sin(num1);
                case 'C' -> ans = Math.cos(num1);
                case 'T' -> ans = Math.tan(num1);
                default -> {
                    System.out.print("Error! Enter correct operator");
                    return;
                }
            }
*/

            // Handle the output
/*            switch (op) {
                case '+', '-', '*', '/', '^' -> doubleTheNumOutput(op, num1, num2, ans);
                case 'R', 'S', 'C', 'T' -> singleNumOutput(op, num1, ans);
                default -> System.out.print("Unspecified Error! Please restart program!");
            }*/
       }while(flag);


    }

    private static void singleNumOutput(char op, double num1, double ans) {
        System.out.print("\nThe result is given as follows:\n");
        System.out.print(num1 + " " + op + " = " + ans);
    }

    private static void doubleTheNumOutput(char op, double num1, double num2, double ans) {
        System.out.print("\nThe result is given as follows:\n");
        System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
    }

    private double performOperation(char op, double num1, double num2){
        double answer = 0;
/**
  *      Perform the operations
  *      need the factorial code
**/

        switch (op) {
            case '+' -> answer = num1 + num2;
            case '-' -> answer = num1 - num2;
            case '*' -> answer = num1 * num2;
            case '/' -> answer = num1 / num2;
            case '^' -> answer = Math.pow(num1, num2);
            case 'R' -> answer = Math.sqrt(num1);
            case 'S' -> answer = Math.sin(num1);
            case 'C' -> answer = Math.cos(num1);
            case 'T' -> answer = Math.tan(num1);
/*            default -> {
                System.out.print("Error! Enter correct operator");

            }*/
        }
        return answer;
    }


}