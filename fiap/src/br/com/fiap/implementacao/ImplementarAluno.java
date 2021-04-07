package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Endereco;

public class ImplementarAluno {

	public static void main(String[] args) {
	
		Aluno objeto = new Aluno();
		objeto.setEmail("humberto@fiap.com.br");
		objeto.setFone("996151212");
		objeto.setNome("1berto");
		objeto.setRm(123);
		
		System.out.println(objeto.getEmail());
		System.out.println(objeto.getFone());
		System.out.println(objeto.getRm());
		System.out.println(objeto.getNome());
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Avenida Lins de Vasconcelos");
		endereco.setNumero("1222");
		endereco.setBairro("Aclimação");
		endereco.setCidade("São Paulo");
		endereco.setUf("SP");
		endereco.setCep("12345-123");
		
		Aluno objeto2 = new Aluno();		
		objeto2.setAll(
				456, 
				"XPTO", 
				"xpto@xpto.com.br", 
				"4321-0000",
				endereco
				);
		System.out.println(objeto2.toString());
		System.out.println(endereco.getBairro());
	
		
		
		
		

	}

}
