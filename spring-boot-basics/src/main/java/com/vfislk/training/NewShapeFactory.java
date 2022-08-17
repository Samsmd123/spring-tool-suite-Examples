package com.vfislk.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewShapeFactory {
	
	//ByType
	@Autowired
	@Qualifier("square")
	IShape shape;
	
	
	//by Name
	@Autowired 
	IShape rectangle;
	
	IShape triangle;
	
	
	public  NewShapeFactory(IShape triangle ) {
		super();
		this.triangle=triangle;
	}
	public void printArea(int x,int y) {
		System.out.println("Printing Area");
		//if(choice.equals("s"))
		shape.calcArea(x,y);
		//if(choice.equals("r"))
		rectangle.calcArea(x, y);
		//if(choice.equals("t"))
		triangle.calcArea(x, y);
}
	 {
		// TODO Auto-generated method stub
		
	}
}