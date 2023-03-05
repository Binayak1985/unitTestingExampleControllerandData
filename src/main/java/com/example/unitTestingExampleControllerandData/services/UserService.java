package com.example.unitTestingExampleControllerandData.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.unitTestingExampleControllerandData.dao.UsersAccessDao;
import com.example.unitTestingExampleControllerandData.entity.SomeDetails;
import com.example.unitTestingExampleControllerandData.entity.Users;



@Service
public class UserService {

	@Autowired
	UsersAccessDao dao;
	
//	Logger log = LoggerFactory.getLogger(this.getClass().getName());
	Logger log = LogManager.getLogger("com.splunkhttp");
	
	WebClient webclient = WebClient.builder().baseUrl("http://localhost:8099").build();
    
	
	public SomeDetails getDetails(int id)
	{
		log.debug("calling microservice1 from webclient for the id "+id);
		SomeDetails somedetails = webclient.get().uri("/getdata/"+id).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(SomeDetails.class).block();//.(MediaType.APPLICATION_JSON).exchange().block();
		return somedetails;
	}
	
	public Users getAllUsers(int id)
	{
		log.debug("calling getAllUsers");
		
		return new Users("Vinny",37, getDetails(id));
//		return dao.getAllUsers();
	}
	
	
//	public Users getUsers()
//	{
//		return Users.builder().name("Debopriya").age(34).build();
//	}
}
