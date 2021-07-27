package com.company;

import java.util.Scanner;
import java.lang.*;
import java.text.DecimalFormat;

public class reverseword {

    public void word() {
        System.out.println("Enter you word to be reversed");
        Scanner input = new Scanner(System.in);
        String myword = "";
        myword = input.nextLine();
        int num = myword.length();
        char[] let = new char[num]; //array for the word characters

        //characters word storage
        for (int i = 0; i < num; i++) {
            let[i] = myword.charAt(i);
        }
        String newword = "";

        //storing word in revers
        for (int x = num - 1; x >= 0; x--) {
            newword = newword + let[x];
        }
        System.out.println("Your reversed word is :" + newword);
    }
}
