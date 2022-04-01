package com.javaguides.springboot.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_profile")
public class UserProfile {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long id;
	
	
	private String phoneNumber;
	private String address;
	private LocalDate birthOfDate;
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "userProfile")
	private User user;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}
	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
	
	public UserProfile() {
		
		
	}
	
	public UserProfile(String phoneNumber, String address, LocalDate birthOfDate) {
		super();
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.birthOfDate = birthOfDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
     	
	
}
