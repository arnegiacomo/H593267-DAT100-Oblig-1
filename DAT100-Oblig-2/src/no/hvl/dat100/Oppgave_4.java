package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave_4 {
	public static void main(String[] args) {
		
		
	double bruttoinntekt = parseInt( showInputDialog("Din bruttoinntekt: "));
	
	int trinn1 = 180800;
	int trinn2 = 254500;
	int trinn3 = 639750;
	int trinn4 = 999550;
	double trinnskatt = 0;

	if (bruttoinntekt > trinn1 && bruttoinntekt <= trinn2) {
		trinnskatt += (bruttoinntekt - trinn1) * 0.019;	
	}
	
	if (bruttoinntekt > trinn2 && bruttoinntekt <= trinn3) {
		trinnskatt += (bruttoinntekt - trinn2) * 0.042 + (trinn2 - trinn1) * 0.019;	
	}
	
	if (bruttoinntekt > trinn3 && bruttoinntekt <= trinn4) {
		trinnskatt += (bruttoinntekt - trinn3) * 0.132 + (trinn3 - trinn2) * 0.042 + (trinn2 - trinn1) * 0.019;	
	}
	
	if (bruttoinntekt > trinn4) {
		trinnskatt += (bruttoinntekt - trinn4) * 0.162 + (trinn4-trinn3) * 0.132 + (trinn3 - trinn2) * 0.042 + (trinn2 - trinn1) * 0.019;	
	}
	
	showMessageDialog(null, "Du betaler " + trinnskatt + " kroner i trinnskatt.");
	
	}
}
