package model;

public class Professor extends Usu�rio {

	private int matriculaProfessor;
	private String nome;
	private String especialidade;
	/**
	 * @return the matriculaProfessor
	 */
	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}
	/**
	 * @param matriculaProfessor the matriculaProfessor to set
	 */
	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the especialidade
	 */
	public String getEspecialidade() {
		return especialidade;
	}
	/**
	 * @param especialidade the especialidade to set
	 */
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
		public Professor () {
			//TODO Auto - generated constructor stub
			super();
		}
		public Professor (String login, String senha, int tipo, String nome, String especialidade, int matriculaProfessor) {
			super(login, senha, tipo);
			this.matriculaProfessor = matriculaProfessor ;
			this.nome = nome;
			this.especialidade = especialidade;
	}
		@Override
		public void mostrar() {
			// TODO Auto-generated method stub

			System.out.println ("Informa��es de professor: ");
			System.out.println ("Login: " + super.getLogin ());
			System.out.println ("Senha: *****");
			
			System.out.println ("Matr�cula: " + matriculaProfessor);
			System.out.println ("Nome " + nome);
			System.out.println ("Especialidade: " + especialidade);
	}						
	}
