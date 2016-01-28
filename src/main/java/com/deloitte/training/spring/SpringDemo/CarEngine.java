package com.deloitte.training.spring.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class CarEngine implements Engine {

	String type;
	
	CarEngine(){
		type="V3";
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
