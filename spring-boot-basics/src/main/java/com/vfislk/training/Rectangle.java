package com.vfislk.training;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements IShape {

	@Override
	public void calcArea(int x, int y) {
		double result=x*y;
		System.out.println("Araea of rectangle is: "+result);
	}

}
