package com.skcet.Foodreview2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.skcet.Foodreview2.Model.UserModel;
import com.skcet.Foodreview2.Reposotory.UserRepo;




@Service
public class UserService {
 @Autowired
	public  UserRepo urepo;
 
  public String saveUser(UserModel h) {
	  urepo.save(h);
	  return "Data is saved to database";
  }
  public List<UserModel> getUser(){
	  return urepo.findAll();
  }
  public UserModel updateUser(UserModel hm) {
	  return urepo.saveAndFlush(hm);
  }
  public boolean deleteUserif(int uid) {
	  if(urepo.existsById(uid)) {
		  urepo.deleteById(uid);
		  return true;
	  }
	  return false;
  }
  public void deleteUser(int uid) {
	  System.out.println("Deleted");
	  urepo.deleteById(uid);
  }
  public Optional<UserModel> getUserId(int uid){
	  Optional <UserModel> hotel=urepo.findById(uid);
	  if(hotel.isPresent()) {
		  return hotel;
	  }
	  return null;
	  
  }
  public List<UserModel> sortByAsc(String name){
		 // return frep.findAll(Sort.by(name).descending());
		  return urepo.findAll(Sort.by(name).ascending());
	  }
	  //pagination
	  public List<UserModel> pagination(int pageNo,int pageSize){
		  Page<UserModel> cont=urepo.findAll(PageRequest.of(pageNo,pageSize));
		  return cont.getContent();
	  }
	//and sorting
	  public List<UserModel> paginationAndSorting(int pageNo,int pageSize,String name)
	  {
		  Page<UserModel> cont1=urepo.findAll(PageRequest.of(pageNo, pageSize,Sort.by(name)));
		  return cont1.getContent();
	  }
  
}