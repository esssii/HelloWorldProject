    
package test;

import data.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String personText;
		Person p1; //Variablen Definition
		p1 = new Person(); //Instanzierung
//
		p1.setVorname("Hans");
		p1.setNachname("Huber");
		//
		System.out.println(p1);
=======
package test;

import data.Person;

public class PersonTest {

	public static void main(String[] args) {
		//
		String PersonTest ;
		//
		Person p1; // Variablen Definition
		p1 = new Person(); // Instanzierung
		//
		p1.setVorname("Hans");
		p1.setNachname("Huber");
		p1.setStrasse("wienerstrasse");
		p1.setHausnummer("123");
		p1.setOrt("Wien");
		p1.setPlz("1234");
		
		//
		System.out.println(p1);
		

	}

}