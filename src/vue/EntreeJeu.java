package vue;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import controleur.Controle;

public class EntreeJeu extends JFrame {

	private JPanel contentPane;
	private JTextField txtIP;

	/**
	 * Instance du contrôleur pour communiquer avec lui
	 */
	private Controle controle;  
	
	/**
	 * clic sur le bouton start pour lancer le serveur
	 */
	private void btnStart_clic() {
		this.controle.evenementEntreeJeu("serveur");
	}
	
	/**
	 * clic sur le bouton connect pour choisir un joueur
	 */
	private void btnConnect_clic() {
		this.controle.evenementEntreeJeu(txtIP.getText());
	}
	
	/** 
	 * clic sur le bouton exit pour quitter l'application
	 */
	private void btnExit_clic() {
		System.exit(0);
	}
	
	/**
	 * Create the frame.
	 */
	public EntreeJeu(Controle controle) {
		setResizable(false);
		setTitle("Urban Marginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 147);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Start a server :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 10, 90, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Connect an existing server :");
		lblNewLabel_1.setBounds(10, 33, 160, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("IP server :");
		lblNewLabel_2.setBounds(10, 56, 70, 13);
		contentPane.add(lblNewLabel_2);
		
		txtIP = new JTextField();
		txtIP.setText("127.0.0.1");
		txtIP.setBounds(75, 52, 80, 19);
		contentPane.add(txtIP);
		txtIP.setColumns(10);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnStart_clic();
			}
		});
		
		btnStart.setBounds(184, 6, 85, 21);
		contentPane.add(btnStart);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConnect_clic();
			}
		});
		btnConnect.setBounds(184, 52, 85, 21);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit_clic();
			}
		});
		btnExit.setBounds(184, 83, 85, 21);
		contentPane.add(btnExit);
		
		// récupération de l'instance de Controle
		this.controle = controle;
	}
}
