package control;

import model.BD;
import model.Cliente;
import view.ViewCadastrarCliente;

public class ControleCadastrarCliente {

	//Atributo
	private BD bd;

	// metodo construtor
	public ControleCadastrarCliente(BD bd) {
		super();
		this.bd = bd;
	}
	
	// metodo para obter dados do cliente e grava no BD
	public void cadastrarCliente(){
		
		// instanciar a view
		ViewCadastrarCliente vcc = new ViewCadastrarCliente();
		
		//chamar metodo para obter os dados
		vcc.obterDadosCliente();
		
		//instanciar um objeto da classe cliente com os dados digitados 
		// Integer.parseInt()** é converter String para int- numero inteiro
		Cliente c= new Cliente(vcc.getNome(), vcc.getCPF(), Integer.parseInt(vcc.getIdade()));
		
		// guardar cliente no BD
		this.bd.gravarCliente(c);
	}
	
	
	
	
	
}
