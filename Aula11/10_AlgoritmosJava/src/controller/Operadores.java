package controller;

import util.Teclado;

public class Operadores {

	public static void main (String[] args) 
	{


	String nome;
	nome = Teclado.lertexto("aluno");
	
	int nota1, nota2, nota3, nota4, media;
	
	nota1 = Teclado.lerInt("informe a nota1");
	nota2 = Teclado.lerInt("informe a nota2");
	nota3 = Teclado.lerInt("informe a nota3");
	nota4 = Teclado.lerInt("informe a nota4");

	
    media = nota1+nota2+nota3+nota4;
    
    media = media/4;
    		System.out.println("media: " + media);
	}
}	



