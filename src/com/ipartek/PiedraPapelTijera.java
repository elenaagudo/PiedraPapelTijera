package com.ipartek;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PiedraPapelTijera extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PiedraPapelTijera frame = new PiedraPapelTijera();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PiedraPapelTijera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPiedra = new JButton("Piedra");
		btnPiedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPiedra.setBounds(89, 27, 95, 40);
		contentPane.add(btnPiedra);
		
		JButton btnPapel = new JButton("Papel");
		btnPapel.setBounds(285, 27, 95, 40);
		contentPane.add(btnPapel);
		
		JButton btnTijera = new JButton("Tijera");
		btnTijera.setBounds(474, 27, 95, 40);
		contentPane.add(btnTijera);
		
		JButton btnLagarto = new JButton("Lagarto");
		btnLagarto.setBounds(186, 102, 95, 40);
		contentPane.add(btnLagarto);
		
		JButton btnSpock = new JButton("Spock");
		btnSpock.setBounds(386, 102, 95, 40);
		contentPane.add(btnSpock);
		
		JLabel lblEscoger = new JLabel("Has escogido:");
		lblEscoger.setBounds(139, 205, 106, 13);
		contentPane.add(lblEscoger);
		
		JLabel lblOpcionEscogida = new JLabel("");
		lblOpcionEscogida.setBounds(139, 240, 142, 13);
		contentPane.add(lblOpcionEscogida);
		
		JLabel lblCPUEscoger = new JLabel("La CPU ha elegido:");
		lblCPUEscoger.setBounds(358, 205, 123, 13);
		contentPane.add(lblCPUEscoger);
		
		JLabel lblCPUOpcionEscogida = new JLabel("");
		lblCPUOpcionEscogida.setBounds(358, 240, 133, 13);
		contentPane.add(lblCPUOpcionEscogida);
		
		JLabel lblVictorias = new JLabel("Victorias");
		lblVictorias.setBounds(121, 297, 63, 13);
		contentPane.add(lblVictorias);
		
		JLabel lblEmpates = new JLabel("Empates");
		lblEmpates.setBounds(294, 297, 86, 13);
		contentPane.add(lblEmpates);
		
		JLabel lblDerrotas = new JLabel("Derrotas");
		lblDerrotas.setBounds(474, 297, 95, 13);
		contentPane.add(lblDerrotas);
		
		JLabel lblNumVictorias = new JLabel("0");
		lblNumVictorias.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumVictorias.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNumVictorias.setBounds(110, 320, 63, 29);
		contentPane.add(lblNumVictorias);
		
		JLabel lblNumEmpates = new JLabel("0");
		lblNumEmpates.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumEmpates.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNumEmpates.setBounds(282, 320, 63, 29);
		contentPane.add(lblNumEmpates);
		
		JLabel lblNumDerrotas = new JLabel("0");
		lblNumDerrotas.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumDerrotas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNumDerrotas.setBounds(462, 320, 63, 29);
		contentPane.add(lblNumDerrotas);
	}
}
