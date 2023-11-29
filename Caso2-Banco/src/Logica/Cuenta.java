package Logica;

public class Cuenta {
	private String numeroCuenta;
	private int maximoRetiros;
	private int valorMaximoARetirar;
	private int capital;
	
	
	public Cuenta(String numeroCuenta, int maximoRetiros, int valorMaximoARetirar, int capital) {
		this.numeroCuenta = numeroCuenta;
		this.maximoRetiros = maximoRetiros;
		this.valorMaximoARetirar = valorMaximoARetirar;
		this.capital = capital;
	}


	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public int getMaximoRetiros() {
		return maximoRetiros;
	}


	public int getValorMaximoARetirar() {
		return valorMaximoARetirar;
	}
	
	public void retirarDinero(int monto) {
		this.capital -= monto;
	}
}
