package model;

public class Cliente {

	//Atributos
	
	private String nome;
	private String CPF;
	private int idade;
	

	
	@Override
	public String toString() {
		return "Cliente - Nome= " + nome + "\n" +
				"CPF= " + CPF + "\n" +
				"Idade=" + idade + "]";
	}


	// metodo construtor 
	public Cliente(String nome, String cPF, int idade) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.idade = idade;
	}
	
	
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	
	
	
	
}
