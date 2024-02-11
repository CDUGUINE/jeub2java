package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import controleur.Global;

public class Arene extends JFrame implements Global {

	/**
	 * déclaration du panel pour le fond
	 */
	private JPanel contentPane;
	/** 
	 * déclaration du panel pour un mur
	 */
	private JPanel jpnMurs;

	/**
	 * @return the jpnMurs
	 */
	public JPanel getJpnMurs() {
		return jpnMurs;
	}

	/**
	 * @param jpnMurs the jpnMurs to set
	 */
	public void setJpnMurs(JPanel jpnMurs) {
		this.jpnMurs.add(jpnMurs);
		this.jpnMurs.repaint();
	}

	/**
	 * Ajoute un mur dans le panel des murs
	 * @param unMur le mur à ajouter
	 */
	public void ajoutMurs(Object unMur) {
		jpnMurs.add((JLabel)unMur);
		jpnMurs.repaint();
	}
	
	/**
	 * Create the frame.
	 */
	public Arene() {
		// Dimension de la frame en fonction de son contenu
		this.getContentPane().setPreferredSize(new Dimension(LARGEURARENE, HAUTEURARENE + 25 + 140));
		this.pack();
		// interdiction de changer la taille
		this.setResizable(false);
		
		setTitle("Arena");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jpnMurs = new JPanel();
		jpnMurs.setBounds(0, 0, LARGEURARENE, HAUTEURARENE);
		jpnMurs.setOpaque(false);
		jpnMurs.setLayout(null);		
		contentPane.add(jpnMurs);
		
		JLabel lblFond = new JLabel("");
		URL resource = getClass().getClassLoader().getResource(FONDARENE);
		lblFond.setIcon(new ImageIcon(resource));
		lblFond.setBounds(0, 0, 800, 600);
		contentPane.add(lblFond);
	}
}
