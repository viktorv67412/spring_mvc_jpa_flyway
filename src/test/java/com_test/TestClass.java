package com_test;

import com.model.Faculty;
import com.model.Student;
import com.service.FacultyService;
import com.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class TestClass {

    @Test
    public void getStudents() {
        List<Student> students = new ArrayList<Student>(1);
        students.add(new Student());
        StudentService studentService = mock(StudentService.class);
        when(studentService.getAllStudents()).thenReturn(students);
    }

    @Test
    public void getFaculty() {
        List<Faculty> faculties = new ArrayList<Faculty>(1);
        faculties.add(new Faculty());
        FacultyService facultyService = mock(FacultyService.class);
        when(facultyService.getAllFaculties()).thenReturn(faculties);
    }
}
