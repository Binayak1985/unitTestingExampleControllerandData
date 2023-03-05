package com.example.unitTestingExampleControllerandData.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Component
@AllArgsConstructor
@NoArgsConstructor
public class SomeDetails {

	@Override
	public String toString() {
		return "SomeDetails [Id=" + Id + ", details=" + details + "]";
	}
	int Id;
	String details;
	
}
