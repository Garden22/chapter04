package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		int i01 = 4;
		int i02 = 5;
		int i03 = 6;
		
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		
		System.out.println(iSet.size());;
		System.out.println(iSet.toString());;;
		
		for(Integer i:iSet) {
			System.out.println(i);
		}
		
	}

}
