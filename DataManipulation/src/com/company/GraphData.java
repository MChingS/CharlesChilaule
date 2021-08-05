package com.company;

import java.util.Scanner;

public class GraphData {

    public void userInput()
    {
        int numberOfValues=0;
        Scanner input = new Scanner(System.in);
        System.out.println("System graph started.");
        System.out.println("Enter how many values you need for the graph (Y values)");
        numberOfValues = input.nextInt();
        int x=1;

        if(numberOfValues >0)
        {
            double[] yValues = new double[numberOfValues];
            for (int i = 0; i < numberOfValues; i++)
            {
                System.out.print("Enter value number "+x+" :");
                yValues[i] = input.nextDouble();
                x++;
            }
            double max =yValues[0],min=yValues[0];

            for (int i = 0; i < numberOfValues; i++)
            {
               if(max<yValues[i]){
                   max=yValues[i];
               }
               if(min>yValues[i])
               {
                   min=yValues[i];
               }
               
            }
            double difference = max-min;
            System.out.println("The maximum value is :"+max);
            System.out.println("The minimum value is :"+min);
            System.out.println("The difference is :"+difference);
        }
        else
        {
            System.out.println("The number of values must be greater than 0 restart the program and try again");
        }
    }
}
