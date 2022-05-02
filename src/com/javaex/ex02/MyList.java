package com.javaex.ex02;

public class MyList<T> {
	
	private T[] array;
	private int crtPos;
	
	public MyList() {
		array = (T[])new Object[3];
		crtPos = 0;
	}
	
	public void add(T obj) {
		array[crtPos] = obj;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}

	public T get(int i) {
		return array[i];
	}

}
