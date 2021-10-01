package cajaFuerte;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaFuerteTest {

	@Test
	public void alCrearCajaFuerteDebeEstarAbiertaTest() {
		CajaFuerte caja = new CajaFuerte();
		assertTrue(caja.estaAbierta()); 	
	}
	
	@Test
	public void alCerrarCajaFuerteDebeEstarCerradaTest() {
		CajaFuerte caja = new CajaFuerte();
		caja.cerrarCaja();
		assertFalse(caja.estaAbierta()); 	
	}

}
