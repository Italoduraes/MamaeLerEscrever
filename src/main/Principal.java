package main;

import java.util.ArrayList;

import model.BD;
import model.Cliente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar o BD
		BD bd=new BD();
		
		// Retornar o ArrayList de Clientes
		
		ArrayList<Cliente> clientes = bd.getClientes();
		
		// Percorrer o ArrayList de Clientes
		
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i));
		}
		

	}

}
