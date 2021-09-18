package com.xgileit.learning.student.service;

import com.xgileit.learning.student.Controller.Student;

import java.util.HashMap;
import java.util.Map;

public abstract class StudentManagementServiceImpl implements StudentManagementService{

    Map<Integer, Student> studentMap=new HashMap<>();

    @Override
    public String addStudent (Student student)
    {
        try {
            studentMap.put(student.getStudentNumber(), student);
            return "Student added";
        }
        catch (Exception e)
        {
            return "an error occurred please try again";
        }
    }
    @Override
    public Map<Integer, Student>listAll()
    {
        return studentMap;
    }
}
