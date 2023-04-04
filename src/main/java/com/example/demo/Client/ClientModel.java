package com.example.demo.Client;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ClientModel {
	
	@Id
	private String id;
 public ClientModel(String id, String name, String date_of_Birth, String address, String contact_information) {
		super();
		this.id = id;
		Name = name;
		Date_of_Birth = date_of_Birth;
		Address = address;
		Contact_information = contact_information;
	}

	
public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
private String Name;
 private String Date_of_Birth;
 private String Address;
 private String Contact_information;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDate_of_Birth() {
	return Date_of_Birth;
}
public void setDate_of_Birth(String date_of_Birth) {
	Date_of_Birth = date_of_Birth;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}

public String getContact_information() {
	return Contact_information;
}
public void setContact_information(String contact_information) {
	Contact_information = contact_information;
}
}
