package com.company;

import java.util.Scanner;

public class GraphData {

    public void userInput()
    {
        int numberOfValues=0;
        Scanner input = new Scanner(System.in);
        System.out.println("System graph started.");
        System.out.print("Enter how many values you need for the graph (Y values) :");
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

            System.out.println("Tables values bellow");
            x=1;
            for (int i = 0; i < numberOfValues; i++)
            {
                //getting same values table view
                if(i!=numberOfValues-1)
                {
                    if(yValues[i]==yValues[i+1])
                    {
                        System.out.println("Value in array "+i+" and value in array "+x+" are the same");
                    }


                }
                if(i>0 && i< numberOfValues-1)
                {
                   if(yValues[i]<yValues[i-1] && yValues[i]<yValues[i+1])
                   {
                       System.out.println("value number "+x+" is a fall point");
                   }
                  if(yValues[i]>yValues[i-1] && yValues[i]>yValues[i+1])
                   {
                       System.out.println("value number "+x+" is a rising point");
                  }

                }x++;
                //getting max and min values
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
