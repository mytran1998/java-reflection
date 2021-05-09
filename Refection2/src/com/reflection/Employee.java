package com.reflection;

public class Employee {

	private String name;

	private String address;

	private String city;

	public Employee(String name, String address, String city) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
