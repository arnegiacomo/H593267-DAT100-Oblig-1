package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave_5_b {
	public static void main(String[] args) {
		
		int innlesning = 1;
		String karakter = "F";
		String utTxt = "Ugjyldig poengsum.";
		
		
		for (innlesning = 1; innlesning <= 10; innlesning++) {
				
			int poeng = parseInt(showInputDialog("Antall poeng på prøve for student " + innlesning + ": "));
		
		

			if (poeng <= 100 && poeng >= 90) {
			karakter = "A";
			}
		
			if	(poeng <= 89 && poeng >= 80) {
			karakter = "B";
			}
		
			if (poeng <= 79 && poeng >= 60) {
			karakter = "C";
			}
		
			if (poeng <= 59 && poeng >= 50) {
			karakter = "D";
			}
		
			if (poeng <= 49 && poeng >= 40) {
			karakter = "E";
			}
		
			if (poeng <= 39 && poeng >= 0) {
			karakter = "F";
			}
		
			utTxt = "Karakter på prøve for student " + innlesning + " er " + karakter;	
			
			if (poeng > 100 || poeng < 0) {
			
			showMessageDialog (null, "Ugjyldig poengsum.");
			}
		
			else
		
				showMessageDialog (null, utTxt);
		}
		
	}
}
