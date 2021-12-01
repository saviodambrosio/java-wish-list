package org.generation.italy.christmas;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> desideri;
		desideri = new ArrayList<String>();
		String scelta;
		boolean valido = false;		
		do {
			System.out.print("Aggiungi elemento alla lista dei desideri :");
			
			desideri.add(scan.nextLine());
			System.out.println("La tua lista contiene " + desideri.size() + " desideri" );
			System.out.println("Continuare? s/n");
			scelta = scan.nextLine();
			if (scelta.equals("n")) {
				valido = true;
			}
		} while(valido == false);
		
		System.out.println("Ecco la tua lista:");
		// System.out.println(desideri); stampa con quadre[]
		
		Collections.sort(desideri);
		Iterator<String> it = desideri.iterator();
		while (it.hasNext()) {
		                   System.out.println(it.next());
		}


		scan.close();
	}

}
