package com.ltj.losoreandroid.model;

public class DefinitionItem {
	private int id;
	private String name;
	private int idCategory;
	private int idDepreciationRule;
	 
	public DefinitionItem() {
		id = 0;
		name = "";
		idCategory = 0;
		idDepreciationRule = 0;
	}
	
	public DefinitionItem(int id, String name, int idCategory, int idDepreciationRule) {
		this.id = id;
		this.name = name;
		this.idCategory = idCategory;
		this.idDepreciationRule = idDepreciationRule;
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

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public int getIdDepreciationRule() {
		return idDepreciationRule;
	}

	public void setIdDepreciationRule(int idDepreciationRule) {
		this.idDepreciationRule = idDepreciationRule;
	}	 
}
