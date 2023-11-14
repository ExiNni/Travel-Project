package com.kr.user_info;

import java.util.Date;

public class User {
	
	private String USER_ID;
	private String USER_PW;
	private String USER_EMAIL;
	private String USER_PHONE;
	private String USER_NAME;
	private String USER_SEX;
	private Date USER_AGE;
	private Date USER_DATE;
	
	
	public User() {
		super();
	}


	public User(String uSER_ID, String uSER_PW, String uSER_EMAIL, String uSER_PHONE, String uSER_NAME, String uSER_SEX,
			Date uSER_AGE, Date uSER_DATE) {
		super();
		USER_ID = uSER_ID;
		USER_PW = uSER_PW;
		USER_EMAIL = uSER_EMAIL;
		USER_PHONE = uSER_PHONE;
		USER_NAME = uSER_NAME;
		USER_SEX = uSER_SEX;
		USER_AGE = uSER_AGE;
		USER_DATE = uSER_DATE;
	}


	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}


	public void setUSER_PW(String uSER_PW) {
		USER_PW = uSER_PW;
	}


	public void setUSER_EMAIL(String uSER_EMAIL) {
		USER_EMAIL = uSER_EMAIL;
	}


	public void setUSER_PHONE(String uSER_PHONE) {
		USER_PHONE = uSER_PHONE;
	}


	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}


	public void setUSER_SEX(String uSER_SEX) {
		USER_SEX = uSER_SEX;
	}


	public void setUSER_AGE(Date uSER_AGE) {
		USER_AGE = uSER_AGE;
	}


	public void setUSER_DATE(Date uSER_DATE) {
		USER_DATE = uSER_DATE;
	}


	public String getUSER_ID() {
		return USER_ID;
	}


	public String getUSER_PW() {
		return USER_PW;
	}


	public String getUSER_EMAIL() {
		return USER_EMAIL;
	}


	public String getUSER_PHONE() {
		return USER_PHONE;
	}


	public String getUSER_NAME() {
		return USER_NAME;
	}


	public String getUSER_SEX() {
		return USER_SEX;
	}


	public Date getUSER_AGE() {
		return USER_AGE;
	}


	public Date getUSER_DATE() {
		return USER_DATE;
	}

}
