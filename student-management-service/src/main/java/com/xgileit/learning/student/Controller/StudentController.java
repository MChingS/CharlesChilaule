package com.xgileit.learning.student.Controller;

import com.xgileit.learning.student.StudentManagementServiceApplication;
import com.xgileit.learning.student.service.StudentManagementServiceImpl;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


@RestController
@RequestMapping (value = "/api/v1/student") //URI

public class StudentController {


    StudentManagementServiceImpl studentManagementService = new StudentManagementServiceImpl() {
        @Override
        public Map<Integer, Student> listAll() {
            return null;
        }
    };
    //Get student show list before adding
    @GetMapping
    public String studentSelect()
    {
        return "Get Student Method";
    }

    //insert student to the list
    @PostMapping
    public String studentInsert()
    {
        return "Insert student data";
    }

    //Get student list after adding
    @GetMapping(value = "afterAddingStudent")
    public String studentSelectAfter()
    {
        return "Get Student Method";
    }

    @PutMapping
    public String studentUpdate()
    {
        return "Update student data";
    }

    @DeleteMapping
    public String studentRemove()
    {
        return "Remove student and information";
    }
    @RequestMapping(value = "/fetch/{id}", method = RequestMethod.GET)
    public String studentPath(@PathVariable("id") int studentID)
    {
        if(studentID==2)
        {
            return "Student found";
        }
        return "student not found";
    }
    ArrayList<String> studentList = new ArrayList<>();
    @RequestMapping(value = "/all/{studentID}",method = RequestMethod.GET)
    public List listOfStudent(@PathVariable("studentID") int studentID,@RequestParam(value = "name",required = false)String name)
    {

        if (studentID==2)
        {
            studentList.add(name);
        }
        return  studentList;
    }

    @PostMapping(value = "/add")
    public String studentAdd(@RequestBody Student student)
    {
        String response=studentManagementService.addStudent(student);
        return response;

    }
}
