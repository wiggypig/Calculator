package com.tts;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {
    // variables - class global
    String[] arrMenuOps = {"---Please Select A Function By Entering The Number---", "Addition", "Subtraction",
            "Multiplication", "Division", "Power or Square", "Square Root ", "Sin", "Cosine", "Tangent",
            "Factorial", "USD to €", "€ to USD", "£ to USD", "Discount", "Quit Calculator" };
    boolean flag = true;
    int opOne;
    String message1 = "Enter the number of your selection";
    String message2 = "Please enter the first number";
    String message3 = "Please enter your number";
    double num2 = 0;
    int num3 = 1;
    double ans;
    BigInteger bigAnswer;

    public void main(int args) {

        for (int i = 1; i<arrMenuOps.length; i++) {
            System.out.println(i + "Menu item " + arrMenuOps[i]);
        }
        // setup scanner to get the input from the console
        // Scanner reader = new Scanner(System.in);

        // like a game loop - keep running until Q is selected
        do{

            /*
             * Call to display the End User Initial Menu
             */
            displayMenu();

            /* collect menu option
             * inputs are string for display
             * return is an integer used to determine operation
             * @param string
             * @return integer
             */
            opOne = LoopArrays.getInputNumber(message1);

            /*
             * switch statement to handle operation selection
             * input is an integer
             */
            switch (opOne) {
                case 1, 2, 3, 4, 5 -> {
                    num2 = LoopArrays.getInputNumber(message2);     // done
                    num3 = LoopArrays.getInputNumber(message3);
                    ans = performOperation(opOne, num2, num3);
                    doubleTheNumOutput(arrMenuOps[opOne], ans);
                }
                case 6, 7, 8, 9 -> {
                    num3 = LoopArrays.getInputNumber(message3);     //done
                    ans = performOperation(opOne, num3, num2);
                    singleNumOutput(arrMenuOps[opOne], ans);
                }
                case 10 -> {
                    num3 = LoopArrays.getInputNumber(message3);     // done
                    bigAnswer = factorialResult(num3);
                }
                case 11, 12, 13 -> CurrencyCalc.currcalc(opOne);    // done
                case 14 -> itemDiscount();                          // done
                case 15 -> {
                    System.out.println("Thanks and good-bye");      // done
                    flag = false;
                }
                default -> System.out.println("default");
            }

       }while(flag);


    }



    // display the end user menu
    private void displayMenu(){
        System.out.println("\n---Please Select A Function By Entering The Number---");
        for (int i = 1; i < arrMenuOps.length; i++){
            System.out.println(i + ": " + arrMenuOps[i]);
        }

    }

    private static void singleNumOutput(String op, double ans) {
        System.out.print("The answer for the " + op + " operation is: = ");
        System.out.print(ans);
        System.out.println();
    }

    private static void doubleTheNumOutput(String op, double ans) {
        System.out.print("The answer for the " + op + " operation is: = ");
        System.out.print(ans);
        System.out.println();
    }

    /**
     * Handles math operations excluding factorial
     * Inputs are char, and two doubles
     * return a double
     * @param operation number indicating the math operation to perform
     * @param num1  first operand of math operation
     * @param num2  second operand of math operation
     * @return      answer for each math operation
     */
    private double performOperation(int operation, double num1, double num2){
        /**
         *      Perform the operations based on input
         */
        double answer = 0;

        switch (operation) {
            case 1 -> answer = num1 + num2;
            case 2 -> answer = num1 - num2;
            case 3 -> answer = num1 * num2;
            case 4 -> answer = num1 / num2;
            case 5 -> answer = Math.pow(num1, num2);
            case 6 -> answer = Math.sqrt(num1);
            case 7 -> answer = Math.sin(Math.toRadians(num1));
            case 8 -> answer = Math.cos(Math.toRadians(num1));
            case 9 -> answer = Math.tan(Math.toRadians(num1));
        }
        return answer;
    }

    /**
     * performs factorial operations [Shout Out to Laura Wallace]
     * takes an int as input
     * returns BigInteger as output
     * @param fact1 int used to calculate the factorial; upper bound of the for loop
     * @return  the BigInteger of factorial
     */
    private BigInteger factorialResult (int fact1){
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= fact1; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The answer for the factorial operation is: = ");
        System.out.print(result);
        return  result;
    }

    static void print(String line) {
        System.out.println(line);
    }

    private void itemDiscount() {
        int price;
        int discount;
        Scanner sc = new Scanner(System.in);
        print("Enter price of the product :");
        price = sc.nextInt();
        print("Enter Discount of the product :");
        discount = sc.nextInt();
        int finalPrice = (price * (100-discount)) / 100;
        print("Final price is " + finalPrice);
    }

}