package com.deloitte.training.spring.SpringDemo;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Car implements InitializingBean,DisposableBean{
	
	String name;
List<Tyre> tyres;
    
    
	
	public List<Tyre> getTyres() {
		return tyres;
	}

	
	public void setTyres(List<Tyre> tyres) {
		this.tyres = tyres;
	}

	Car(){
		System.out.println("Car created.");
	}
	
	Engine engine;
	public String getName() {
		return name;
	}
	
	Car(String name){
		this.name=name;
	}

	public Engine getEngine() {
		return engine;
	}

	@Autowired//For Autowiring
	@Required//Without setting engine it will fail
	@Qualifier("Turbo")//if you have multiple engine how to choose one(Try to run the program after removing this annotation.
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void init(){
		System.out.println("init method is called");
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("preDestroy method is called");
	}

	public void destroy() throws Exception {
		System.out.println("Destroy method is called");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet processor is called");
		
	}
}
