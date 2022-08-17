package com.vfislk.training;

import org.springframework.stereotype.Component;

@Component
public class Square implements IShape {

	@Override
	public void calcArea(int x, int y) {
		System.out.println("Area of square :"+x*x);

	}

}
