package com.sunlf.tp.db.openjpa;

import java.util.List;

public interface PersonService {
    void add(Person person);
    void deleteAll();
    List<Person> getAll();
}
