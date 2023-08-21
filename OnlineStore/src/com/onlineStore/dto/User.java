package com.onlineStore.dto;

public class User {
	private String userName;
	private String	emailId;
	private String	passWord;
	private int superCoins;
	private int role;
	
	
	public User() {
		super();
	}
	public User(String userName, String emailId, String passWord, int superCoins) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.passWord = passWord;
		this.superCoins = superCoins;
		//this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getSuperCoins() {
		return superCoins;
	}
	public void setSuperCoins(int superCoins) {
		this.superCoins = superCoins;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
	


}
