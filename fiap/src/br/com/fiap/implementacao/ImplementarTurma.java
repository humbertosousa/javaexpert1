package br.com.fiap.implementacao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Curso;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Professor;
import br.com.fiap.beans.Turma;

public class ImplementarTurma {

	public static void main(String[] args) {

		Turma turma = new Turma(
				1,
				"1C",
				"M",
				new Curso(
						2,
						"desc",
						200,
						5000,
						"Especial"
						),
				new Aluno(
						123,
						"nome",
						"email",
						"1234-1234",
						new Endereco(
								"logradouro",
								"complemento",
								"numero",
								"bairro",
								"cidade",
								"uf",
								"cep"
								)
						),
				new Professor(
						new Endereco(
								"logradouro",
								"complemento",
								"numero",
								"bairro",
								"cidade",
								"uf",
								"cep"
								),
						"prof",
						"forma",
						3000
						)
				);
		
		System.out.println("Nome do professor: " + turma.getProfessor().getNome());
		System.out.println("Nome do aluno: " + turma.getAluno().getNome());
		System.out.println("Log do aluno:" + turma.getAluno().getEndereco().getLogradouro());
		System.out.println("Desc do Curso: " + turma.getCurso().getDescricao());
		System.out.println("Valor do Curso: " + turma.getCurso().getValor());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
