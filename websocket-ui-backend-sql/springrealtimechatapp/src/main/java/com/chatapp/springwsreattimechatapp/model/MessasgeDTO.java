package com.chatapp.springwsreattimechatapp.model;



public class MessasgeDTO implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private String message;
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
