package com.company;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        LinkedHashSet<studentList> list = new LinkedHashSet<studentList>();

        studentList stud1 = new studentList(1,"charles","chilaule","a+");
        studentList stud2= new studentList(2,"bongani","shembe","a");
        studentList stud3 = new studentList(3,"mongeni","zwane","d");
        studentList stud4 = new studentList(4,"siyabonga","mbukwane","f");

        list.add(stud1);
        list.add(stud2);
        list.add(stud3);
        list.add(stud4);
        for(studentList temp:list)
        {
            System.out.println(temp.ID+" "+temp.fname+" "+temp.lname+" "+temp.grade);
        }
    }

}
