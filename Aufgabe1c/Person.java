package Aufgabe1c;

public class Person {
	private int alter;
	private String vorname;
	private String name;
	private String nationalitaet;
	
	public Person(int alter, String vorname, String name, String nationalitaet) {
		this.alter=alter;
		this.vorname=vorname;
		this.name=name;
		this.nationalitaet=nationalitaet;
		System.out.println("Ich heiße " + vorname+" "+ name + " ,bin "+ alter + " Jahre alt und meine Nationalität ist "+nationalitaet+".");
	}
	public void Wer() {
		System.out.println("Ich heiße " + vorname+" "+ name + " ,bin "+ alter + " Jahre alt und meine Nationalität ist "+nationalitaet+".");
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
		System.out.println("Du hast deinen Vornamen in "+vorname+" geändert!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Du hast deinen Namen in "+name+" geändert!");
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
		System.out.println("Herzlichen Glückwunsch " + vorname + " zum "+ alter+"ten Geburtstag!");
	}
	public String getNationalitaet() {
		return nationalitaet;
	}
	public void setNationalitaet(String nationalitaet) {
		this.nationalitaet = nationalitaet;
		System.out.println("Deine Nationalität ist nun "+nationalitaet+"!");
	}
	
	
}
