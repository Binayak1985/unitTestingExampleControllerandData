package com.example.unitTestingExampleControllerandData.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.unitTestingExampleControllerandData.dao.UsersAccessDao;
import com.example.unitTestingExampleControllerandData.entity.Users;
import com.example.unitTestingExampleControllerandData.services.UserService;
import com.example.unitTestingExampleControllerandDatacontroller.controller.UserController;

//to use mockito annotations we need to use @ExtendWith(MockitoExtension.class)
@ExtendWith(MockitoExtension.class)

public class UserControllerTest {

	MockMvc mockMvc;

	// for injecting mock we use @Mock and not @MockBean
	@Mock
	UserService usersvc;

	@InjectMocks
	UserController usercontroller;

	@BeforeEach
	public void setup() {
//		usercontroller = new UserController();
		MockitoAnnotations.openMocks(this); // this line is extreamely important
//		mockMvc = MockMvcBuilders.standaloneSetup(UserController.class).build();
		mockMvc = MockMvcBuilders.standaloneSetup(usercontroller).build();
//		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Mock
	UsersAccessDao usersaccessdao;
//	

	@Test
	public void getAllUsersTest() throws Exception {
//		doReturn(Users.builder().age(37).name("Bidyut").build()).when(usersvc.getAllUsers(anyInt()));
		when(usersvc.getAllUsers(1)).thenReturn(Users.builder().age(76).name("Bidyut").build());
		MvcResult mvcresults = mockMvc.perform(
				MockMvcRequestBuilders.get("/users/1").accept(org.springframework.http.MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
//		when(usersvc.getAllUsers(1)).thenReturn(Users.builder().age(76).name("Bidyut").build());
//		
	    System.out.println(" http response status is "+mvcresults.getResponse().getStatus());
		System.out.println("content is " + mvcresults.getResponse().getContentAsString());
		assertEquals(mvcresults.getResponse().getContentAsString().contains("Bidyut"), true);
		// System.out.println("status is "+mvcresults.getResponse().getStatus());
	}

}
