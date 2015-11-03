package blatt03;

import java.util.Scanner;

public class Sternkreuz {
	/**
	 * Dieses Programm fragt eine Kantenlänge vom user ab und zeichnet ein 
	 * Kreuzförmiges Muster aus Sternchen '*' in die Konsole. 
	 * Dieser Vorgang wird solange wiederholt, bis ein Kreuz der Kantenlänge
	 * 2 oder 42 gezeichnet wurde.
	 */
	
	private static int kantenlaenge = 0; // wird in input() vom user abgefragt
	private static String sternkreuz = ""; // wird in draw() beschrieben
	
	/**
	 * Nach dem Zeichnen von Kreuzen dieser speziellen Kantenlängen 
	 * wird das Programm abgebrochen.
	 */
	private static int 	spezielleKantenlaenge1 = 2,
						spezielleKantenlaenge2 = 42;
	
	public static void main(String[] args) {
		int anzahlKreuze = 0;
		while(kantenlaenge !=  spezielleKantenlaenge1 && kantenlaenge != spezielleKantenlaenge2){
			input();
			draw();
			output();
			if(kantenlaenge == spezielleKantenlaenge1 || kantenlaenge == spezielleKantenlaenge2) {
				System.out.println(">>Ok, jetzt hab ich aber genug...<<");
				break;
			}
			dialog(anzahlKreuze);
			anzahlKreuze = anzahlKreuze + 1;
		}
	}
	
	/**
	 * Liest die Kantenlänge aus der Konsole ein.
	 */
	private static void input(){
		Scanner keyboard = new Scanner(System.in);
		String inputString = "";
		int inputInt = -1;
		System.out.println(">>Geben sie die Kantenlänge ein<<");
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
		keyboard.close();
	}
	
	/**
	 * Speichert das Kreuz in den String sternkreuz
	 */
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
	
	/**
	 * Schriebt das Kreuz aus dem String sternkreuz in die Konsole
	 */
	private static void output(){
		System.out.println(sternkreuz);
	}
	
	/**
	 * Führt einen kleinen humorvollen Dialog mit dem user durch.
	 * @param anzahl Anzahl an Kreuzen die vor dem aktuellen schon gezeichnet wurden
	 */
	private static void dialog(int anzahl){
		System.out.println(">>Ich will noch ein Kreuz zeichnen!<<");
		if(anzahl>4){
			System.out.println("Vielleicht solltest du es mit der Antwort auf die "
					+ "Frage aller Fragen versuchen...");
		}
		else if(anzahl>2){
			System.out.println("Tut mir leid, das Programm ist etwas zickig... "
					+ "vielleicht wartet es auf eine bestimmte Zahl...");
		}
	}

}
