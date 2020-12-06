package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Person;
import com.example.demo.Service.PersonService;

@RequestMapping("/api")
@RestController
public class PersonController {
	
	public final PersonService personservice ;
	
	
	@Autowired
	public PersonController(PersonService personservice) {
		super();
		this.personservice = personservice;
	}

	@PostMapping
	public int addPerson(@RequestBody Person person) {
		return personservice.addPerson(person);
	}

	@GetMapping
	public List<Person> selctAllPeople() {
		return personservice.selectAllPeople();
	}
	
	@GetMapping(path="{id}")
	public Optional<Person> selectPersonById(@PathVariable("id") UUID id){
		return personservice.selectPersonById(id);
	}
}
