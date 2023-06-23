package com.mycompany.group234.repository;


import com.mycompany.group234.model.Departments;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class DepartmentsRepository extends SimpleJpaRepository<Departments, String> {
    private final EntityManager em;
    public DepartmentsRepository(EntityManager em) {
        super(Departments.class, em);
        this.em = em;
    }
    @Override
    public List<Departments> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Departments\"", Departments.class).getResultList();
    }
}