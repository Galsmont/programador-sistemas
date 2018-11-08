package controller;

public class ExemploClasseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sorteando um numero entre 50 e 80
		double va1Sorteado = Math.random();
		int resultado = 50 + (int) (va1Sorteado * 30);
		System.out.println ("Sorteio entre 50 e 80: " + resultado);
		
		//Sorteando a mega sena
		for (int i = 0; i < 6; i++) {
			double numeroSena = Math.random();
			int numeroSorteado = (int) (numeroSena * 61);
			System.out.println("Número Sorteado" + numeroSorteado);

	 }
	}
}

