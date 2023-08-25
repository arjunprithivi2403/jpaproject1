package com.example.demo.Day7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.example.demo.Day7.model.model;
import com.example.demo.Day7.repo.repo;

import jakarta.transaction.Transactional;

@Service
public class service {

	@Autowired
    public repo rep;
	
	//get all the rows
	public List<model> getAllrows()
	{
		return rep.getAllRows();
	}
	
	//get specific data
	public List<model>  getspecificrows(String d,String id)
	{
		return rep.getSpecRows(d, id);
	}
	
	//update
	public Integer updateRow(String d,int id)
	{
		return rep.updateById(d, id);
	}
	
	//delete
	public int deleteByid(int id)
	{
		return rep.deleted(id);
	}
	
	//same name
	public List<model> getbyName(String d)
    {
    	return rep.getbyname(d);
    }
    //using model menu name
   public List<model> getBynamemodel(String name)
    {
	return rep.getbyname(name);
    }
   //using model menu id delete
   @Modifying
   @Transactional
   public Integer getBymodelid(int id)
    {
	       return rep.nav(id);
    }
}
