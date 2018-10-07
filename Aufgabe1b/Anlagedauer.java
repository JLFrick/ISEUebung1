package Aufgabe1b;

import java.util.Scanner;

public class Anlagedauer {
	public static void main(String[] args) {
			
			Scanner in= new Scanner(System.in);
			System.out.print("Geben Sie ihr Startkapital ein: ");
			int kapital=in.nextInt();
			System.out.print("Geben Sie ihren Zinssatz ein(in %): ");
			int zinssatz=in.nextInt();
			System.out.print("Geben Sie ihren gewünschten Endbetrag ein: ");
			int endkapital=in.nextInt();
			double zinsen=0.0;
			int jahr=0;
			System.out.println();
			System.out.println("Jahr \t Anfangsbetrag \t Zinsen \t Endbetrag");
			while (kapital<endkapital) {
				zinsen= (double) zinssatz/100*kapital;
				kapital+=zinsen;
				System.out.println(jahr+ " \t "+ (kapital-zinsen)+" \t "+zinsen+" \t\t "+kapital);
				jahr+=1;
				
				
				
			}
			in.close();
		}

	}
