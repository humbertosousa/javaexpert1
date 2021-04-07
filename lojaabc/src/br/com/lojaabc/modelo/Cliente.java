package br.com.lojaabc.modelo;

import br.com.lojaabc.lib.PadraoPessoas;

public class Cliente implements PadraoPessoas{
/*
 * Polimorfismo: � o recurso onde um objeto ou m�todo pode conter v�rias formas
 * utilizando o mesmo nome.
 * M�todos:
 * 1� Override (sobrescrita): temos dois m�todos em classes diferentes (pai e filha)
 * e o m�todo da filha ter� prioridade (os par�metros n�o precisam ser os mesmos)
 * 2� Overload (sobrecarga): temos dois m�todso com o mesmo nome na mesma classe.
 * Nesse caso os m�todos devem possuir par�metros distintos obrigatoriamente.
 * Objeto:
 * Ocorre quando o objeto � criado pelo pai e instanciado pelo filho. Exemplo:
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
