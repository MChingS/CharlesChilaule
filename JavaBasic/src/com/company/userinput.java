package com.company;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;
import java.lang.*;
import java.text.DecimalFormat;
import java.lang.Double;

public class userinput {


    public void doublenumbers() throws Exception {

        Scanner input = new Scanner(System.in);
        double num = 0, val = 0;

        DecimalFormat df = new DecimalFormat("###.##");

        System.out.print("Enter your double : ");

        while (input.hasNext()) {

            if (input.hasNextDouble()) {

                num = input.nextDouble();
                val = Double.valueOf(num);

                String temp = String.valueOf(num);
                temp = df.format(Double.valueOf(val));

                int pos = temp.indexOf(".");

                if (pos > 0) {
                    System.out.println("Your double is :" + df.format(num));
                    {
                        String num1 = temp.substring(0, pos);

                        String num2 = temp.substring(pos + 1, temp.length());
                        pos = pos + 1;
                        System.out.println("Dot is in position " + pos);
                        System.out.println("First part is " + num1);
                        System.out.println("Second part is " + num2);
                        int temp1 = Integer.valueOf(num1);
                        int temp2 = Integer.valueOf(num2);
                        int sum = temp1 + temp2;

                        if (temp2 == temp1) {
                            System.out.println("Identical");

                        } else {
                            System.out.println("Not Identical");
                        }
                        System.out.println("The sun is :" + sum);
                    }
                } else {
                    System.out.println("Number is not a double");
                }
            } else {
                System.out.println("Value entered: " + input.next() + " is not a double ");

            }
            System.out.print("Enter your double : ");
        }

    }
    // input.close();
}

