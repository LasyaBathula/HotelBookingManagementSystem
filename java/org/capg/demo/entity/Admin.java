package org.capg.demo.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")

public class Admin {
	
	public Admin(int adim_id, String admin_name, String password) {
		super();
		this.adim_id = adim_id;
		this.admin_name = admin_name;
		this.password = password;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int adim_id;
String admin_name;
String password;
public int getAdim_id() {
	return adim_id;
}
public void setAdim_id(int adim_id) {
	this.adim_id = adim_id;
}
public String getAdmin_name() {
	return admin_name;
}
public void setAdmin_name(String admin_name) {
	this.admin_name = admin_name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
