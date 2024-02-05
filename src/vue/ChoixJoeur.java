package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ChoixJoeur extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ChoixJoeur() {
		setTitle("Choice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ChoixJoeur.class.getResource("/fonds/fondchoix.jpg")));
		lblNewLabel.setBounds(0, 0, 400, 275);
		contentPane.add(lblNewLabel);
	}

}
