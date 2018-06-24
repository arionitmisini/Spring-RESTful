package com.sample.springresth2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.springresth2.models.Person;
import com.sample.springresth2.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class SpringRestH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestH2Application.class, args);

	}

	@Bean
	CommandLineRunner runner(PersonService personService) {
		return args -> {
			ObjectMapper mapper = new ObjectMapper();


			// typeReference references the list of Person Objects
			TypeReference<List<Person>> typeReference = new TypeReference<List<Person>>(){};
			// inputStream will get as resource the JSON file
			InputStream inputStream = TypeReference.class.getResourceAsStream("/mock-data/MOCK_DATA.json");
			try {
				/* Mapping the values from JSON file to Person List typeReference
				 * Using save() method we will save JSON data
				 * if successfully saved a message will prit out in console
				 */
				List<Person> people = mapper.readValue(inputStream, typeReference);
				personService.saveAll(people);
				System.out.println("People data successfully saved!");
			} catch (IOException e) {
				// If there was an error mapping and saving JSON data, error will print out in console
				System.out.println("Unable to save people data: " + e.getMessage());
			}
		};
	}

}
