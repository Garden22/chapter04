package com.javaex.ex07;

import java.util.*;

public class PointApp {

	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1, 1);
		Point p02 = new Point(2, 2);
		Point p03 = new Point(3, 3);
		Point p04 = new Point(1, 1);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		for (Point p: pSet) {
			System.out.println(p.toString());
		}
	}

}
