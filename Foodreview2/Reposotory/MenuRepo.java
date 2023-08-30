package com.skcet.Foodreview2.Reposotory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.Foodreview2.Model.MenuModel;

public interface MenuRepo extends JpaRepository<MenuModel, Integer> {

}
