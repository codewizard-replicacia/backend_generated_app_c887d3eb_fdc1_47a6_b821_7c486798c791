package com.mycompany.group234.repository;


import com.mycompany.group234.model.Students;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class StudentsRepository extends SimpleJpaRepository<Students, String> {
    private final EntityManager em;
    public StudentsRepository(EntityManager em) {
        super(Students.class, em);
        this.em = em;
    }
    @Override
    public List<Students> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Students\"", Students.class).getResultList();
    }
}