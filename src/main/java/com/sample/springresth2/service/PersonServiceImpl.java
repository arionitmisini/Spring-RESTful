package com.sample.springresth2.service;


import com.sample.springresth2.models.Person;
import com.sample.springresth2.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;


    @Override
    public Iterable<Person> list() {
        return personRepository.findAll();
    }

    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person readById(long id) {
       return personRepository.getOne(id);
    }

    @Override
    public Person findByIdAndUpdate(long id, Person updatedPerson) {
        Person person = personRepository.getOne(id);

        if( updatedPerson.getName() != null ) {
            person.setName(updatedPerson.getName());
        }
        if( updatedPerson.getLastname() != null) {
            person.setLastname(updatedPerson.getLastname());
        }
        if( updatedPerson.getGender() != ' ') {
            person.setGender(updatedPerson.getGender());
        }
        if( updatedPerson.getIpAdress() != null) {
            person.setIpAdress(updatedPerson.getIpAdress());
        }

        return personRepository.save(person);


    }

    @Override
    public void deleteById(long id) {
        personRepository.deleteById(id);
    }

    @Override
    public List<Person> findAllOrderedByNameAsc() {
        return personRepository.findAllByOrderByNameAsc();
    }

    @Override
    public void saveAll(List<Person> people) {
        personRepository.saveAll(people);
    }
}
