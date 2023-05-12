package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> wishList = new ArrayList<String>();
		
		while(true) {
			System.out.println("Inserisci un oggetto nella lista dei desideri:");
			String object = sc.nextLine();
			wishList.add(object);
			System.out.println("La tua lista è composta da " + wishList.size() +  (wishList.size()>1 ? " elementi" : " elemento")
					+ "\nPremi 1 per continuare ad inserire o 2 per uscire");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
				case 1: {
					
					continue;
				}
				case 2: {
					System.out.println("Ecco la tua lista dei desideri:");
					System.out.println(wishList);
					sc.close();
					return;
				}		
			}
		}
		
	}
}
