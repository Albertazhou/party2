package com.party.entity;

public class Users {
	private String user_id;
	private String passwd;
	private String user_name;
	private String stu_class;
	private String statu;
	private int period;
	private int stus;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//积极分子
	public Users(String user_id, String passwd, String user_name, String stu_class, String statu, int period) {
		super();
		this.user_id = user_id;
		this.passwd = passwd;
		this.user_name = user_name;
		this.stu_class = stu_class;
		this.statu = statu;
		this.period = period;
	}
	
	//党员
	public Users(String user_id, String passwd, String user_name, String statu, int stus) {
		super();
		this.user_id = user_id;
		this.passwd = passwd;
		this.user_name = user_name;
		this.statu = statu;
		this.stus = stus;
	}
	
	
	

	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getStu_class() {
		return stu_class;
	}
	public void setStu_class(String stu_class) {
		this.stu_class = stu_class;
	}
	public String getStatu() {
		return statu;
	}
	public void setStatu(String statu) {
		this.statu = statu;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getStus() {
		return stus;
	}
	public void setStus(int stus) {
		this.stus = stus;
	}
	
	
	

}
