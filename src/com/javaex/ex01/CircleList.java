package com.javaex.ex01;

public class CircleList {
	private Circle[] cArray;
	private int crsPos;
	
	public CircleList() {
		cArray = new Circle[3];
		crsPos = 0;
	}
	
	public void add(Circle circle) {
		cArray[crsPos] = circle;
		crsPos++;
	}
	
	public int size() {
		return crsPos;
	}
	
	public Circle get(int i) {
		return cArray[i];
	}
}
