package blatt03;

import java.util.Scanner;

public class Multtable {
	/**
	 * Dieses Programm gibt eine Multiplikationstabelle bis zu einer Zahl 
	 * oberGrenze in die Konsole aus, die vom user abgefragt wird.
	 */
	
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Input Variabeln mit default-Werten deklarieren
		String inputString = "";
		int oberGrenze = -1; //obere Grenze (=Kantenlänge) der Multiplikationstabelle
		
		//Frage stellen
		System.out.println("Bis zu welcher Zahl soll die Multiplikationstabelle aufgestellt werden?");
		
		//sooft integer einlesen, bis es das gewünschte Format hat.
		while(true){
			inputString = keyboard.nextLine();
			
			try {oberGrenze = Integer.parseInt(inputString);}
			catch (NumberFormatException e){
				System.out.println("Ungültige Eingabe (keine Zahl), bitte wiederholen:");
				continue;
			}
			if(oberGrenze>0) break; //ACHTUNG: wenn dieses break entfernt wird, ergibt sich eine Endlosschleife!
			System.out.println("Ungültige Eingabe (Zahl negativ oder null), bitte wiederholen:");
		}
		
		//Input schließen
		keyboard.close();
		
		//Multiplikationstabelle in die Konsole ausgeben
		for (int zeile = 1 ; zeile <= oberGrenze ; zeile++){
			for (int spalte = 1 ; spalte <= oberGrenze ; spalte++){
				System.out.print(zeile*spalte + "\t");
			}
			System.out.println();
		}
	}
}
