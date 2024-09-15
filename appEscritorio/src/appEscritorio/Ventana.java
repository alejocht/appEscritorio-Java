package appEscritorio;

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
		
		setLayout(null);
		getContentPane().add(boton);
	}
	
	public void setVisibilidad(boolean b)
	{
		setVisible(b);
	}
}
