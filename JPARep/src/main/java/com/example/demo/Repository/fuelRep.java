package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.PetrolBunk;


public interface fuelRep extends JpaRepository<PetrolBunk, Integer> {

}