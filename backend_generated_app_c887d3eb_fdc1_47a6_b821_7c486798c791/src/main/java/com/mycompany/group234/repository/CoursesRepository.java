package com.mycompany.group234.repository;


import com.mycompany.group234.model.Courses;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class CoursesRepository extends SimpleJpaRepository<Courses, String> {
    private final EntityManager em;
    public CoursesRepository(EntityManager em) {
        super(Courses.class, em);
        this.em = em;
    }
    @Override
    public List<Courses> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Courses\"", Courses.class).getResultList();
    }
}