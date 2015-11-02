package blatt03;

import java.util.Scanner;

public class Sternkreuz {

	//TODO Sytleguide
	
	private static int kantenlaenge = 0;
	private static String sternkreuz = "";
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(kantenlaenge != 2 && kantenlaenge != 42){
			input();
			draw();
			output();
		}
		keyboard.close();
	}
	
	private static void input(){
		String inputString = "";
		int inputInt = -1;
		System.out.println("Geben sie die Kantenlänge ein");
		while(true){
			inputString = keyboard.nextLine();
			
			try {inputInt = Integer.parseInt(inputString);}
			catch (NumberFormatException e){
				System.out.println("Ungültige Eingabe (keine Zahl), bitte wiederholen:");
				continue;
			}
			if(inputInt>1) break;
			System.out.println("Ungültige Eingabe (Zahl kleiner 2), bitte wiederholen:");
		}
		
		kantenlaenge = inputInt;
	}
	
	private static void draw(){
		sternkreuz = "";
		for(int zeile = 1 ; zeile <= kantenlaenge ; zeile ++){
			for (int spalte = 1 ; spalte <= kantenlaenge ; spalte ++){
				if(zeile == 1 || spalte == 1 || zeile == kantenlaenge || spalte == kantenlaenge){
					sternkreuz = sternkreuz + "*";
				}
				else if (zeile == spalte || zeile == kantenlaenge - spalte + 1){
					sternkreuz = sternkreuz + "*";
				}
				else {
					sternkreuz = sternkreuz + " ";
				}
			}
			sternkreuz = sternkreuz + "\n";
		}
	}
	
	private static void output(){
		System.out.println(sternkreuz);
	}

}
