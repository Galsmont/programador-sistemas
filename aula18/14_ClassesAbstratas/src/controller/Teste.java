package controller;
import model .*;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Usu�rio usu = new Usu�rio ();
		Professor prof = new Professor ("joaquim", "joaquim123", 0, "joaquim da silva", "Doutor", 1123);
			prof.mostrar();
			System.out.println("------------------");
		
		Aluno aluno = new Aluno ("muzi", "muzi123", 1, "Sergio Muzi", "primeiro", "tarde", 32115);
		aluno.mostrar();
	}

}
