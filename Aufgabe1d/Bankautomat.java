package Aufgabe1d;

import java.util.Scanner;

public class Bankautomat {
	static double betrag;							// Variable für Betrag
	static double einzahl=0.0;						// Variable für Summe der Einzahlungen
	static double auszahl=0.0;						// Variable für Summe der Auszahlungen
	static int auswahl;								// Variable für Auswahl
	static int ein=0;								// Anzahl der Durchläufe der Einzahlungs Schleife
	static int aus=0;								// Anzahl der Durchläufe der Auszahlungs Schleife
	static Scanner in = new Scanner(System.in);
	
	// Klassen
	public static void Willkommen() {
		System.out.println("Willkommen zur besten Bank der Welt, die Jan-Luca Bank!");
		System.out.println();
	}
	public static void Auswahl() {
		System.out.println("Was möchten Sie als nächstes tun?");
		System.out.println("1: Einzahlung");
		System.out.println("2: Auszahlung");
		System.out.println("3: Durchschnitt berechnen");
		System.out.println("4: Kontostand anzeigen");
		System.out.println("5: Beenden");
		System.out.println("6: Weisheit des Tages");
		auswahl = in.nextInt();
	}
	public static void Einzahlung() {
		System.out.println("Sie haben sich für eine Einzahlung entschieden!");
		System.out.print("Welchen Betrag möchten Sie einzahlen?");
		betrag = in.nextDouble();
		if (betrag>0) {
		System.out.println("Sie haben einen Betrag von "+ betrag + "€ eingezahlt.");
		einzahl += betrag;
		ein++;
		} else {
			System.out.println("Geben Sie einen anderen Betrag ein!");
		}
	}
	public static void Auszahlung() {
		System.out.println("Sie haben sich für eine Auszahlung entschieden!");
		System.out.print("Welchen Betrag möchten Sie sich auszahlen lassen?");
		betrag = in.nextDouble();
		if (betrag>0) {
		System.out.println("Sie haben einen Betrag von "+ betrag + "€ auszahlen lassen.");
		auszahl += betrag;
		aus++;
		} else {
			System.out.println("Geben Sie einen anderen Betrag ein!");
		}
	}
	public static void Durchschnitt() {
		System.out.println("Sie möchten den Durchschnitt ihrer Zahlungen berechnen!");
		if (einzahl/ein>0) {
			System.out.println("Sie haben durchschnittlich einen Betrag von "+ (einzahl/ein) + "€ eingezahlt");
		} else {
			System.out.println("Sie haben noch keine Einzahlung getätigt!");
		}
		if (auszahl/aus>0) {
			System.out.println("und durchschnittlich einen Betrag von "+ (auszahl/aus) + "€ ausbezahlen lassen.");
		} else {
			System.out.println("Sie haben noch keine Auszahlung getätigt!");
		}
		
	}
	public static void Kontostand() {
		System.out.println("Sie möchten Ihren Kontostand einsehen!");
		System.out.println("Sie haben einen Kontostand von "+ (einzahl-auszahl) + "€.");
	}
	public static void Weisheit() {
		System.out.println("Weisheit des Tages!");
		System.out.println();
		int x= (int)(Math.random()*11);
		WeisheitdesTages weisheit= new WeisheitdesTages(x);
		weisheit.x=x;
	}
	
	//Main
	public static void main(String[] args) {
		Willkommen();
		//Auswahl von Ausführung
		do {
			Auswahl();
		//Verschiedene Ausführungen
			switch (auswahl) {
			case 1: {Einzahlung();
					break;
			}
			case 2: {Auszahlung();
					break;
			}
			case 3: {Durchschnitt();
					break;
			}
			case 4: {Kontostand();
					break;
			}
			case 5: {
				System.out.println("Auf Wiedersehen!");
				break;
			}
			case 6: {
				Weisheit();
				break;
			}
			default: {
				System.out.println("Sie haben eine ungültige Zahl eingegeben!");
			}
			}
			System.out.println();
		} while (auswahl!=5);
		in.close();	
	}
}