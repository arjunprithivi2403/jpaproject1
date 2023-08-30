package com.skcet.Foodreview2.Controller;


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


import com.skcet.Foodreview2.Model.UserModel;
import com.skcet.Foodreview2.Service.UserService;



@RestController
public class UserContoller {
	@Autowired
   public UserService userv;
	
	@PostMapping("/post")
	public String postUser(@RequestBody UserModel hr) {
		
		userv.saveUser(hr);
		return "data saved";
	}
	@GetMapping("/get")
	public List<UserModel> getUserInfo(){
		return userv.getUser();
	}
	@PutMapping("/update")
	public UserModel updateUserInfo(@RequestBody UserModel hm) {
		return userv.updateUser(hm);
	}
	@DeleteMapping("/delete/{UId}")
	public String deleteds(@PathVariable("UId")int UId) {
		userv.deleteUser(UId);
		return "name with Id "+UId+" is deleted";}
	@DeleteMapping("/reqparam")public String removeByreq(@RequestParam("id")int id)
	{
		userv.deleteUser(id);
		return "USER with ID "+id+" is deleted";
		
	}
		@DeleteMapping("/deleteUserif/{id}")
	
	public ResponseEntity<String> deleteUserInfo(@PathVariable int id){
		boolean deleted = userv.deleteUserif(id);
		if(deleted) {
			return ResponseEntity.ok("USER with ID "+id+" deleted successfully");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("USER with ID "+id+" not found");
		}
	}
	//getUserbyId
	@GetMapping("/users/{userId}")
	public ResponseEntity<?> getUserbyId(@PathVariable int userId){
		Optional<UserModel> user = userv.getUserId(userId);
		if(user!=null) {
			return ResponseEntity.ok(user);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with ID ");
	}
	@GetMapping("/sortuser/{name}")
	public List<UserModel> sortByAsc(@PathVariable("name") String name){
		return userv.sortByAsc(name);
	}
	//Pagination
		@GetMapping("/paginationuser/{num}/{size}")
		public List<UserModel> paginationEx(@PathVariable("num") int num,@PathVariable("size") int size)
		{
			return userv.pagination(num,size);
		}
		//pagination and sorting
		@GetMapping("/paginationAndSortuser/{num}/{size}/{name}")
		public List<UserModel> paginationAndSort(@PathVariable("num") int num,@PathVariable("size") int size,@PathVariable("name")  String name)
		{
			return userv.paginationAndSorting(num,size,name);
		}
	
	
	}