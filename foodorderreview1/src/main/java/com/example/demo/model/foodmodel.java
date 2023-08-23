package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Foodportal")
public class foodmodel {
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int foodId;
		private String foodName;
		private int price;
		private int contactnumber;
		private int no_of_item;
		private String address;
		public int getFoodId() {
			return foodId;
		}
		public void setFoodId(int foodId) {
			this.foodId = foodId;
		}
		public String getFoodName() {
			return foodName;
		}
		public void setFoodName(String foodName) {
			this.foodName = foodName;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getContactnumber() {
			return contactnumber;
		}
		public void setContactnumber(int contactnumber) {
			this.contactnumber = contactnumber;
		}
		public int getNo_of_item() {
			return no_of_item;
		}
		public void setNo_of_item(int no_of_item) {
			this.no_of_item = no_of_item;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
}
