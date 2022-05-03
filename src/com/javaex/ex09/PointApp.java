package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;

import com.javaex.ex08.Point;

public class PointApp {

	public static void main(String[] args) {

		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(1, 1);
		Point p02 = new Point(2, 2);
		Point p03 = new Point(3, 3);
		
		pMap.put("정우성", p01);
		pMap.put("유재석", p02);
		pMap.put("박명수", p03);
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());
		
		System.out.println(pMap.get("박명수").getX());
		
		pMap.put("정우성", new Point(100, 200));
		System.out.println(pMap.get("정우성").toString());
		
	}

}
