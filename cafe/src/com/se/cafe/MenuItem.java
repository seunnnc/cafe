package com.se.cafe;
//메뉴판, 각 메뉴아이템, 손님, 바리스타 객체생성
public class MenuItem {
	
//	private final String[] COFFEE = {"아메리카노", " 카푸치노", "카라멜 마끼아또", "에스프레소"};
//	private final int[] COFFEE_PRICE = {1500, 2000, 2500, 2500};
	
	//멤버필드 - 속성, 값저장, 은닉화해줌(private)
	private String name;
	private int price;
	
	//생성자: 클래스명과 메소드명 같게 만들어줌, return 타입 없애야함		<=메소드와 생성자 다른점
	
	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%,d원", name, price);
	}
	
}
