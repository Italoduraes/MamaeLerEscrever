package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {

	// Atributo
	
	private ArrayList<Cliente> clientes;
	private String fileName = "clientes.txt";
	
	// metodo construtor 
	
	public BD(){
		// instanciar o ArrayList
		this.clientes = new ArrayList<Cliente>();

		// instanciar o documentReader
		DocumentReader dr = new DocumentReader();
		//ler as linhas do arquivo
		ArrayList<String> linhas = dr.read(fileName);
		
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
	
	// metodo que grava cliente 
	
	public void gravarCliente (Cliente c){
		// colocar o cliente no ArrayList
		this.clientes.add(c);
		//transformar cliente em String
		String cliente = c.getNome() + ";" + c.getCPF() +  ";" + c.getIdade();
		// instanciar o documentWriter
		DocumentWriter dw = new DocumentWriter();
		// gravar o cliente no arquivo
		dw.write(this.fileName, cliente);
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
}
