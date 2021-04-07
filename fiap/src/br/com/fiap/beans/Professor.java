package br.com.fiap.beans;
//Design Patterns
//DTO 
// - atributos privados
// - getters and setters
// - 2 construtores (cheio e o vazio)

public class Professor {

	private Endereco endereco;
	private String nome;
	private String formacao;
	private float salario;
	
	public String aplicarDissidio(float porcentagem) {
		if (porcentagem>0) {
			salario = salario + salario * (porcentagem/100);
		}
		return "Dissidio aplicado";
	}
	
	@Override
	public String toString() {
		return "Professor [endereco=" + endereco + ", nome=" + nome + ", formacao=" + formacao + ", salario=" + salario
				+ "]";
	}
	public Professor() {
		super();
	}
	public Professor(Endereco endereco, String nome, String formacao, float salario) {
		super();
		this.endereco = endereco;
		this.nome = nome;
		this.formacao = formacao;
		this.salario = salario;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
}
