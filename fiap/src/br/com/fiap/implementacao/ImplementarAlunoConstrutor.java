package br.com.fiap.implementacao;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Endereco;
import br.com.fiap.lib.Magica;

public class ImplementarAlunoConstrutor {

	public static void main(String[] args) {
		Aluno objeto = new Aluno(
				Magica.i("RM"),
				Magica.s("Nome"),
				Magica.s("Email"),
				Magica.s("Fone"),
				new Endereco(
						Magica.s("Logradouro"),
						"1222",	"",	"Aclimacao","Sampa","SP", "12345-123"
						)
				);
		JOptionPane.showMessageDialog(null, objeto.toString());
		System.out.println(objeto.getEndereco().getBairro());
		
	}

}
