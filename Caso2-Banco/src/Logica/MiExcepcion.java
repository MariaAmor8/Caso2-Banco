package Logica;

public class MiExcepcion extends Exception{
	String mensaje;
	
	MiExcepcion(String mensaje){
		this.mensaje = mensaje;
	}

	@Override
	public String getMessage() {
		return this.mensaje;
	}
	
	
}
