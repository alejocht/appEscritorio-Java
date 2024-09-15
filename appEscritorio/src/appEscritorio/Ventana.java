package appEscritorio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame {

	private JButton boton;
	private static final long serialVersionUID = 1L;
	public Ventana()
	{
		setBounds(350, 350, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Titulo 1");
		
		boton = new JButton();
		boton.setText("Aceptar");
		boton.setBounds(40,40,140,30);
		boton.addActionListener(new eventoBoton());
		setLayout(null);
		getContentPane().add(boton);
	}
	
	public void setVisibilidad(boolean b)
	{
		setVisible(b);
	}
}

class eventoBoton implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Esta presionando el boton Aceptar");
		
	}
	
}