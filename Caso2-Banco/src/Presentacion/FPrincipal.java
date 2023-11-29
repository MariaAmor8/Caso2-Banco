package Presentacion;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FPrincipal extends JFrame{
	JTextField txtNumero;
	JTextField txtMonto;
	
	public void ejecutar() {
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
		
		JButton bEnviar = new JButton("Enviar");
		this.add(bEnviar);
		bEnviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		this.pack();
	}

	public static void main(String[] args) {
		
		FPrincipal principal = new FPrincipal();
		principal.ejecutar();
	}

}
