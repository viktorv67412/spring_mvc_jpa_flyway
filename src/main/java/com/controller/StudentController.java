package com.controller;

import com.model.Faculty;
import com.model.Student;
import com.service.FacultyService;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private FacultyService facultyService;

    @RequestMapping(value = "/studentList", method = RequestMethod.GET)
    public String getAllStudents(Model model) {
        model.addAttribute("allStudents", studentService.getAllStudents());
        return "studentList";
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String getStudent(Model model) {
        model.addAttribute("student", studentService.getStudentByName("student1"));
        return "index";
    }
}
