package controleur;

import java.awt.Frame;

import vue.EntreeJeu;
import vue.Arene;
import vue.ChoixJoueur;
import modele.Jeu;
import modele.JeuClient;
import modele.JeuServeur;
import outils.connexion.AsyncResponse;
import outils.connexion.ClientSocket;
import outils.connexion.Connection;
import outils.connexion.ServeurSocket;

/**
 * Contrôleur et point d'entrée de l'applicaton
 * 
 * @author emds
 *
 */
public class Controle implements AsyncResponse, Global {

	/**
	 * frame EntreeJeu
	 */
	private EntreeJeu frmEntreeJeu;
	/**
	 * frame Arene
	 */
	private Arene frmArene;
	/**
	 * frame ChoixJoueur
	 */
	private ChoixJoueur frmChoixJoueur;

	/**
	 * déclaration du jeu
	 */
	private Jeu leJeu;
	
	/**
	 * Méthode de démarrage
	 * 
	 * @param args non utilisé
	 */
	public static void main(String[] args) {
		new Controle();
	}

	/**
	 * Constructeur
	 */
	private Controle() {
		this.frmEntreeJeu = new EntreeJeu(this);
		this.frmEntreeJeu.setVisible(true);
	}

	public void evenementEntreeJeu(String info) {
		if (info.equals("serveur")) {
			new ServeurSocket(this, PORT);
			this.leJeu = new JeuServeur(this);
			this.frmEntreeJeu.dispose();
			this.frmArene = new Arene();
			this.frmArene.setVisible(true);
		} else {
			new ClientSocket(this, info, PORT);
		}
	}
	
	public void evenementChoixJoueur(String pseudo, int numPerso) {
		this.frmChoixJoueur.dispose();
		this.frmArene.setVisible(true);
		((JeuClient)leJeu).envoi(PSEUDO+STRINGSEPARE+pseudo+STRINGSEPARE+numPerso );
		}
	
	/**
	 * Envoi d'information vers l'ordinateur distant
	 * @param connection objet de connection pour l'envoi vers l'rdianteur distant
	 * @param info information à envoyer
	 */
	public void envoi(Connection connection, Object info) {
		connection.envoi(info);
	}

	@Override
	public void reception(Connection connection, String ordre, Object info) {
		// TODO Auto-generated method stub
		switch (ordre) {
		case CONNEXION :
			if (!(this.leJeu instanceof JeuServeur)) {
				this.leJeu = new JeuClient(this);
				this.leJeu.connexion(connection);
				this.frmEntreeJeu.dispose();
				this.frmArene = new Arene();
				this.frmChoixJoueur = new ChoixJoueur(this);
				this.frmChoixJoueur.setVisible(true);
			}
			else {
				this.leJeu.connexion(connection);
			}
			break;
		case RECEPTION :
			this.leJeu.reception(connection, info);
			break;
		case DECONNEXION :
			break;
		}
	}
}
