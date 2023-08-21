package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PetrolBunk;
import com.example.demo.Repository.fuelRep;

@Service
public class fuelService {
	@Autowired
	fuelRep frepo;
	
	public PetrolBunk saveDetails(PetrolBunk p)
	{
		return frepo.save(p);
	}
	
	public List<PetrolBunk> getDetails()
	{
		return frepo.findAll();
	}
}