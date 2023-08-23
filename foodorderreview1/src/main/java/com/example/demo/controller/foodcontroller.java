package com.example.demo.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.foodmodel;
import com.example.demo.service.foodservice;

@RestController
public class foodcontroller {
	@Autowired
	public foodservice hserv;
	
	@PostMapping("/postFood")
	public String postFood(@RequestBody foodmodel hr) {
		
		hserv.saveFood(hr);
		return "data saved";
	}
	@GetMapping("/getFood")
	public List<foodmodel> getHotelInfo(){
		return hserv.getfood();
	}
	@PutMapping("/updateFood")
	public foodmodel updateFoodInfo(@RequestBody foodmodel hm) {
		return hserv.updateFood(hm);
	}
	
	@DeleteMapping("/deleteFoodif/{id}")
	public ResponseEntity<String>deleteFoodInfo(@PathVariable int id){
		boolean deleted =hserv.deleteFoodif(id);
		if(deleted) {
			return ResponseEntity.ok("Food with Id "+id+" deleted successfully");
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food with ID "+  id+" not found");
		}
	}
	@GetMapping("/users/{userId}")
	public ResponseEntity<?> getUserbyId(@PathVariable int userId){
		Optional<foodmodel> hotel = hserv.getUserId(userId);
		if(hotel!=null) {
			return ResponseEntity.ok(hotel);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with ID ");
	}
	@DeleteMapping("/reparm/{id}")
	public String removedRequestParm(@RequestParam("id") int id) {
		hserv.deleteFood(id);
		return "Hotel with Id "+id+" is deleted";
	

	}
}
