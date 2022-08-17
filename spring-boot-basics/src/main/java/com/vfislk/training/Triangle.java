package com.vfislk.training;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape {

	@Override
	public void calcArea(int x, int y) {
		System.out.println("Area of triange :"+(0.5)*x*y);
	}

}
