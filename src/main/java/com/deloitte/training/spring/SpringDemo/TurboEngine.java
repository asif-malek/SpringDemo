package com.deloitte.training.spring.SpringDemo;

import org.springframework.stereotype.Component;

@Component("Turbo")
public class TurboEngine implements Engine {

String type;
	
	TurboEngine(){
		type="Turbo";
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
