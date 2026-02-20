 package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
 import org.springframework.beans.factory.BeanFactory;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		System.out.println("HEllo World");
//		ApplicationContext context=SpringApplication.run(Demo1Application.class, args);
//		Car car1=context.getBean(Car.class);
//		Car car2=context.getBean(Car.class);
//		System.out.println(car1);
//		System.out.println(car2);
//		Vehicle vehicle=context.getBean(bike.class);
//		Vehicle vehicle2=context.getBean(Car.class);
//		vehicle.run();
//		vehicle2.run(); 
		
//	Vehicle vehicle=context.getBean(Vehicle.class); //we will get NoUniqueBeanDefinitionException to prevent that we use @primary for one class that will be the default
	 
		BeanFactory factory=SpringApplication.run(Demo1Application.class, args);
			Vehicle vehicle=factory.getBean("bike",Vehicle.class);
			vehicle.run();
		
	}
	
}
