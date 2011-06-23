package com.ltj.losoreandroid.model;

public class DefinitionCategory {
	private int id;
	private String name;
	
	public DefinitionCategory() {
		id = 0;
		name = "";
	}
	
	public DefinitionCategory(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
