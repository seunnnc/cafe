package com.se.cafe;

public class Barista {

	public Coffee makeCoffee(MenuItem mi) {
		Coffee coffee = new Coffee(mi);
		
		return coffee;
	}

}
