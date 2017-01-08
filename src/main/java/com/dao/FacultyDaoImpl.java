package com.dao;

import com.model.Faculty;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.List;

@Transactional
@Repository
public class FacultyDaoImpl implements FacultyDao {

    @PersistenceContext(name = "PersistenceSpringMvcJpaFlyway", type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

    public List<Faculty> getAllFaculties() {
        return entityManager.createQuery("select f from Faculty f").getResultList();
    }
}
