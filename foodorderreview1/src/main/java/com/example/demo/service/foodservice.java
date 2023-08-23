package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.foodmodel;
import com.example.demo.repository.foodrepo;


@Service
public class foodservice {
	@Autowired
	public foodrepo hrepo;
	
	public String saveFood(foodmodel h) {
		hrepo.save(h);
		return "Data is saved to database";
	}
	public List<foodmodel> getfood(){
		return hrepo.findAll();
	}
	public foodmodel updateFood(foodmodel hm) {
		return hrepo.saveAndFlush(hm);
	}
	public void deleteFood(int food_id) {
		System.out.println("Deleted");
		hrepo.deleteById(food_id);
	}
	// delete if id is present
	public boolean deleteFoodif(int foodId) {
		if(hrepo.existsById(foodId)) {
			hrepo.deleteById(foodId);
			return true;
		}
		return false;
	}
	public Optional<foodmodel> getUserId(int userId){
		  Optional <foodmodel> food=hrepo.findById(userId);
		  if(food.isPresent()) {
			  return food;
		  }
		  return null;
		  
	  }
	

}