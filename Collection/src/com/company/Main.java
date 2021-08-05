package com.company;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        LinkedHashSet<studentList> list = new LinkedHashSet<studentList>();

        //adding student to the linkedhashset
        studentList stud1 = new studentList(1,"charles","chilaule","a+");
        studentList stud2= new studentList(2,"bongani","shembe","a");
        studentList stud3 = new studentList(3,"mongeni","zwane","d");
        studentList stud4 = new studentList(4,"siyabonga","mbukwane","f");

        list.add(stud1);
        list.add(stud2);
        list.add(stud3);
        list.add(stud4);

        //displaying the student
        for(studentList temp:list)
        {
            System.out.println(temp.ID+" "+temp.fname+" "+temp.lname+" "+temp.grade);
        }
        list.remove(stud2);
        System.out.println("");
        System.out.println("_______After removing student________");

        //display after removing student
        for(studentList temp:list)
        {
            System.out.println(temp.ID+" "+temp.fname+" "+temp.lname+" "+temp.grade);
        }
        System.out.println("_______Grade for specific Student________");
        //find grade for student1
        for(studentList temp:list)
        {
            if (temp.fname == "charles") {
                System.out.println("The grade for Charles is grade :" + temp.grade);
            }
//        }
        }
        //sorting student list
        System.out.println("_______Grade for specific Student________");
        TreeSet<studentList> sortedStudentList = new TreeSet<studentList>();

        sortedStudentList.addAll(list);


    }
}
