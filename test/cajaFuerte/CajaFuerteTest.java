package cajaFuerte;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaFuerteTest {

	@Test
	public void alCrearCajaFuerteDebeEstarAbiertaTest() {
		CajaFuerte caja = new CajaFuerte();
		assertTrue(caja.estaAbierta()); 
		
	}

}
