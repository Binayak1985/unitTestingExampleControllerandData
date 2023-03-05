package com.example.unitTestingExampleControllerandDatacontroller.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.unitTestingExampleControllerandData.entity.Users;
import com.example.unitTestingExampleControllerandData.services.UserService;

//to fetch list of users
@RestController
public class UserController {

//	public ResponseEntity<User> getAllUsers()
	
//	Logger logger = LoggerFactory.getLogger("splunk.logger");
	Logger logger = LogManager.getLogger("com.splunkhttp");
	
	@Autowired
	UserService usersvc;
	
	
	//user id is ben and password is benspassword 
	@GetMapping("/users/{id}")
	public ResponseEntity<Users> getUsers(@PathVariable int id)
	{
//		UserService usersvc = new UserService();
//		System.out.println("called service class :: "+usersvc.getAllUsers());
		logger.info("unitTestinExampleControllerandData:: id called is"+id);
		return ResponseEntity.status(HttpStatus.OK).body(usersvc.getAllUsers(id));
//		return ResponseEntity.status(HttpStatus.OK).body(new Users().builder().age(76).name("Bidyut").build());
	}
	
	
}
