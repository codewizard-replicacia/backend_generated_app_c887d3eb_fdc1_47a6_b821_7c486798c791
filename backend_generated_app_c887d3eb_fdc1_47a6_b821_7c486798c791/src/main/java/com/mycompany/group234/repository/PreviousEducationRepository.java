package com.mycompany.group234.repository;


import com.mycompany.group234.model.PreviousEducation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PreviousEducationRepository extends SimpleJpaRepository<PreviousEducation, String> {
    private final EntityManager em;
    public PreviousEducationRepository(EntityManager em) {
        super(PreviousEducation.class, em);
        this.em = em;
    }
    @Override
    public List<PreviousEducation> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"PreviousEducation\"", PreviousEducation.class).getResultList();
    }
}