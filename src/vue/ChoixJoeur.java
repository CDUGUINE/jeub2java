package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChoixJoeur extends JFrame {

	private JPanel contentPane;

	/**
	 * clic sur la fléche gauche
	 */
	private void flG_clic() {
		System.out.println("précédent");
	}
	
	/**
	 * clic sur la fléche droite
	 */
	private void flD_clic() {
		System.out.println("suivant");
	}
	
	/**
	 * clic sur le bouton GO pour lancer le serveur
	 */
	private void btnGo_clic() {
		(new Arena()).setVisible(true);
			this.dispose();
	}
	
	/**
	 * Create the frame.
	 */
	public ChoixJoeur() {
		// Dimension de la frame en fonction de son contenu
				this.getContentPane().setPreferredSize(new Dimension(400, 275));
				this.pack();setTitle("Choice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGo = new JLabel("");
		lblGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnGo_clic();
			}
		});
		lblGo.setBounds(312, 198, 60, 60);
		contentPane.add(lblGo);
		
		JLabel lblFDroite = new JLabel("");
		lblFDroite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flD_clic();
			}
		});
		lblFDroite.setBounds(295, 146, 38, 45);
		contentPane.add(lblFDroite);
		
		JLabel lblFond = new JLabel("");
		lblFond.setIcon(new ImageIcon(ChoixJoeur.class.getResource("/fonds/fondchoix.jpg")));
		lblFond.setBounds(0, 0, 400, 275);
		contentPane.add(lblFond);
		
		JLabel lblFGauche = new JLabel("");
		lblFGauche.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flG_clic();
			}
		});
		lblFGauche.setBounds(63, 146, 38, 45);
		contentPane.add(lblFGauche);
	}

}
