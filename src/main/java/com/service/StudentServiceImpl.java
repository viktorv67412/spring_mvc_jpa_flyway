package com.service;

import com.dao.StudentDao;
import com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
