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
	
	public boolean hacerTransaccion(int monto, String cuenta) {
		Cuenta cuentaTransf = this.buscarCuenta(cuenta);
		cuentaTransf.retirarDinero(monto);
		return true;
	}
	
	public void crearCuenta(String numeroCuenta, int maximoRetiros, int valorMaximoARetirar, int capital) {
		Cuenta nuevaCuenta = new Cuenta(numeroCuenta, maximoRetiros, valorMaximoARetirar, capital);
		cuentas.add(nuevaCuenta);
	}
}
