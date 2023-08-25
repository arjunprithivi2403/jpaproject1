package com.example.demo.Day7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Day7.model.model;
import com.example.demo.Day7.service.service;

@RestController
public class controller {
	
	@Autowired
	@Lazy
	public service ser;
	
	
	
	  //get all the data
	  @GetMapping("/getAllrows")
	   public List<model> getallRows()
	   {
     		return ser.getAllrows();
	    }
		//get specific data
	   @GetMapping("getAllrowss/{d}/{p}")
	   public List<model> getSpecRows(@PathVariable String d,@PathVariable String p)
		{
			return ser.getspecificrows(d,p);
	     }
	//delete
	@DeleteMapping("/deleterow/{id}")
	public String deleted(@PathVariable("id") int id)
	{
		return ser.deleteByid(id)+" rows deleted";
	}
	
	//update
	@PutMapping("/updateRow/{d}/{id}")
	public String updateById(@PathVariable("d") String d,@PathVariable("id") int id)
	{
		return ser.updateRow(d,id)+" updated";
	}
	
	@GetMapping("/likeAllrows/{d}")
	public List<model> getbyname(@PathVariable("d") String d)
	{
		return ser.getbyName(d);
	}
	//using model query
	@GetMapping("/get/{name}")
	public List<model> getByname(@PathVariable("name") String name)
	{
		return ser.getBynamemodel(name);
	}
	//using model id
	@DeleteMapping("/thala/{id}")
	public String nav (@PathVariable("id") int id)
	{
	return ser.getBymodelid(id)+ " Deleted";
	}

}