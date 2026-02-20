package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class bike implements Vehicle{
	public bike() {
		System.out.println("Bike bean created by spring");
	}
	
	@Override
	public void run() {
		System.out.println("Bike Running...");
	}
}
