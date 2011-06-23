package com.ltj.losoreandroid.model;

import java.util.ArrayList;
import java.util.List;

public class House {
	List<Room> rooms;
	
	public House() {
		rooms = new ArrayList<Room>();
	}
	
	public double getTotalPrice() {
		double price = 0;
		for(Room room:rooms) {
			price += room.getTotalPrice();
		}
		return price;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
	public void addRoom(Room room) {
		rooms.add(room);
	}
}
