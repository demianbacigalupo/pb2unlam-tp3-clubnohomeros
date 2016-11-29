package ar.edu.unlam.pb2.ClubDeLosNoHomeros;



import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;


public class ClubTest {
	
	@Test
	public void queElClubSeCreeCerrado(){
		Club miClub = new Club();
		
		Boolean valorActual = miClub.BarEstado();
		
		Assert.assertFalse(valorActual);
	}
	
	@Test
	public void queElClubNoAdmitaMasDeUnHomero(){
		Club miClub = new Club();
		
		Cliente miCliente1 = new Cliente("Homero",45);
		Cliente miCliente2 = new Cliente("Homero",54);
		
		miClub.EntraCliente(miCliente1);
		miClub.EntraCliente(miCliente2);
		
		Integer valorEsperado = 1;
		
		Integer valorActual = miClub.PresentarClientes().size();
		
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void queLosClientesSePresentenOrdenadosPorNombre(){
		Club miClub = new Club();
		
		TreeSet <Cliente> ListaClientes = new TreeSet<Cliente>();
		
		Cliente miCliente1 = new Cliente ("Alberto",45);
		Cliente miCliente2 = new Cliente ("Jose",35);
		Cliente miCliente3 = new Cliente ("Aaron",54);
		
		miClub.EntraCliente(miCliente1);
		miClub.EntraCliente(miCliente2);
		miClub.EntraCliente(miCliente3);
		
		Iterator<Cliente> it = ListaClientes.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next().getNombre());
		}		
		
	}

}
