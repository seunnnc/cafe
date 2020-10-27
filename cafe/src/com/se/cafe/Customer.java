package com.se.cafe;

import java.util.Scanner;

public class Customer {

	//어떤 커피 마시겠습니까? 1~4까지만 
	public MenuItem order(Menu menu) {
		menu.showMenus();
		Scanner sc = new Scanner(System.in);
		MenuItem mi = null;

		while(mi == null) {

			try {
				System.out.print("어떤 커피를 마시겠습니까?");
				String menuNo = sc.next();
				int intMenuNo = Integer.parseInt(menuNo);
				mi = menu.choose(intMenuNo - 1);	
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해 주세요");
			}catch (Exception e) {
				System.out.println("메뉴에 없습니다 다시 선택하세요");
			} 			
		}
		return mi;

	}

	public void drinkCoffee(Coffee coffee) {
		
		System.out.println(coffee.getName() + "(을)를 마십니다");
	}

}
