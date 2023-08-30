package com.skcet.Foodreview2.Reposotory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.Foodreview2.Model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
