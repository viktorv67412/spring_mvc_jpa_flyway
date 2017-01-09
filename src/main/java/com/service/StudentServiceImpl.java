package com.service;

import com.dao.StudentDao;
import com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Object getStudentByName(String name) {

        List<Student> students = studentDao.getAllStudents();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return students.get(i);
            }
        }
        return null;
    }

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }
}
