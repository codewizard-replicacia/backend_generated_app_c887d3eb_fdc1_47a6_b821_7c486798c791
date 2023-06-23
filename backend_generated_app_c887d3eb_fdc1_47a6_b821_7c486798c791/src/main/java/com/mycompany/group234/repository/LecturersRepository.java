package com.mycompany.group234.repository;


import com.mycompany.group234.model.Lecturers;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class LecturersRepository extends SimpleJpaRepository<Lecturers, String> {
    private final EntityManager em;
    public LecturersRepository(EntityManager em) {
        super(Lecturers.class, em);
        this.em = em;
    }
    @Override
    public List<Lecturers> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Lecturers\"", Lecturers.class).getResultList();
    }
}