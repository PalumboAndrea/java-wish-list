package org.java.myset;

import java.util.Random;
import java.util.HashSet;

public class MainSet {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		while (numbers.size() < 5) {
			
			numbers.add(rnd.nextInt(2, 13));
		}
		
		System.out.println(numbers);
		
	}
}
	