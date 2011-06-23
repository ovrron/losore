package com.ltj.losoreandroid.model;

public class Holder {
	
	// Singleton type class
	private static Holder INSTANCE = null; 
	private DefinitionRooms definitionRooms = null;
	private DefinitionCategories definitionCategories = null;
	private DefinitionItems definitionItems = null;
	
	// Instantiation prevention
	private Holder() {
	}
	
	public static Holder getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new Holder();
		}
		return INSTANCE;
	}
	
	
	
}
