package Logica;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cuenta> cuentas;
	
	public Banco(){
		this.cuentas = new ArrayList<Cuenta>();
	}
	
	private Cuenta buscarCuenta(String numeroCuenta) {
		for(Cuenta cuenta: cuentas) {
			if(numeroCuenta.equals(cuenta.getNumeroCuenta())) {
				return cuenta;
			}
		}
		return null;
	}
	
	public void hacerTransaccion(int monto, String cuenta) throws MiExcepcion {
		Cuenta cuentaTransf = this.buscarCuenta(cuenta);
		if(cuentaTransf == null) {
			throw new MiExcepcion("la cuenta no existe");
		}
		else {
			cuentaTransf.retirarDinero(monto);
		}
	}
	
	public void crearCuenta(String numeroCuenta, int maximoRetiros, int valorMaximoARetirar, int capital) {
		Cuenta nuevaCuenta = new Cuenta(numeroCuenta, maximoRetiros, valorMaximoARetirar, capital);
		cuentas.add(nuevaCuenta);
	}
}
