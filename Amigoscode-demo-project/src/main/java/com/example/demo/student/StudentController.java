package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService StudentService;

    @Autowired
    public StudentController(com.example.demo.student.StudentService studentService) {
        this.StudentService =  studentService;
    }


    @GetMapping
    public List<Student> getStudents(){
        return StudentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){


        StudentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        StudentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId, @RequestParam(required = false) String name, @RequestParam(required = false) String email){
        StudentService.updateStudent(studentId, name, email);
    }
}
