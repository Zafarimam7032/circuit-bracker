package com.grwts.pojo;

public class CollegeVo {
	private int id;
	private String name;
	private String city;
	private String port;
	
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public CollegeVo() {
		super();
	}
	
	public CollegeVo(int id, String name, String city, String port) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.port = port;
	}
	public int getId() {
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "CollegeVo [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	


}
