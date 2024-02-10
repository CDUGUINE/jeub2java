package vue;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleur.Controle;
import controleur.Global;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class ChoixJoueur extends JFrame implements Global {

	/**
	 * Panel général
	 */
	private JPanel contentPane;
	/**
	 * Zone de saisie du pseudo
	 */
	private JTextField txtPseudo;	
	/**
	 * Label d'affichage du personnage
	 */
	private JLabel lblPersonnage;
	/**
	 * Numéro du personnage sélectionné
	 */
	private int numPerso;	
	/**
	 * Instance du contrôleur pour communiquer avec lui
	 */
	private Controle controle;  
	
	/**
	 * clic sur la fléche gauche
	 */
	private void lblPrecedent_clic() {
		numPerso = ((numPerso + 1)%NBPERSOS)+1;
		affichePerso();
	}
	
	/**
	 * clic sur la fléche droite
	 */
	private void lblSuivant_clic() {
		numPerso = (numPerso%NBPERSOS)+1;
		affichePerso();
	}
	
	/**
	 * clic sur le bouton GO pour lancer le serveur
	 */
	private void btnGo_clic() {
		if(txtPseudo.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "La saisie d'un pseudo est obligatoire");
			txtPseudo.requestFocus();
		}
		else {
			controle.evenementChoixJoueur(this.txtPseudo.getText(), numPerso);
		}
	}
	
	/**
	 * affiche le personnage dans la fenêtre
	 * @param numPerso
	 */
	private void affichePerso() {
		String chemin = CHEMINPERSONNAGES+PERSO+this.numPerso+MARCHE+1+"d"+1+EXTFICHIERPERSO;
		URL resource = getClass().getClassLoader().getResource(chemin);
		this.lblPersonnage.setIcon(new ImageIcon(resource));
	}
	
	/**
	 * change le pointeur de souris en normal
	 */
	private void sourisNormale() {
		contentPane.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	/**
	 * change le pointeur de souris en doigt pointé
	 */
	private void sourisDoigt() {
		contentPane.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
	/**
	 * Create the frame.
	 */
	public ChoixJoueur(Controle controle) {
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
			@Override
			public void mouseEntered(MouseEvent e) {
				sourisDoigt();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				sourisNormale();
			}
		});
		
		lblPersonnage = new JLabel("");
		lblPersonnage.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonnage.setBounds(180, 150, 39, 44);
		contentPane.add(lblPersonnage);
		lblGo.setBounds(312, 198, 60, 60);
		contentPane.add(lblGo);
		
		JLabel lblSuivant = new JLabel("");
		lblSuivant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblSuivant_clic();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				sourisDoigt();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				sourisNormale();
			}
		});
		lblSuivant.setBounds(295, 146, 38, 45);
		contentPane.add(lblSuivant);
		
		JLabel lblPrecedent = new JLabel("");
		lblPrecedent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblPrecedent_clic();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				sourisDoigt();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				sourisNormale();
			}
		});
		lblPrecedent.setBounds(63, 146, 38, 45);
		contentPane.add(lblPrecedent);
		
		txtPseudo = new JTextField();
		txtPseudo.setBounds(143, 246, 120, 21);
		contentPane.add(txtPseudo);
		txtPseudo.setColumns(10);
		
		JLabel lblFond = new JLabel("");
		URL resource = getClass().getClassLoader().getResource(FONDCHOIX);
		lblFond.setIcon(new ImageIcon(resource));
		lblFond.setBounds(0, 0, 400, 275);
		contentPane.add(lblFond);
		
		// récupération de l'instance de Controle
		this.controle = controle;
		
		this.numPerso = 1;
		this.affichePerso();
	}
}
