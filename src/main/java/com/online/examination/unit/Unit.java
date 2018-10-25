package com.online.examination.unit;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Unit {
	
	@Id
	private Integer id;
	private Integer subjectid;
	private String name;
	private String description;
	
	public Unit() {
		super();
	}

	public Unit(Integer id, Integer subjectid, String name, String description) {
		super();
		this.id = id;
		this.subjectid = subjectid;
		this.name = name;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(Integer subjectid) {
		this.subjectid = subjectid;
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
	
	
	
}
