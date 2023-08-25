package com.example.demo.Day7.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Day7.model.model;

import jakarta.transaction.Transactional;

public interface repo extends JpaRepository<model, Integer>{
	
	@Query(value="select * from general3",nativeQuery=true)
	public List<model> getAllRows();

	@Query(value="select*from general3 where place=:d and age=:p",nativeQuery=true )
	public List<model> getSpecRows(@Param("d")String d,@Param("p")String p);
	
	@Query(value="select*from general3 where general3 like %?1",nativeQuery=true )
	public List<model> getbyname(@Param("d")String d);
	
	//delete using native query
	@Modifying
	@Transactional
	@Query(value="DELETE FROM general3 WHERE id=?1",nativeQuery=true)
	public int deleted(@Param("id")int id);
	
	//update the query
	@Modifying
	@Transactional
	@Query(value="update general3 set place=:d where id=:id",nativeQuery=true)
	public Integer updateById(@Param("d")String d,@Param("id")int id);

	@Modifying
	@Transactional
	@Query("delete from model h where h.id=:id")
	public int nav(@Param("id") int id);
}