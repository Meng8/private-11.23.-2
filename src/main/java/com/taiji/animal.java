package com.taiji;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class animal{
	private String name;
	private String color;
	private List<String> person;
	private Map<String,String> cool;
	private Set<String> iphone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<String> getPerson() {
		return person;
	}
	public void setPerson(List<String> person) {
		this.person = person;
	}
	public Map<String, String> getCool() {
		return cool;
	}
	public void setCool(Map<String, String> cool) {
		this.cool = cool;
	}
	public Set<String> getIphone() {
		return iphone;
	}
	public void setIphone(Set<String> iphone) {
		this.iphone = iphone;
	}
	public animal(String name, String color, List<String> person, Map<String, String> cool, Set<String> iphone) {
		super();
		this.name = name;
		this.color = color;
		this.person = person;
		this.cool = cool;
		this.iphone = iphone;
	}
	public animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
