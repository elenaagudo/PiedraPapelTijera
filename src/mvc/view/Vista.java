package mvc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mvc.controller.Controlador;

public class Vista extends JFrame implements ActionListener {

	private Controlador controlador;
	private JPanel panelJuego;
	private JButton btnPiedra, btnPapel, btnTijera, btnLagarto, btnSpock;
	private String opcionCPU, opcionUsuario;
	private JLabel lblCPUOpcionEscogida, lblUsuarioOpcionEscogida, lblNumeroVictorias, lblNumeroEmpates, lblNumeroDerrotas;

	public Vista(Controlador controlador) {
		this.controlador = controlador;
	}

	public void crearVentana() {
		setBounds(400, 70, 800, 650);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setTitle("PIEDRA, PAPEL, TIJERA, LAGARTO O SPOCK");
		crearPanelJuego();
	}

	public void crearPanelJuego() {
		panelJuego = new JPanel();
		panelJuego.setLayout(null);
		panelJuego.setBounds(0, 0, 950, 650);
		add(panelJuego);
		panelJuego();
	}

	public void panelJuego() {
		/*
		 * BOTONES
		 * */
		btnPiedra = new JButton("Piedra");
		btnPiedra.setBounds(170,50,100,30);
		panelJuego.add(btnPiedra);
		btnPiedra.addActionListener(this);
		
		btnPapel = new JButton("Papel");
		btnPapel.setBounds(320,50,100,30);
		panelJuego.add(btnPapel);
		btnPapel.addActionListener(this);
		
		btnTijera = new JButton("Tijera");
		btnTijera.setBounds(470,50,100,30);
		panelJuego.add(btnTijera);
		btnTijera.addActionListener(this);
		
		btnLagarto = new JButton("Lagarto");
		btnLagarto.setBounds(250,120,100,30);
		panelJuego.add(btnLagarto);
		btnLagarto.addActionListener(this);
		
		btnSpock = new JButton("Spock");
		btnSpock.setBounds(400,120,100,30);
		panelJuego.add(btnSpock);
		btnSpock.addActionListener(this);
		
		/*
		 * LABEL Opciones Elegidas por el Usuario y por la CPU
		 * */
		JLabel lblUsuarioEscoger = new JLabel("Has elegido: ");
		lblUsuarioEscoger.setBounds(170,200,150,30);
		panelJuego.add(lblUsuarioEscoger);
		
		lblUsuarioOpcionEscogida = new JLabel("Opción elegida por el Usuario");
		lblUsuarioOpcionEscogida.setBounds(170, 250, 150, 30);
		panelJuego.add(lblUsuarioOpcionEscogida);
		
		JLabel lblCPUEscoger = new JLabel("La CPU ha elegido: ");
		lblCPUEscoger.setBounds(470,200,150,30);
		panelJuego.add(lblCPUEscoger);
		
		lblCPUOpcionEscogida = new JLabel("Opcion elegida por la CPU");
		lblCPUOpcionEscogida.setBounds(470, 250, 150, 30);
		panelJuego.add(lblCPUOpcionEscogida);
		
		/*
		 * LABEL Numero de Victorias, Empates y Derrotas
		 * */
		JLabel lblVictorias = new JLabel("Victorias:");
		lblVictorias.setBounds(170, 400, 150, 30);
		panelJuego.add(lblVictorias);
		
		lblNumeroVictorias = new JLabel("0");
		lblNumeroVictorias.setBounds(170, 420, 50, 50);
		panelJuego.add(lblNumeroVictorias);
		
		JLabel lblEmpates = new JLabel("Empates:");
		lblEmpates.setBounds(350, 400, 150, 30);
		panelJuego.add(lblEmpates);
		
		lblNumeroEmpates = new JLabel("0");
		lblNumeroEmpates.setBounds(350, 420, 50, 50);
		panelJuego.add(lblNumeroEmpates);
		
		JLabel lblDerrotas = new JLabel("Derrotas:");
		lblDerrotas.setBounds(530, 400, 150, 30);
		panelJuego.add(lblDerrotas);
		
		lblNumeroDerrotas = new JLabel("0");
		lblNumeroDerrotas.setBounds(530, 420, 50, 50);
		panelJuego.add(lblNumeroDerrotas);
	}

	
	/*
	 * Cada vez que se hace click en un boton llama a una funcion
	 * del controlador, que a su vez llama a una funcion del modelo
	 * donde genera la opcion que elige la CPU
	 * 
	 * Se muestra por pantalla la opcion elegida por el usuario
	 * y la opcion elegida por la CPU
	 * 
	 * */
	@Override
	public void actionPerformed(ActionEvent e) {
		opcionCPU = controlador.obtenerOpcionCPU();
		if(e.getSource() == btnPiedra) {
			opcionUsuario = "Piedra";
		} else if(e.getSource() == btnPapel) {
			opcionUsuario = "Papel";
		} else if(e.getSource() == btnTijera) {
			opcionUsuario = "Tijera";
		} else if(e.getSource() == btnLagarto) {
			opcionUsuario = "Lagarto";
		} else if(e.getSource() == btnSpock) {
			opcionUsuario = "Spock";
		}
		lblUsuarioOpcionEscogida.setText(opcionUsuario);
		lblCPUOpcionEscogida.setText(opcionCPU);
		//funcion para comparar la opcion del usuario y la opcion de la CPU
		
	}
}
