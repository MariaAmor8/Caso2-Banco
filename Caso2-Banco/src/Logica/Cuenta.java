package Logica;

public class Cuenta {
	private String numeroCuenta;
	private int maximoRetiros;
	private int valorMaximoARetirar;
	private int capital;
	private int numeroTransaccionesHechas;
	private int saldoRetirado;
	
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
	
	public void retirarDinero(int monto)throws MiExcepcion {
		if(monto > this.capital) {
			throw new MiExcepcion("no hay suficiente saldo");
		}
		else if(this.numeroTransaccionesHechas >= this.maximoRetiros) {
			throw new MiExcepcion("numero de transacciones superada");
		}
		else if(this.saldoRetirado > this.valorMaximoARetirar || 
				monto > this.valorMaximoARetirar ) {
			throw new MiExcepcion("limite de saldo por día superado");
		}
		else {
			this.capital -= monto;
			this.numeroTransaccionesHechas += 1;
			this.saldoRetirado += monto;
		}
		
	}
}
