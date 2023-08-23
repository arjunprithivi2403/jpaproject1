package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.foodmodel;

public interface foodrepo extends JpaRepository<foodmodel, Integer> {

}