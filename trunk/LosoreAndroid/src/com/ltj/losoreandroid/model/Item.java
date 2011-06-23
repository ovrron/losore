package com.ltj.losoreandroid.model;

public class Item {
	private int idCategory;
	private int idItem;
	private String brand;
	private int amount;
	private int age;
	private double newPrice;
	
	public Item() {
		idCategory = 0;
		idItem = 0;
		brand = "";
		amount = 0;
		age = 0;
		newPrice = 0;
	}

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
	}
	
	public double getTotalPrice() {
		return newPrice*amount;
	}
	
	//TODO generer xml streng
	public String toXML() {
		return null;
	}
}
