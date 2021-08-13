package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class StudentRegistration {

    boolean fileCondition=false;
    String filename ="";
    String tempVale="";
    class student {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getIDNumber() {
            return IDNumber;
        }

        public void setIDNumber(String IDNumber) {
            this.IDNumber = IDNumber;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        String name, surname, IDNumber;
        String emailAddress, phoneNumber;
        String address, course;

    }
    public void enteringStudentDetails()
    {
        student toStudent = new student();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name :");
        toStudent.name = input.nextLine();
        System.out.print("Enter your surname :");
        toStudent.surname = input.nextLine();
        System.out.print("Enter your ID number :");
        tempVale=input.nextLine();
        while (tempVale.length()!=13)
        {
            System.out.print("Enter your ID number, integer only and must be 13 integers:");
            tempVale=input.nextLine();
        }
        toStudent.IDNumber = tempVale;
        System.out.print("Enter your phone number :");
        // not for now i check SA number only
        tempVale=input.nextLine();
        while (tempVale.length()!=10)
        {
            System.out.print("Enter your phone number integer only and must be 10 integers:");
            tempVale=input.nextLine();
        }
        toStudent.phoneNumber = tempVale;
        System.out.print("Enter your email address :");
        toStudent.emailAddress = input.nextLine();
        System.out.print("Enter your course :");
        toStudent.course = input.nextLine();
        if(fileCondition==true) {
            try {
                FileWriter writer = new FileWriter(filename.toString()+".txt");
                writer.write("Your name is :" +toStudent.name);
                writer.write("\nYour surname is :"+toStudent.surname);
                writer.write("\nYour ID number is :"+toStudent.IDNumber);
                writer.write("\nYour phone number is :"+toStudent.phoneNumber);
                writer.write("\nYour email address is :"+toStudent.emailAddress);
                writer.write("\nYour course name is :"+toStudent.course);
                writer.write("\n");
                writer.write("\n DONE!!!!!!");
                writer.write("\n");
                writer.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
            }
        }
        else
        {
            System.out.println("File was not created restart the program..");
        }
    }
    public void createFile(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter name to save file with :");
        filename = input.nextLine();
        try {
            File myObj = new File(filename.toString()+".txt");
            if (myObj.createNewFile())
            {
                System.out.println("File created: " + myObj.getName());
                fileCondition=true;
            } else {
                System.out.println("File name already exists data in the file will be over written.");
                fileCondition=true;
            }
        } catch (IOException e) {
            System.out.println("An error occurred. you inserted special characters on the file name");

        }
    }

}
