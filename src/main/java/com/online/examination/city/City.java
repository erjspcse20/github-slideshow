package com.online.examination.city;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
 @Id
 private Integer id;
 private String name;
 private String description;
 private Integer stateid;
 
  public City() {
	super();
  }

  public City(Integer id, String name, String description, Integer stateid) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.stateid = stateid;
  }

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getStateid() {
		return stateid;
	}
	
	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}
	  
 
}
