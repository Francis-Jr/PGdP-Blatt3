package blatt03;

import java.util.Scanner;

public class Multtable {

	//TODO Styleguide
	
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		String c = "";
		int x = -1;
		System.out.println("Bis zu welcher Zahl soll die Multiplikationstabelle aufgestellt werden?");
		while(true){
			c = keyboard.nextLine();
			
			try {x = Integer.parseInt(c);}
			catch (NumberFormatException e){
				System.out.println("Ungültige Eingabe (keine Zahl), bitte wiederholen:");
				continue;
			}
			if(x>0) break;
			System.out.println("Ungültige Eingabe (Zahl negativ oder null), bitte wiederholen:");
		}
		keyboard.close();
		
		
		for (int zeile = 1 ; zeile <= x ; zeile++){
			for (int spalte = 1 ; spalte <= x ; spalte++){
				System.out.print(zeile*spalte);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
