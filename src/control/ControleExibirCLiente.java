package control;

import java.util.ArrayList;

import model.BD;
import model.Cliente;
import view.ViewExibirCliente;

public class ControleExibirCLiente {
	
	// atributos
	 private BD bd;
	 private ViewExibirCliente vec;
	 
	 public ControleExibirCLiente(BD bd){
		 this.bd = bd;
		 // instanciar a view
		 this.vec = new ViewExibirCliente();
	 }
	 
	 // metodo que recupera os clientes e exibi
	 
	 public void exibirCliente(){
		 // retornar o ArrayList de Clientes
		 ArrayList<Cliente> clientes = this.bd.getClientes();
		// Executa o metodo para exibir todos os clientes 
		 this.vec.ExibirCliente(clientes);
	 }

}
