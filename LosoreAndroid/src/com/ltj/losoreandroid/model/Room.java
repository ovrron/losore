package com.ltj.losoreandroid.model;

import java.util.ArrayList;
import java.util.List;

public class Room {
	private int idRoom;
	private int roomNo;
	private String personalName;
	private List<Item> items;
	
	public Room() {
		idRoom = 0;
		personalName = "";
		items = new ArrayList<Item>();		
	}

	public int getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getPersonalName() {
		return personalName;
	}

	public void setPersonalName(String personalName) {
		this.personalName = personalName;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public int noOfItems() {
		return items.size();
	}
	
	public double getTotalPrice() {
		double price = 0;
		for(Item item:items) {
			price += item.getTotalPrice();
		}
		return price;
	}
}
