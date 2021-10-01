package cajaFuerte;

public class CajaFuerte {
	
	//Probando el push
	private boolean estado = true; 
	
	public CajaFuerte() {
		
	}

	public boolean estaAbierta() {	
		return this.estado;
	}

	public void cerrarCaja() {
		this.estado = false;
	}

}
