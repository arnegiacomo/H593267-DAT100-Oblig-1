package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave_6 {
	public static void main(String[]args) {
		
		int n = parseInt(showInputDialog("Verdien til n: "));
		int i = n-1;
		
		
		if(n > 0) {
			
			while(i>0) {
				n *= i;
				i--;
					
			}
				showMessageDialog(null, n);
		}
		
		else
			showMessageDialog(null, "Feilmelding; n <= 0");
		
	}

}
