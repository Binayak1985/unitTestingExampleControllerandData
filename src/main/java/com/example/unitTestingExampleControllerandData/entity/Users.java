package com.example.unitTestingExampleControllerandData.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Component
@AllArgsConstructor
public class Users {
	
 public Users()
 {
	 
 }
 private String name;
 private Integer age;
 private SomeDetails somedetails; 
}
