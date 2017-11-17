package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {

	// Atributo
	
	private ArrayList<Cliente> clientes;
	private String fileName = "clientes.txt";
	private DocumentWriter dw;
	private DocumentReader dr;
	
	// metodo construtor 
	
	public BD(){
		// instanciar o ArrayList
		this.clientes = new ArrayList<Cliente>();

		// instanciar o documentReader
		this.dr = new DocumentReader();
		// instanciar o DocumentWriter
		this.dw = new DocumentWriter();
	}
	
	// Metodo que carrega todos os clientes do arquivo para o ArrayList
	
	public void carregarClientes(){
		//ler as linhas do arquivo
		ArrayList<String> linhas = this.dr.read(this.fileName);
		
		//Percorer o ArrayList criando os clientes
		
		for (int i = 0; i <linhas.size(); i++) {
			// Separa a linha em um array de String
			String[] linhaCliente = linhas.get(i).split(";");
			//Cria o cliente com os dados da linha
			Cliente c= new Cliente(linhaCliente[0], linhaCliente[1], Integer.parseInt(linhaCliente[2]));
			// Coloca o Cliente no ArrayList 
			this.clientes.add(c);
		}
	}
	
	
	
	// metodo que verificar se ja existe cliente com o CPF informado
	public boolean existeCliente(String CPF){
		
		boolean retorno = false;
		// percorrer a arraylist
		for (int i = 0; i < this.clientes.size(); i++) {
			// verificar se existe cliente com mesmo CPF
			if (this.clientes.get(i).getCPF().equals(CPF)){
				retorno = true;
			}
		}
		return retorno;
	}
	
	
	
	
	// metodo que grava cliente 
	
	public void gravarCliente (Cliente c){
		// colocar o cliente no ArrayList
		this.clientes.add(c);
		
		// gravar o cliente no arquivo
		dw.write(this.fileName, c.toLinha());
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
}
