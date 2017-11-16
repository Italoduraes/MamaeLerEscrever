package view;

import javax.swing.JOptionPane;

public class ViewCadastrarCliente {

	// Atributos
	private String nome;
	private String CPF;
	private String idade;
	
	
	
	
	
	
	// metodo get e set 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	// metodo para obter dados do clientes a ser inserido
	
	public void  obterDadosCliente(){
		// obtendo dados do cliente
		this.setNome(JOptionPane.showInputDialog("Informe o nome do Cliente: "));
		this.setCPF(JOptionPane.showInputDialog("Informe o CPF do Cliente: "));
 	    this.setIdade(JOptionPane.showInputDialog("Informe o idade do Cliente: "));
	}
	
	
	
	
	
	
	
	
	
}
