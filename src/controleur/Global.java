package controleur;

/**
 * Global contient toutes les constantes du programme
 * @author cdugu
 *
 */
public interface Global {
	
	/**
	 * N° du port d'écoute du serveur
	 */
	int PORT = 6666;
	/**
	 * Nombre de personnages différents
	 */
	int NBPERSOS = 3;
	/**
	 * Caractère de séparation dans un chemin de fichiers
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
	 * Chemin du son précédent
	 */
	String SONPRECEDENT = CHEMINSONS+"precedent.wav";
	/**
	 * Chemin du son suivant
	 */
	String SONSUIVANT = CHEMINSONS+"suivant.wav";
	/**
	 * Chemin du son welcome
	 */
	String SONWELCOME = CHEMINSONS+"welcome.wav";	
	/**
	 * Chemin du son go
	 */
	String SONGO = CHEMINSONS+"go.wav";
	/**
	 * Chemin du son fight
	 */
	String SONFIGHT = CHEMINSONS+"fight.wav";
	/**
	 * Chemin du son hurt
	 */
	String SONHURT = CHEMINSONS+"hurt.wav";
	/**
	 * Chemin du son death
	 */
	String SONDEATH = CHEMINSONS+"death.wav";
	/**
	 * tableau pour les sons
	 */
	String[] SON = {SONFIGHT, SONHURT, SONDEATH};
	/** numéro correspondant au son FIGHT
	 */
	int FIGHT = 0;
	/**
	 * numéro correspondant au son HURT
	 */
	int HURT = 1;
	/**
	 * numéro correspondant au son DEATH
	 */
	int DEATH = 2;
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
	 * Début du nom des images des personnages
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
	 * état marche du personnage
	 */
	String MARCHE = "marche";
	/**
	 * état touché du personnage
	 */
	String TOUCHE = "touche";
	/**
	 * état mort du personnage
	 */
	String MORT = "mort";
	/**
	 * Caractère de séparation dans les chaines transférées
	 */
	String STRINGSEPARE = "~";
	/**
	 * Message "connexion" envoyé par la classe Connection
	 */
	String CONNEXION = "connexion";
	/**
	 * Message "réception" envoyé par la classe Connection
	 */
	String RECEPTION = "réception";
	/**
	 * Message "déconnexion" envoyé par la classe Connection
	 */
	String DECONNEXION = "déconnexion";
	/**
	 * Message "pseudo" envoyé pour la création d'un joueur
	 */
	String PSEUDO = "pseudo";
	/**
	 * vie de départ pour tous les joueurs
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
	 * largeur de la boule
	 */
	int LARGEURBOULE = 17;
	/**
	 * hauteur de la boule
	 */
	int HAUTEURBOULE = 17;
	/**
	 * largeur de l'arène
	 */
	int LARGEURARENE = 800;
	/**
	 * hauteur de l'arène
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
	 * nombre d'étapes de la marche
	 */
	int NBETAPESMARCHE = 4;
	/**
	 * ordre "ajout phrase" envoyé pour l'ajout d'une phrase au tchat
	 */
	String AJOUTPHRASE = "ajout phrase";
	/**
	 * ordre "joue son" envoyé pour jouer un son
	 */
	String JOUESON = "joue son";
	/**
	 * Message "ajout mur" envoyé pour la création d'un mur
	 */
	String AJOUTMUR = "ajout mur";
	/**
	 * Message "ajout panel de murs" envoyé pour la création des murs
	 */
	String AJOUTPANELMURS = "ajout panel murs";
	/**
	 * Message "ajout jlabel jeu" envoyé pour la création d'un joueur
	 */
	String AJOUTJLABELJEU = "ajout jlabel jeu";
	/**
	 * Message "modification panel du jeu" envoyé pour l'affichage des joueurs
	 */
	String MODIFPANELJEU = "ajout jpanel jeu";
	/**
	 * Message "modification modif tchat" envoyé pour l'affichage d'un nouveau message du tchat
	 */
	String MODIFTCHAT = "modif tchat";
	/**
	 * ordre envoyé au controleur à vérifier
	 */ 
	String SERVEUR = "serveur";
	/**
	 * ordre envoyé au controleur à vérifier
	 */ 
	String CLIENT = "client";
	/**
	 * ordre envoyé au controleur à vérifier
	 */ 
	String TCHAT = "tchat";
	/**
	 * ordre envoyé au controleur à vérifier
	 */ 
	String ACTION = "action";
}
