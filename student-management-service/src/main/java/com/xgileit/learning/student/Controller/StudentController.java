package com.xgileit.learning.student.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping (value = "/api/v1/student")

public class StudentController {

    @GetMapping
    public String studentSelect()
    {
        return "Get the great";
    }
}
