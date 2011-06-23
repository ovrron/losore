package com.ltj.losoreandroid.model;

import java.util.ArrayList;
import java.util.List;

public class DefinitionCategories {
	List<DefinitionCategory> definitionCategories;
	
	public DefinitionCategories() {
		definitionCategories = new ArrayList<DefinitionCategory>();
	}
	
	public String getCategoryName(int id) {
		for(DefinitionCategory definitionCategory:definitionCategories) {
			if(definitionCategory.getId()==id) {
				return definitionCategory.getName();
			}
		}
		return null;
	}
	
	public List<String> getCategoryNames() {
		List<String> categoryNames = new ArrayList<String>();
		for(DefinitionCategory definitionCategory:definitionCategories) {
			categoryNames.add(definitionCategory.getName());
		}
		return categoryNames;
	}
	
}
