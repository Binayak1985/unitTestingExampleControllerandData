package com.example.unitTestingExampleControllerandData.dao;

import org.springframework.stereotype.Service;

import com.example.unitTestingExampleControllerandData.entity.Users;

@Service
public class UsersAccessDao {

	public Users getAllUsers()
	{
		
		return Users.builder().age(37).name("Binayak").build();
	}
	
}
