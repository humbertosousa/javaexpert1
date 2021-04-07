package br.com.fiap.beans;

public class Turma {

	private int id;
	private String sigla;
	private String periodo;
	private Curso curso;
	private Aluno aluno;
	private Professor professor;

	@Override
	public String toString() {
		return "Turma [id=" + id + ", sigla=" + sigla + ", periodo=" + periodo + ", curso=" + curso + ", aluno=" + aluno
				+ ", professor=" + professor + "]";
	}
	public Turma() {
		super();
	}
	public Turma(int id, String sigla, String periodo, Curso curso, Aluno aluno, Professor professor) {
		super();
		this.id = id;
		this.sigla = sigla;
		this.periodo = periodo;
		this.curso = curso;
		this.aluno = aluno;
		this.professor = professor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
}
