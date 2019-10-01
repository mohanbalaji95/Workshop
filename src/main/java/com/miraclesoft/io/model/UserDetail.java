package com.miraclesoft.io.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class UserDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int uId;
	
	@Column(name="AGE")
	private int age;
	@Column(name="HEIGHT")
	private int height;
	@Column(name="WEIGHT")
	private int weight;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public UserDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetail(int uId, int age, int height, int weight) {
		super();
		this.uId = uId;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
}
