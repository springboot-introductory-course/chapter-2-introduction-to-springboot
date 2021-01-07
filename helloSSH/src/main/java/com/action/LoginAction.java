package com.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.entity.User;
import com.opensymphony.xwork2.ActionSupport;

@Component("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String login(){
		user.setUsermessage("ÄãºÃ£¬" + user.getUsername());;
		return SUCCESS;
	}
}
