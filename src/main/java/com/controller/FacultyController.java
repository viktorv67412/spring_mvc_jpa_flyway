package com.controller;

import com.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/faculty")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @RequestMapping(value = "/facultyList", method = RequestMethod.GET)
    public String getAllFaculties(Model model) {
        model.addAttribute("allFaculties", facultyService.getAllFaculties());
        return "facultyList";
    }

    @RequestMapping(value = "/faculty", method = RequestMethod.GET)
    public String getFaculty(Model model) {
        model.addAttribute("student", facultyService.getFacultyByName("computer_science"));
        return "index";
    }
}
