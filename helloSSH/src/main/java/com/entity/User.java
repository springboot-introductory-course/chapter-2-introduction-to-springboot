package com.entity;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String username;
	
	private String usermessage;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsermessage() {
		return usermessage;
	}
	
	public void setUsermessage(String usermessage) {
		this.usermessage = usermessage;
	}
}
