package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> LottoNums = new HashSet<Integer>();
		
		while(LottoNums.size() < 6) {
			LottoNums.add((int)(Math.random()*45)+1);
		}
		
		for (Integer i: LottoNums) {
			System.out.print(i + " ");
		}
	}
}
