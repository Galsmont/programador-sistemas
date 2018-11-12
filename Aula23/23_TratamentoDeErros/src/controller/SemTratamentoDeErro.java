package controller;
import util.Teclado;

public class SemTratamentoDeErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = Teclado.lerDouble("Digite o Numerador: ");
		double b = Teclado.lerDouble("Digite o denominador: ");
		
		double c = a/b;
		System.out.println("Resultado da divisão de a por b: " + c);
	}

}
