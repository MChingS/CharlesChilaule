package com.company;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DayDV;

import java.text.DateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.lang.*;
import java.text.DecimalFormat;
import java.time.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.ParseException;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class daysSpent {
    Scanner enter = new Scanner(System.in);

    public void days() throws Exception {
        int year = 0;
        int month = 0;
        int day = 0;
        boolean condition = false;

        System.out.println("Enter you date of in the following format Year/Month/Day");

        System.out.println("Enter year of birth :");
        while (enter.hasNext()) {

            if (enter.hasNextInt()) {

                year = enter.nextInt();
                while (year < 1900 || year > 2021)//only years between 1900 - 2021 allowed
                {
                    if (enter.hasNextInt()) {
                        System.out.print("Year of birth must be not less than 1900 or 2021 please try again :");
                        year = enter.nextInt();
                    } else {
                        System.out.print("Year of birth must be Integer only not :" + enter.next() + " try again :");
                    }


                }

                System.out.println("Enter month of birth :");
                while (enter.hasNext()) {

                    if (enter.hasNextInt()) {
                        month = enter.nextInt();
                        while (month < 0 || month > 12) {
                            System.out.println(" Month of birth must be greater than 0 and less than 12");
                            System.out.println("Enter Month of birth :");
                            month = enter.nextInt();
                        }
                        daysSpent test = new daysSpent();
                        System.out.println("Enter day of birth :");

                        while (enter.hasNext()) {

                            if (enter.hasNextDouble()) {

                                day = enter.nextInt();


                                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {


                                    while (day < 0 || day > 31) {

                                        System.out.println("Day must be greater than 0 and less than 32 for month " + month);
                                        day = enter.nextInt();

                                    }

                                }
                                if (month == 4 || month == 6 || month == 9 || month == 11) {
                                    while (day < 0 || day > 30) {
                                        System.out.println("Day must be greater than 0 and less than 31 for month " + month);
                                        day = enter.nextInt();

                                    }
                                }
                                if (month == 2) {
                                    while (day < 0 || day > 29) {
                                        System.out.println("Day must be greater than 0 and less than 30 for month " + month);
                                        day = enter.nextInt();

                                    }
                                }


                                String dateFormat = "yyyy/mm/dd"; //date format
                                DateFormat form = new SimpleDateFormat(dateFormat);

                                //convecting user input to date
                                LocalDate nowDate = LocalDate.now();
                                String temp1 = year + "/" + month + "/" + day;
                                Date bod = form.parse(temp1);

                                // days calculation and convecting
                                long Dayslived = DAYS.between(bod.toInstant(), nowDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

                                //Dates output and days spent
                                System.out.println("Today's date is :" + nowDate);
                                System.out.println("Your year of birth is :" + temp1);
                                System.out.println("Days lived are :" + Dayslived);

                            } else {
                                System.out.println("Day must be an in :" + enter.next());
                            }

                        }
                    } else {
                        System.out.print("Month of birth must be Integer only not :" + enter.next() + " try again :");
                    }
                }
            } else {
                System.out.print("Year of birth must be Integer only not :" + enter.next() + " try again :");

            }
        }

    }
}
