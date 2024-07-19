package com.kishoreb.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column
int id;
@Column
String Name;
@Column
String Role;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}

}
