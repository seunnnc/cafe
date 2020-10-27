package com.se.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
//	private List<MenuItem> arr = new ArrayList();
	private List<MenuItem> menus = new ArrayList();
	
	/*
	String[] name = {"아메리카노", " 카푸치노", "카라멜 마끼아또", "에스프레소"};
	int[] price = {1500, 2000, 2500, 2500};
	*/
	
	public Menu() {
		init();
	}
	
	private void init() {
		
		menus.add(new MenuItem("아메리카노", 1500));
		menus.add(new MenuItem("카푸치노", 2000));
		menus.add(new MenuItem("카라멜 마끼아또", 2500));
		menus.add(new MenuItem("에스프레소", 2500));
		menus.add(new MenuItem("자몽에이드", 3500));
	}

	public void showMenus() {
		System.out.println("==========메뉴==========\n");
//		for(MenuItem m : menus) {
//			System.out.println(m);
//		}
		for(int i = 0; i < menus.size(); i++) {
			MenuItem mi = menus.get(i);
			System.out.printf("%d. %s\n", (i+1), mi);
		}
		System.out.println("\n======================\n");
		
	}

	public MenuItem choose(int idx) {
//		try {
			return menus.get(idx);
//		} catch (Exception e) {
//			System.out.println("다시입력하세요");
//			return null;
//		}
		
	}

//	@Override
//	public String toString() {
//		String str = "";
//		for(MenuItem m : menus) {
//			str += m + "\n";
//		}
//		return str;
//		
//	}

}
