package br.com.fiap.implementacao;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Curso;

public class ImplementarCurso {

	
	public static void main(String[] args) {
		
		Curso curso = new Curso(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o código")),
				JOptionPane.showInputDialog("Descrição").toUpperCase(),
				Integer.parseInt(JOptionPane.showInputDialog("Carga Horaria")),
				Float.parseFloat(JOptionPane.showInputDialog("Valor")),
				JOptionPane.showInputDialog("Titulação").toUpperCase()
				);
		
		System.out.println(curso);
		//System.out.println(curso.getDescricao());
		
		
		
		
		

	}

}
