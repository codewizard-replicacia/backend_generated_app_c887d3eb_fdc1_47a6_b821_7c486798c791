package com.mycompany.group234.repository;


import com.mycompany.group234.model.Subjects;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class SubjectsRepository extends SimpleJpaRepository<Subjects, String> {
    private final EntityManager em;
    public SubjectsRepository(EntityManager em) {
        super(Subjects.class, em);
        this.em = em;
    }
    @Override
    public List<Subjects> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Subjects\"", Subjects.class).getResultList();
    }
}