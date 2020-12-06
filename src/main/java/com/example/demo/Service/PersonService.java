package com.example.demo.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.PersonDao;
import com.example.demo.Model.Person;

@Service
public class PersonService {

	private final PersonDao persondao ;

	@Autowired
	public PersonService(@Qualifier("fakedata") PersonDao persondao) {
		super();
		this.persondao = persondao;
	}
	
	
	public int addPerson(Person person) {
		return persondao.insertPerson(person);
	}
	
	public List<Person> selectAllPeople(){
		return persondao.selectAllPeople();
	}
	
	public Optional<Person> selectPersonById(UUID id){
		return persondao.selectPersonById(id);
	}
}
