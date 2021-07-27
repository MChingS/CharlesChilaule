package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {


    int tempValue;
    boolean condition;

    public void mathException() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Integer :");
        try {
            tempValue = input.nextInt();
            System.out.println("Entered information is an Integer which is :" + tempValue);
            condition = true;
        } catch (InputMismatchException e) {
            //if value is not an integer
            System.out.println("Entered information is not an Integer");
            condition = false;
        } catch (RuntimeException ex) {
            System.out.println("Error is unknown");
            condition = false;
        }
        //dividing inter value
        int devide;
        if (condition == true) {
            System.out.print("Enter number you want to divide with :");
            int divideVal;

            try {
                divideVal = input.nextInt();
                devide = tempValue / divideVal;
                System.out.println("Answer is :" + devide);
                condition = true;
            } catch (ArithmeticException e) {
                System.out.println("Integer can not be divided by zero");
                condition = false;
            } catch (InputMismatchException ex) {
                System.out.println("Integer can not be divided by fraction or a string or character");
                condition = false;
            } catch (RuntimeException ex) {
                System.out.println("Error is unknown");
                condition = false;
            }
        }
    }

    public void stringException() {
        Scanner input = new Scanner(System.in);

        System.out.println("___________________");
        String stringVal;
        int tempVal;
        boolean condition;

        System.out.println("Enter your string value");
        stringVal = input.nextLine();

        try {
            tempVal = Integer.valueOf(stringVal);
            System.out.println("Value enter is an integer which is :" + tempVal);
            condition = true;
        }
        //if string have a char or letter
        catch (NumberFormatException e) {
            System.out.println("Character or float can not be convected to integer");
            condition = false;
        }

        //index exception handling
        int length = stringVal.length();
        char[] charArray = new char[7];

        if (condition == false) {

            try {
                for (int i = 0; i < length; i++) {
                    charArray[i] = stringVal.charAt(i);
                }
                System.out.println("String is fitting to the char array");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The array is out of bounds");
            }
        }
    }

    public void nullException() {
        System.out.println("___________________");
        Scanner input = new Scanner(System.in);
        String stringVal = null;
        int nullCondition;

        System.out.print("Enter number 1 to update the value or anything to leave it null :");


        if (input.hasNextInt()) {
            nullCondition = input.nextInt();
            if (nullCondition == 0) {
                stringVal = null;
            } else if (nullCondition == 1) {
                System.out.println("Enter your string value");
                Scanner scanner = new Scanner(System.in);
                stringVal = scanner.nextLine();
            }
            try {
                System.out.println(stringVal.length());
            } catch (NullPointerException e) {
                System.out.println("The string is null");
            }

        } else {
            System.out.println("Value enter is on an integer");
        }
    }
}
