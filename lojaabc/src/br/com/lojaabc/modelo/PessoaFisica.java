package br.com.lojaabc.modelo;

import br.com.lojaabc.lib.PadraoPessoas;

public class PessoaFisica extends Cliente implements PadraoPessoas{

	private String cpf;
	private String rg;
	
	@Override // Annotations
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", pessoa=" + super.toString() + "]";
	}

	public PessoaFisica() {
		super();
	}
	
	public void setAll(String nome, String email, String fone, String cpf, String rg) {
		super.setAll(nome, email, fone);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public PessoaFisica(String nome, String email, String fone, String cpf, String rg) {
		super(nome, email, fone);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String getResumo() {
		return super.getNome() + "\n" + cpf;
	}
	
	
	
}
