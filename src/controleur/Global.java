package controleur;

/**
 * Global contient toutes les constantes du programme
 * @author cdugu
 *
 */
public interface Global {
	
	/**
	 * N� du port d'�coute du serveur
	 */
	int PORT = 6666;
	/**
	 * Nombre de personnages diff�rents
	 */
	int NBPERSOS = 3;
	/**
	 * Caract�re de s�paration dans un chemin de fichiers
	 */
	String CHEMINSEPARATOR = "/";
	/**
	 * Chemin du dossier des images de fonds
	 */
	String CHEMINFONDS = "fonds"+CHEMINSEPARATOR;
	/**
	 * Chemin du dossier de l'image de la boule
	 */
	String CHEMINBOULES = "boules"+CHEMINSEPARATOR;
	/**
	 * Chemin du dossier de l'image du mur
	 */
	String CHEMINMURS = "murs"+CHEMINSEPARATOR;
	/**
	 * Chemin du dossier des images des personnages
	 */
	String CHEMINPERSONNAGES = "personnages"+CHEMINSEPARATOR;
	/**
	 * Chemin du dossier des sons
	 */
	String CHEMINSONS = "sons"+CHEMINSEPARATOR;
	/**
	 * Chemin de l'image de fond de la vue ChoixJoueur
	 */
	String FONDCHOIX = CHEMINFONDS+"fondchoix.jpg";
	/**
	 * Chemin de l'image de fond de la vue Arene
	 */
	String FONDARENE = CHEMINFONDS+"fondarene.jpg";
	/**
	 * Extension des fichiers des images des personnages
	 */
	String EXTFICHIERPERSO = ".gif";
	/**
	 * D�but du nom des images des personnages
	 */
	String PERSO = "perso";
	/**
	 * Chemin de l'image de la boule
	 */
	String BOULE = CHEMINBOULES+"boule.gif";
	/**
	 * Chemin de l'image du mur
	 */
	String MUR = CHEMINMURS+"mur.gif";
	/**
	 * �tat marche du personnage
	 */
	String MARCHE = "marche";
	/**
	 * �tat touch� du personnage
	 */
	String TOUCHE = "touche";
	/**
	 * �tat mort du personnage
	 */
	String MORT = "mort";
	/**
	 * Caract�re de s�paration dans les chaines transf�r�es
	 */
	String STRINGSEPARE = "~";
	/**
	 * Message "connexion" envoy� par la classe Connection
	 */
	String CONNEXION = "connexion";
	/**
	 * Message "r�ception" envoy� par la classe Connection
	 */
	String RECEPTION = "r�ception";
	/**
	 * Message "d�connexion" envoy� par la classe Connection
	 */
	String DECONNEXION = "d�connexion";
	/**
	 * Message "pseudo" envoy� pour la cr�ation d'un joueur
	 */
	String PSEUDO = "pseudo";
	/**
	 * vie de d�part pour tous les joueurs
	 */
	int MAXVIE = 10 ;
	/**
	 * gain de points de vie lors d'une attaque
	 */
	int GAIN = 1 ; 
	/**
	 * perte de points de vie lors d'une attaque
	 */
	int PERTE = 2 ; 
	/**
	 * largeur d'un mur
	 */
	int LARGEURMUR = 34;
	/**
	 * hauteur d'un mur
	 */
	int HAUTEURMUR = 35;
	/**
	 * largeur d'un joueur
	 */
	int LARGEURPERSO = 34;
	/**
	 * hauteur d'un joueur
	 */
	int HAUTEURPERSO = 44;
	/**
	 * hauteur des messages joueur
	 */
	int HAUTEURMESSAGE = 8;
	/**
	 * largeur de l'ar�ne
	 */
	int LARGEURARENE = 800;
	/**
	 * hauteur de l'ar�ne
	 */
	int HAUTEURARENE = 600;
	/**
	 * nombre de murs
	 */
	int NBMURS = 20;
	/**
	 * orientation persos gauche
	 */
	int GAUCHE = 0;
	/**
	 * orientation persos droite
	 */
	int DROITE = 1;
	/**
	 * valeur d'un pas en pixels
	 */
	int PAS = 10;
	/**
	 * nombre d'�tapes de la marche
	 */
	int NBETAPESMARCHE = 4;
	/**
	 * ordre "ajout phrase" envoy� pour l'ajout d'une phrase au tchat
	 */
	String AJOUTPHRASE = "ajout phrase";
	/**
	 * Message "ajout mur" envoy� pour la cr�ation d'un mur
	 */
	String AJOUTMUR = "ajout mur";
	/**
	 * Message "ajout panel de murs" envoy� pour la cr�ation des murs
	 */
	String AJOUTPANELMURS = "ajout panel murs";
	/**
	 * Message "ajout jlabel jeu" envoy� pour la cr�ation d'un joueur
	 */
	String AJOUTJLABELJEU = "ajout jlabel jeu";
	/**
	 * Message "modification panel du jeu" envoy� pour l'affichage des joueurs
	 */
	String MODIFPANELJEU = "ajout jpanel jeu";
	/**
	 * Message "modification modif tchat" envoy� pour l'affichage d'un nouveau message du tchat
	 */
	String MODIFTCHAT = "modif tchat";
	/**
	 * ordre envoy� au controleur � v�rifier
	 */ 
	String SERVEUR = "serveur";
	/**
	 * ordre envoy� au controleur � v�rifier
	 */ 
	String CLIENT = "client";
	/**
	 * ordre envoy� au controleur � v�rifier
	 */ 
	String TCHAT = "tchat";
	/**
	 * ordre envoy� au controleur � v�rifier
	 */ 
	String ACTION = "action";
}
