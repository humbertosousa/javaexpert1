package br.com.lojaabc.modelo;

import br.com.lojaabc.lib.PadraoPessoas;

public class Cliente implements PadraoPessoas{
/*
 * Polimorfismo: é o recurso onde um objeto ou método pode conter várias formas
 * utilizando o mesmo nome.
 * Métodos:
 * 1º Override (sobrescrita): temos dois métodos em classes diferentes (pai e filha)
 * e o método da filha terá prioridade (os parâmetros não precisam ser os mesmos)
 * 2º Overload (sobrecarga): temos dois métodso com o mesmo nome na mesma classe.
 * Nesse caso os métodos devem possuir parâmetros distintos obrigatoriamente.
 * Objeto:
 * Ocorre quando o objeto é criado pelo pai e instanciado pelo filho. Exemplo:
 * Cliente cliente = new PessoaFisica();
 */
	
	private String nome;
	private String email;
	private String fone;
	

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	

	public void setAll(String nome, String email, String fone) {
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	public Cliente(String nome, String email, String fone) {
		super();
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	public Cliente() {
		super();
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", fone=" + fone + "]";
	}
	@Override
	public String getResumo() {
		return nome;
	}
	
	
	
	
}
