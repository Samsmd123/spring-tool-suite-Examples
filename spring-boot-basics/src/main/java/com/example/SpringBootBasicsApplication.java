package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.vfislk.training.ShapeFactory;

@SpringBootApplication
@ComponentScan({"com.vfislk.training","com.example"})
public class SpringBootBasicsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicsApplication.class, args);
	}
	@Autowired
	IGreetService greetService;
	@Autowired
	ShapeFactory shapeFcatory;
	@Override
	public void run(String... args) throws Exception {
		 greetService.greetUser("sweety");
		 
		 shapeFcatory.printArea(20,20);
	}

}
