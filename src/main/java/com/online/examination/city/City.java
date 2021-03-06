package com.online.examination.city;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class City {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	private String name;
	private String uuid;
	private String stateId;
	private String description;
	private Date createdAt;
	private Boolean isDeleted;
	private Boolean isActive;
	private String createdBy;
 
  public City() {
	super();
  }

  public City(Integer id, String name, String uuid, String stateId, String description, Date createdAt, Boolean isDeleted,
			Boolean isActive, String createdBy) {
		super();
		this.id = id;
		this.name = name;
		this.uuid = uuid;
		this.stateId = stateId;
		this.description = description;
		this.createdAt = createdAt;
		this.isDeleted = isDeleted;
		this.isActive = isActive;
		this.createdBy = createdBy;
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
	
	public String getUuid() {
		return uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	public String getStateId() {
		return stateId;
	}
	
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public Boolean getIsActive() {
		return isActive;
	}
	
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
