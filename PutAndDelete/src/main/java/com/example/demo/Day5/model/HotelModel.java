package com.example.demo.Day5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HotelModel {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int hotalid;
	@Column(name="Hotelname")
	private String name;
	private String located;
	public int getHotalid() {
		return hotalid;
	}
	public void setHotalid(int hotalid) {
		this.hotalid = hotalid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocated() {
		return located;
	}
	public void setLocated(String located) {
		this.located = located;
	}
}