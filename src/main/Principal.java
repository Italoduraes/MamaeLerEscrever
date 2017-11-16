package main;

import java.util.ArrayList;

import control.ControleCadastrarCliente;
import control.ControleExibirCLiente;
import model.BD;
import model.Cliente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar o BD
		BD bd=new BD();
		//instanciar controleExibirClientes
		ControleExibirCLiente cec = new ControleExibirCLiente(bd);
		// instanciar ControleCadastrarCLientes
		ControleCadastrarCliente ccc= new ControleCadastrarCliente(bd);
		
		//Exibir todos os clientes
		cec.exibirCliente();
		
		// inserir um novo cliente
		ccc.cadastrarCliente();
		
		//Exibir todos os clientes novamente
		cec.exibirCliente();
		

	}

}
