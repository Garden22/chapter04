package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {
		
		MyList<Point> pList = new MyList<Point>();
		
		Point p01 = new Point(2, 3);
		Point p02 = new Point(13, 15);
		
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).toString());
		
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
			System.out.println(pList.get(i).getX());
		}
		
		System.out.println("===============================");
		
		MyList<Circle> cList = new MyList<Circle>();
		
		Circle c01 = new Circle(2);
		Circle c02 = new Circle(9);
		
		cList.add(c01);
		cList.add(c02);

		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i).toString());
			cList.get(i).getRadius();
		}
	}

}

