package data;

import java.util.ArrayList;

public class Person {
	//
<<<<<<< HEAD
	private static ArrayList<Person> Liste = new ArrayList<Person>();
	//
	public static ArrayList<Person> getListe() {
		return Liste;
	}
	//
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public static void setListe(ArrayList<Person> liste) {
		Liste = liste;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	public String getWohnort() {
		return wohnort;
	}
	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	private String vorname;
	private String nachname;
	private String strasse;
	private String hausnummer;
	private String wohnort;
	private String plz;
	
	public String toString() {
	return getNachname() + ", " + getVorname();
	}
}


=======
	private static ArrayList<Person> liste = new ArrayList<Person>();
	//
	private String vorname;
	private String nachname;
	private String plz;
	private String ort;
	private String strasse;
	private String hausnummer;
	//
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	
	@Override
	public String toString() {
		return getNachname() + ", " + getVorname();
	}
	public static ArrayList<Person> getListe() {
		return liste;
	}
}
>>>>>>> branch 'master' of https://github.com/esssii/HelloWorldProject.git
