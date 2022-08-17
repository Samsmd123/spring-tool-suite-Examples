package com.vfislk.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
	IShape square;
	@Autowired
	IShape rectangle;
	public void printArea(int x,int y) {
		System.out.println("Printing Area");
		//rectangle.calcArea(x,y);
		square.calcArea(x,y);
		
		
	}

}
