package com.service;

import com.dao.FacultyDao;
import com.model.Faculty;
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
}
