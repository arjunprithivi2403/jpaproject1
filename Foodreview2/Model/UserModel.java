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
@Table(name="UserPortal")
public class UserModel {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="uid")
private long Id;;
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
private String username;
private String password;
private String email;

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="f_uid",referencedColumnName = "uid")
private List<MenuModel> menu;

public List<MenuModel> getMenu() {
	return menu;
}
public void setMenu(List<MenuModel> menu) {
	this.menu = menu;
}
public long getUid() {
	return Id;
}
public void setUid(long uid) {
	this.Id = uid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}