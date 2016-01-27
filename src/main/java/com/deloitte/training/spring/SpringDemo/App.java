package com.deloitte.training.spring.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.training.spring.SpringDemo.aop.CustomerBo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		Car obj = (Car) context.getBean("helloBean");
		
		System.out.println("Car Name:"+obj.getName());
		System.out.println("Engine Type:"+obj.getEngine().getType());
		System.out.println("Tyres:"+obj.getTyres());
		
		
		CustomerBo customer = (CustomerBo) context.getBean("customerBo");
		customer.addCustomer();
		
		context.close();
    }
}
