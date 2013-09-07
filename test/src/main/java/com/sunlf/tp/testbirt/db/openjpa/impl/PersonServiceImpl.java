package com.sunlf.tp.testbirt.db.openjpa.impl;



import com.sunlf.tp.testbirt.db.openjpa.Person;
import com.sunlf.tp.testbirt.db.openjpa.PersonService;

import javax.persistence.EntityManager;
import java.util.List;

public class PersonServiceImpl implements PersonService {
    private EntityManager em;
    
    public void setEntityManager(EntityManager em) { 
        this.em = em;
    }

    @Override
    public void add(Person person) {
        em.persist(person);
        em.flush();
    }
    
    public void deleteAll() {
        em.createQuery("delete from Person").executeUpdate();
        em.flush();
    }

    @Override
    public List<Person> getAll() {
        return em.createQuery("select p from Person p", Person.class).getResultList();
    }

}
