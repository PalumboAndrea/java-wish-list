package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> wishList = new ArrayList<String>();
		
		while(true) {
			
			System.out.println("Premi 1 per inserire un elemento, 2 per uscire");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
				case 1: {
					
					System.out.println("Inserisci un oggetto nella lista dei desideri:");
					String object = sc.nextLine();
					wishList.add(object);
					System.out.println("La tua lista è composta da " + wishList.size() +  (wishList.size()!=1 ? " elementi" : " elemento"));
					break;
				}
				case 2: {
					
					System.out.println("Ecco la tua lista dei desideri:");
					System.out.println(wishList);
					sc.close();
					return;
				}	
				case 3: 
					
					System.out.println("Per favore inserisci un'opzione valida:");
					break;
			}
		}
	}
}
