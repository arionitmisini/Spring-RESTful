package com.sample.springresth2.repository;

import com.sample.springresth2.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    // Custom query to get people data ordered by name by ascending
    List<Person> findAllByOrderByNameAsc();

}
