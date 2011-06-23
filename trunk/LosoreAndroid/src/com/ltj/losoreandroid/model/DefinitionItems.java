package com.ltj.losoreandroid.model;

import java.util.ArrayList;
import java.util.List;

public class DefinitionItems {
	List<DefinitionItem> definitionItems;
	
	public DefinitionItems() {
		definitionItems = new ArrayList<DefinitionItem>();
	}
	
	public String getItemName(int id) {
		for(DefinitionItem definitionItem:definitionItems) {
			if(definitionItem.getId()==id) {
				return definitionItem.getName();
			}
		}
		return null;
	}
	
	public List<String> getItemNames() {
		List<String> ItemNames = new ArrayList<String>();
		for(DefinitionItem definitionItem:definitionItems) {
			ItemNames.add(definitionItem.getName());
		}
		return ItemNames;
	}
	
	public List<String> getItemNamesWithCategory(int idCategory) {
		List<String> ItemNames = new ArrayList<String>();
		for(DefinitionItem definitionItem:definitionItems) {
			if(definitionItem.getIdCategory()==idCategory) {
				ItemNames.add(definitionItem.getName());
			}
		}
		return ItemNames;
	}	
}
