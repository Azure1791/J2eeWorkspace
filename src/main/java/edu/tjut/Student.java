package edu.tjut;

public class Student {
	private int id;
	private String name;
	private String address;
	
	public Student() {
		
	}
	public Student(int id,String name,String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
//public class 
//属性都是私有的
//公共的get set方法
//