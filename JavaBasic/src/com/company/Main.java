package com.company;

import org.omg.PortableInterceptor.USER_EXCEPTION;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        userinput out = new userinput(); // object for double class
        daysSpent dd = new daysSpent(); // object for days spent
        reverseword ww = new reverseword(); //object for reversing word
        int opt = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1 for double system or number 2 for days spent system and 3 for word reverse");
        opt = input.nextInt(); //class option
        while (opt < 1 || opt > 3) {
            System.out.println("Enter number 1 or 2 or 3 to choose system");
            opt = input.nextInt();
        }
        //options for class eg 1 for double input 2 for days spent and 3 dor reversing word entered
        if (opt == 1) {
            out.doublenumbers();
        }
        if (opt == 2) {

            dd.days();
        }
        if (opt == 3) {
            ww.word();
        }

    }
}
