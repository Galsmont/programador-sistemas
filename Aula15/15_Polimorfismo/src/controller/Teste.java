package controller;

import model.ContaCorrente;
import model.ContaEspecial;

public class Teste {
	
	public static void main (String [] args) {
		ContaCorrente cc = new ContaCorrente ("Camila Monteiro" , "0001", "139484", 250);
		System.out.println("Saldo Camila");
		System.out.println(cc.calcularSaldo());
		
		ContaEspecial cce = new ContaEspecial ("Jonattan Freitas", "0002", "212121", 0.50, 500);
		
		System.out.println("Saldo Camila");
		System.out.println("Saldo Jonattan");
	}

}
