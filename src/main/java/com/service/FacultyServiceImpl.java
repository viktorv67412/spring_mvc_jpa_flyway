package com.service;

import com.dao.FacultyDao;
import com.model.Faculty;
import com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    private FacultyDao facultyDao;

    public List<Faculty> getAllFaculties() {
        return facultyDao.getAllFaculties();
    }

    public Object getFacultyByName(String name) {
        List<Faculty> students = facultyDao.getAllFaculties();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return students.get(i);
            }
        }
        return null;
    }
}
