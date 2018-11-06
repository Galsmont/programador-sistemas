package model;

public class Aluno extends Usuário {

	private int matriculaAluno;
	private String nome;
	private String turno;
	private String turma;
	/**
	 * @return the matriculaAluno
	 */
	public int getMatriculaAluno() {
		return matriculaAluno;
	}
	/**
	 * @param matriculaAluno the matriculaAluno to set
	 */
	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
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
	 * @return the turno
	 */
	public String getTurno() {
		return turno;
	}
	/**
	 * @param turno the turno to set
	 */
	public void setTurno(String turno) {
		this.turno = turno;
	}
	/**
	 * @return the turma
	 */
	public String getTurma() {
		return turma;
	}
	/**
	 * @param turma the turma to set
	 */
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	@Override
	
	public void mostrar() {
	
	System.out.println ("Informações de aluno: ");
	System.out.println ("Login: " + super.getLogin ());
	System.out.println ("Senha: *****");
	
	System.out.println ("Matrícula: " + matriculaAluno);
	System.out.println ("Nome " + nome);
	System.out.println ("Turno: " + turno);
	System.out.println ("Turma: " + turma);
	}
	public Aluno () {
		//TODO Auto - generated constructor stub
		super();
	}
	public Aluno (String login, String senha, int tipo, String nome, String turno, String turma, int matriculaAluno) {
		super(login, senha, tipo);
		this.matriculaAluno = matriculaAluno;
		this.nome = nome;
		this.turno = turno;
		this.turma = turma;
	}
}
