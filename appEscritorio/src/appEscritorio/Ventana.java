package appEscritorio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private JButton boton;
	private JTextField txtNombre;
	private static final long serialVersionUID = 1L;
	public Ventana()
	{
		setBounds(350, 350, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Titulo 1");
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(100,100,200,36);
		
		boton = new JButton();
		boton.setText("Aceptar");
		boton.setBounds(40,40,140,30);
		boton.addActionListener(new eventoBoton(txtNombre));
			
		setLayout(null);
		getContentPane().add(txtNombre);
		getContentPane().add(boton);
	}
	
	public void setVisibilidad(boolean b)
	{
		setVisible(b);
	}
}

class eventoBoton implements ActionListener
{

	private JTextField txtNombre;
	
	public eventoBoton(JTextField value) {
		txtNombre = value;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(txtNombre.getText()+" esta apretando el boton");
		
	}
	
}