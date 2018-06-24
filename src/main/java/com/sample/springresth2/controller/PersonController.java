package com.sample.springresth2.controller;

import com.sample.springresth2.models.Person;
import com.sample.springresth2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping
    public Iterable<Person> list() {
        return personService.list();
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
        return personService.create(person);
    }

    @GetMapping("/{id}")
    public Person read(@PathVariable long id) {
        return personService.readById(id);
    }

    @PutMapping("/{id}")
    public Person findByIdAndUpdate(@PathVariable long id, @RequestBody Person updatedPerson) {
        return personService.findByIdAndUpdate(id, updatedPerson);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id) {
        personService.deleteById(id);
        return "{\"message\": Person successfully deleted!}";
    }

    @RequestMapping(value = "/sort/name", method = RequestMethod.GET)
    public Iterable<Person> getPeopleOrderedByNameAsc() {
        return personService.findAllOrderedByNameAsc();
    }

}
