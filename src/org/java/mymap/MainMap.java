package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.sasl.SaslException;

import java.util.ArrayList;

public class MainMap {
	public static void main(String[] args) {
		
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

		List<String> strArr = Arrays.asList(str.split(" "));

		Map<String, Integer> frCounter = new HashMap<>();

		for (String s : strArr) {

			s = s.replaceAll("[^a-zA-Z ]", "");
			
			if (s.isBlank()) continue;
			
			if (frCounter.containsKey(s)) {
				
				frCounter.put(s, frCounter.get(s) + 1);
			} else {
				
				frCounter.put(s, 1);
			}
		}

		System.out.println(frCounter);
		
//		FIRST TRY (doesn't work):
		
//		List<Character> chArr = new ArrayList<>();
//		
//		List<Character> special = new ArrayList<>();
//		
//		for (String s : strArr) {
//
//			for (Character character : s.toCharArray()) {
//				
//				chArr.add(character);
//				
//				if (!Character.isAlphabetic(character)) {
//					special.add(character);
//				}
//			}
//		}
//		
//		for (String s : strArr) {
//			
//			String newS = "";
//			
//			for (Character c1 : s.toCharArray()) {
//				
//				for (Character c2 : special) {
//					
//					if (c1.equals(c2)) {
//						System.out.println(s);
//						System.out.println(c1);
//						System.out.println(c2);
//						newS = s.replace(c2, ' ');
//						System.out.println(newS);
//					} else {
//						newS = s;
//					}
//				}
//			}
//			
//			if (frCounter.containsKey(newS)) {
//				frCounter.put(newS, frCounter.get(newS) + 1);
//			} else {
//				frCounter.put(newS, 1);
//			}
//			
//			
//		}
//		
//		System.out.println(frCounter);
	}
}
