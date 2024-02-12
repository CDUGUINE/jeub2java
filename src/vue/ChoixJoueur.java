package vue;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import controleur.Controle;
import controleur.Global;

import java.awt.Cursor;
import java.awt.Dimension;

/**
 * Frame du choix du joueur
 * @author emds
 *
 */
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
	 * Instance du contrôleur pour communiquer avec lui
	 */
	private Controle controle;  
	/**
	 * Numéro du personnage sélectionné
	 */
	private int numPerso;
	
	/**
	 * Clic sur la flèche "précédent" pour afficher le personnage précédent
	 */
	private void lblPrecedent_clic() {
		numPerso = ((numPerso + 1)%NBPERSOS)+1;
		affichePerso();
	}
	
	/**
	 * Clic sur la flèche "suivant" pour afficher le personnage suivant
	 */
	private void lblSuivant_clic() {
		numPerso = (numPerso%NBPERSOS)+1;
		affichePerso();
	}
	
	/**
	 * Clic sur GO pour envoyer les informations
	 */
	private void btnGo_clic() {
		if(txtPseudo.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "La saisie d'un pseudo est obligatoire");
			this.txtPseudo.requestFocus();
		} else {
			this.controle.evenementChoixJoueur(this.txtPseudo.getText(), numPerso);
		}
	}
	
	/**
	 * Affichage du personnage correspondant au numéro numPerso
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
	 * change le pointeur de souris en forme de doigt pointé
	 */
	private void sourisDoigt() {
		contentPane.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
	/**
	 * Create the frame.
	 * @param controle instance du contrôleur
	 */
	public ChoixJoueur(Controle controle) {
		// Dimension de la frame en fonction de son contenu
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
		this.pack();
		// interdiction de changer la taille
		this.setResizable(false);
				
		setTitle("Choice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPersonnage = new JLabel("");
		lblPersonnage.setBounds(180, 150, 39, 44);
		lblPersonnage.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblPersonnage);	

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
		
		txtPseudo = new JTextField();
		txtPseudo.setBounds(143, 246, 120, 21);
		contentPane.add(txtPseudo);
		txtPseudo.setColumns(10);
		
		lblGo.setBounds(312, 198, 60, 60);
		contentPane.add(lblGo);
		lblSuivant.setBounds(295, 146, 38, 45);
		contentPane.add(lblSuivant);	
		lblPrecedent.setBounds(63, 146, 38, 45);
		contentPane.add(lblPrecedent);			
				
		JLabel lblFond = new JLabel("");
		URL resource = getClass().getClassLoader().getResource(FONDCHOIX);
		lblFond.setIcon(new ImageIcon(resource));
		lblFond.setBounds(0, 0, 400, 275);
		contentPane.add(lblFond);
		
		// récupération de l'instance de Controle
		this.controle = controle;
		
		// affichage du premier personnage
		this.numPerso = 1;
		this.affichePerso();
		
		// positionnement sur la zone de saisie
		txtPseudo.requestFocus();	
		
	}
}
