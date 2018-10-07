package Aufgabe1a;

import java.util.Scanner;

public class Zinseszins {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		System.out.print("Geben Sie ihr Startkapital ein: ");
		int kapital=in.nextInt();
		System.out.print("Geben Sie ihren Zinssatz ein(in %): ");
		int zinssatz=in.nextInt();
		System.out.print("Geben Sie ihre Anlagedauer an: ");
		int jahr=in.nextInt();
		double zinsen=0;
		System.out.println();
		System.out.println("Jahr \t Anfangsbetrag \t Zinsen \t Endbetrag");
		for (int i=0;i<jahr;i++) {
			zinsen= (double) zinssatz/100*kapital;
			kapital+=zinsen;
			System.out.println(i+ " \t \t "+ ((int)(kapital-zinsen))+" \t "+((int)zinsen)+" \t\t "+((int)kapital));
		}
		
		in.close();
	}

}
