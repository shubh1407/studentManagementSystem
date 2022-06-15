package com.studentManagement.bean;
//encapsulation
public class StudentRecord {

	private int rollNo;
	private String name;
	private String batch;

	public StudentRecord(int rollNo, String name, String batch) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.batch = batch;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "StudentRecord [rollNo=" + rollNo + ", name=" + name + ", batch=" + batch + "]";
	}
	
}
