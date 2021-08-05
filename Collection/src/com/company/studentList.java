package com.company;

import java.util.Comparator;
import java.util.Objects;

class studentList implements Comparable {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof studentList)) return false;
        studentList that = (studentList) o;
        return getID() == that.getID() && getFname().equals(that.getFname()) && getLname().equals(that.getLname()) && getGrade().equals(that.getGrade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getFname(), getLname(), getGrade());
    }

    public int getID() {
         return ID;
     }

     public void setID(int ID) {
         this.ID = ID;
     }

     public String getFname() {
         return fname;
     }

     public void setFname(String fname) {
         this.fname = fname;
     }
     public String getLname() {
         return lname;
     }
     public void setLname(String lname) {
         this.lname = lname;
     }

     public String getGrade() {
         return grade;
     }

     public void setGrade(String grade) {
         this.grade = grade;
     }
     int ID;
     String fname, lname, grade;
    public studentList(int ID, String fname, String lname, String grade) {

        this.ID = ID;
        this.fname=fname;
        this.lname=lname;
        this.grade=grade;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    
}
