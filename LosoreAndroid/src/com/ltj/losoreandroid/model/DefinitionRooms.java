package com.ltj.losoreandroid.model;

import java.util.ArrayList;
import java.util.List;

public class DefinitionRooms {
	List<DefinitionRoom> definitionRooms;
	
	public DefinitionRooms() {
		definitionRooms = new ArrayList<DefinitionRoom>();
	}
	
	
	public String getRoomName(int id) {
		for(DefinitionRoom definitionRoom:definitionRooms) {
			if(definitionRoom.getId()==id) {
				return definitionRoom.getName();
			}
		}
		return null;
	}
	
	public List<String> getRoomNames() {
		List<String> roomNames = new ArrayList<String>();
		for(DefinitionRoom definitionRoom:definitionRooms) {
			roomNames.add(definitionRoom.getName());
		}
		return roomNames;
	}
	
}
