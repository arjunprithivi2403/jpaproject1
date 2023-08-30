package com.skcet.Foodreview2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

 
import jakarta.persistence.Table;

@Entity
@Table(name="OrderTable")
public class OrdertabModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Id;

private long orderid;
//private long fid;
private String fname;
private long quantity;
private String hotelname;

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public long getOrderid() {
	return orderid;
}
public void setOrderid(long orderid) {
	this.orderid = orderid;
}
/*public long getFid() {
	return fid;
}
public void setFid(long fid) {
	this.fid = fid;
}*/
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public long getQuantity() {
	return quantity;
}
public void setQuantity(long quantity) {
	this.quantity = quantity;
}
public String getHotelname() {
	return hotelname;
}
public void setHotelname(String hotelname) {
	this.hotelname = hotelname;
}

}