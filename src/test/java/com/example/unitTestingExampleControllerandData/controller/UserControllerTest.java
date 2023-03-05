package com.example.unitTestingExampleControllerandData.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.unitTestingExampleControllerandData.services.UserService;
import com.example.unitTestingExampleControllerandDatacontroller.controller.UserController;



@ExtendWith(MockitoExtension.class)

public class UserControllerTest {

	MockMvc mockMvc = null;
	
//	@InjectMocks
//	UserController usercontroller;
	
//	@MockBean
//	UserService usersvc;
	
		
	@BeforeEach
	public void setup()
	{
//		usercontroller = new UserController();
//		MockitoAnnotations.openMocks(this);  //this line is extreamely important
		
		mockMvc = MockMvcBuilders.standaloneSetup(UserController.class).build();
		
//		mockMvc = MockMvcBuilders.standaloneSetup(usercontroller).build();
		  
//		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
//	
	
	
//	@Mock
//	UsersAccessDao usersaccessdao;
//	
	
	
		
	@Test
	public void getAllUsersTest() throws Exception
	{

		
		
		MvcResult mvcresults = mockMvc.perform(MockMvcRequestBuilders.get("/users").accept(org.springframework.http.MediaType.APPLICATION_JSON_VALUE)).andReturn();
//		when(usersvc.getAllUsers()).thenReturn(Users.builder().age(76).name("Bidyut").build());
//		doReturn(Users.builder().age(37).name("Bidyut").build()).when(usersvc.getAllUsers());
		
		System.out.println("content is "+ mvcresults.getResponse().getContentAsString());
		assertEquals(mvcresults.getResponse().getContentAsString().contains("Debopriya"), true);
		//System.out.println("status is "+mvcresults.getResponse().getStatus());
	}
	
}
