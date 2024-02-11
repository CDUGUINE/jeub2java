package vue;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import controleur.Controle;

/**
 * Frame de l'entrée dans le jeu (choix entre serveur et client)
 * @author cdug
 *
 */
public class EntreeJeu extends JFrame {

	/**
	 * Panel général
	 */
	private JPanel contentPane;
	/**
	 * Zone de saisie de l'IP
	 */
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
		this.controle.evenementEntreeJeu(this.txtIP.getText());
	}
	
	/** 
	 * clic sur le bouton exit pour quitter l'application
	 */
	private void btnExit_clic() {
		System.exit(0);
	}
	
	/**
	 * Create the frame.
	 * @param controle instance du contrôleur
	 */
	public EntreeJeu(Controle controle) {
		setResizable(false);
		setTitle("Urban Marginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 147);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStartAServer = new JLabel("Start a server :");
		lblStartAServer.setBounds(10, 11, 94, 14);
		contentPane.add(lblStartAServer);
		
		JButton btnStart = new JButton("Start");
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnStart_clic();
			}
		});
		btnStart.setBounds(184, 6, 85, 21);
		contentPane.add(btnStart);
		
		JLabel lblConnectAnExistingServer = new JLabel("Connect an existing server :");
		lblConnectAnExistingServer.setBounds(10, 33, 160, 13);
		contentPane.add(lblConnectAnExistingServer);
		
		JLabel lblIpServer = new JLabel("IP server :");
		lblIpServer.setBounds(10, 56, 70, 13);
		contentPane.add(lblIpServer);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnConnect_clic() ;
			}
		});
		btnConnect.setBounds(184, 52, 85, 21);
		contentPane.add(btnConnect);
		
		txtIP = new JTextField();
		txtIP.setText("127.0.0.1");
		txtIP.setBounds(75, 52, 80, 19);
		contentPane.add(txtIP);
		txtIP.setColumns(10);
				
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnExit_clic();
			}
		});
		btnExit.setBounds(184, 83, 85, 21);
		contentPane.add(btnExit);
		
		// récupération de l'instance de Controle
		this.controle = controle;
	}
	
}
