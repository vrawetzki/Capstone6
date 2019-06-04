package com.capstone6practice.capstone6practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone6practice.capstone6practice.variablesnikki.User;


public interface UserRepo extends JpaRepository<User, Integer>{

	//User getOne(Integer num);
}
