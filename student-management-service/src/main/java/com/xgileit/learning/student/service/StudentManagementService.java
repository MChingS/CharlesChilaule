package com.xgileit.learning.student.service;
import com.xgileit.learning.student.Controller.Student;
import java.util.Map;

public interface StudentManagementService {

    String addStudent(Student student);

    Map<Integer, Student>listAll();
}
