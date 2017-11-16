package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Cliente;

public class ViewExibirCliente {
	
	// Metodo Costrutor 
	public void ExibirCliente(ArrayList<Cliente> clientes){
		// instanciar String para exibicao
		String todosCLientes= "";
		//percorrer o ArrayList 
		for (int i = 0; i <clientes.size(); i++) {
			todosCLientes = todosCLientes + clientes.get(i).toString() + "\n";
		}
		// exibir todos os clientes 
		JOptionPane.showMessageDialog(null, todosCLientes);
	}

}
