package view;

import javax.swing.JOptionPane;

public class ViewClienteExiste {
	
	// metodo para exibir mensagem de cliente existente 
	public void exibirMensagemClienteExiste(){
		JOptionPane.showMessageDialog(null,"Cliente Já existente!",  "Erro",JOptionPane.ERROR_MESSAGE);
	}

}
