package com.example.demo.Model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	
	private final UUID id ;
	private final String name ;
	private final String last_name ;
	private final String level ;
	
	public Person(@JsonProperty("id") UUID id,
				  @JsonProperty("name") String name,
				  @JsonProperty("last_name") String last_name,
				  @JsonProperty("level")String level) 
	{
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.level = level;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getLevel() {
		return level;
	}
	
}