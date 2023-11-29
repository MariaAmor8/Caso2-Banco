package Presentacion;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Logica.Banco;
import Logica.MiExcepcion;

public class FPrincipal extends JFrame{
	JTextField txtNumero;
	JTextField txtMonto;
	Banco banco;
	
	public void ejecutar() {
		this.banco = new Banco();
		banco.crearCuenta("10-2", 3, 30, 100);
		
		this.setPreferredSize(new Dimension(350,250));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Banco");
		this.setLocationRelativeTo(null);
		
		this.setLayout(new GridLayout(3,2));
		this.add(new JLabel("Numero de cuenta"));
		this.txtNumero = new JTextField();
		this.add(this.txtNumero);
		this.add(new JLabel("Monto"));
		this.txtMonto = new JTextField();
		this.add(this.txtMonto);
		
		JButton bEnviar = new JButton("Retirar");
		this.add(bEnviar);
		bEnviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				hacerTransaccion();
			}
		});
		
		this.pack();
	}

	protected void hacerTransaccion() {
		String numeroCuenta = this.txtNumero.getText();
		int monto = Integer.parseInt(this.txtMonto.getText());
		try {
			this.banco.hacerTransaccion(monto, numeroCuenta);
			JOptionPane.showMessageDialog(this, "Proceso exitoso");
		} catch (MiExcepcion e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
		
		this.txtMonto.setText("");
		this.txtNumero.setText("");
	}

	public static void main(String[] args) {
		
		FPrincipal principal = new FPrincipal();
		principal.ejecutar();
	}

}
