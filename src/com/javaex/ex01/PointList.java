package com.javaex.ex01;

public class PointList {
	private Point[] pArray;
	private int crtPos;
	
	public PointList() {
		pArray = new Point[3];
		crtPos = 0;
	}
	
	public void add(Point point) {
		pArray[crtPos] = point;
		crtPos = crtPos + 1;
	}
	
	public int size() {
		return crtPos;
	}

	public Point get(int i) {
		return pArray[i];
	}

}
