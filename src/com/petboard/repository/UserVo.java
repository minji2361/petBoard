package com.petboard.repository;

import java.sql.Timestamp;

public class UserVo {
	
	private int userNumber;
	private String email;
	private String password;
	private String name;
	private String pet;
	private Timestamp joinDate;
	private char userLevel;
	private char userStatus;
	private char emailVerify;
	
	public UserVo() {}
	
	public UserVo(int userNumber, String email, String password, String name, String pet, Timestamp joinDate,
			char userLevel, char userStatus, char emailVerify) {
		super();
		this.userNumber = userNumber;
		this.email = email;
		this.password = password;
		this.name = name;
		this.pet = pet;
		this.joinDate = joinDate;
		this.userLevel = userLevel;
		this.userStatus = userStatus;
		this.emailVerify = emailVerify;
	}

	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	public Timestamp getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Timestamp joinDate) {
		this.joinDate = joinDate;
	}
	public char getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(char userLevel) {
		this.userLevel = userLevel;
	}
	public char getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(char userStatus) {
		this.userStatus = userStatus;
	}
	public char getEmailVerify() {
		return emailVerify;
	}
	public void setEmailVerify(char emailVerify) {
		this.emailVerify = emailVerify;
	}
	
	

}
