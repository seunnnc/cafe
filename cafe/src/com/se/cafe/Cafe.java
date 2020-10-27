package com.se.cafe;

public class Cafe {
	public static void main(String[] args) {

		/*
		Menu menu = new Menu();
		menu.showMenus();
		
		MenuItem mi = cus.order(menu);
		System.out.println(mi);
		
		Coffee coffee = new Coffee(mi);
		
		MenuItem mi = menu.choose(0);	//1. 아메리카노 - 1,500원 
		System.out.println(mi);
		*/
		Menu menu = new Menu();
		Customer cus = new Customer();
		Barista bas = new Barista();
		
		MenuItem choiceMenu = cus.order(menu);
		Coffee coffee = bas.makeCoffee(choiceMenu);
		cus.drinkCoffee(coffee);
		
	}
}
