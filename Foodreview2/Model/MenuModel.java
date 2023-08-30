package com.skcet.Foodreview2.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="MenuCard")
public class MenuModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
private int Id;
private int fid;
private String foodname;
private String description;
private int price;
private String category;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="fk_uid",referencedColumnName = "fid")
private List<OrdertabModel> ordertable;

public List<OrdertabModel> getOrdertable() {
	return ordertable;
}
public void setOrdertable(List<OrdertabModel> ordertable) {
	this.ordertable = ordertable;
}
public long getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getFoodname() {
	return foodname;
}
public void setFoodname(String foodname) {
	this.foodname = foodname;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}

}