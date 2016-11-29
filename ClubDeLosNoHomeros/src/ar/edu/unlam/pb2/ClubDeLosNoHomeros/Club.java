package ar.edu.unlam.pb2.ClubDeLosNoHomeros;

import java.util.TreeSet;


public class Club {
	
	private Boolean abierto;
	public TreeSet<Cliente> ListaClientes;
	
	public Club(){
		this.abierto=false;
		this.ListaClientes = new TreeSet<Cliente>();
	}
	
	public void SeAbreElBar(){
		this.abierto=true;
	}
	
	public void SeCierraElBar(){
		this.abierto=false;
	}
	
	public Boolean BarEstado(){
		return abierto;
	}
	
	public void EntraCliente(Cliente cliente){
		this.ListaClientes.add(cliente);
	}
	
	public TreeSet<Cliente> PresentarClientes(){
		return ListaClientes;
	}

}
