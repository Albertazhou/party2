package com.party.entity;

import java.util.Date;

public class Activities {
	private int activity_id;
	private String title;
	private String contents;
	private Date time_begin;
	private Date time_over;
	private String statu;
	private int num;
	private String teacher;
	
	public Activities(int activity_id, String title, String contents, Date time_begin, Date time_over, String statu,
			int num, String teacher) {
		super();
		this.activity_id = activity_id;
		this.title = title;
		this.contents = contents;
		this.time_begin = time_begin;
		this.time_over = time_over;
		this.statu = statu;
		this.num = num;
		this.teacher = teacher;
	}
	public Activities() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getTime_begin() {
		return time_begin;
	}
	public void setTime_begin(Date time_begin) {
		this.time_begin = time_begin;
	}
	public Date getTime_over() {
		return time_over;
	}
	public void setTime_over(Date time_over) {
		this.time_over = time_over;
	}
	public String getStatu() {
		return statu;
	}
	public void setStatu(String statu) {
		this.statu = statu;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	

}
