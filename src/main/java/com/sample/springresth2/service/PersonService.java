package com.sample.springresth2.service;

import com.sample.springresth2.models.Person;

import java.util.List;

public interface PersonService {
    Iterable<Person> list();

    Person create(Person person);

    Person readById(long id);

    Person findByIdAndUpdate(long id, Person updatedPerson);

    void deleteById(long id);

    List<Person> findAllOrderedByNameAsc();

    void saveAll(List<Person> people);


}
