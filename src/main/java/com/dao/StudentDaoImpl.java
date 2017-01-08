package com.dao;

import com.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.List;

@Transactional
@Repository
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext(name = "PersistenceSpringMvcJpaFlyway", type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

    public List<Student> getAllStudents() {
        return entityManager.createQuery("select s from Student s").getResultList();
    }
}
