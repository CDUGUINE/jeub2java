package modele;

import java.util.Collection;

import javax.swing.JLabel;

/**
 * Informations communes à tous les objets (joueurs, murs, boules)
 * permet de mémoriser la position de l'objet et de gérer les  collisions
 *
 */
public abstract class Objet {

	/**
	 * position X de l'objet
	 */
	protected Integer posX ;
	/**
	 * position Y de l'objet
	 */
	protected Integer posY ;
	/**
	 * label contenant l'objet graphique (personnage, mur, boule)
	 */
	protected JLabel jLabel;
	
	/**
	 * @return the posX
	 */	
	public Integer getPosX() {
		return posX;
	}
	
	/**
	 * @return the posY
	 */
	public Integer getPosY() {
		return posY;
	}
	
	/**
	 * @return the jLabel
	 */
	public JLabel getjLabel() {
		return jLabel;
	}	

	
	/**
	 * contrôle si l'objet actuel touche l'objet passé en paramètre
	 * @param objet contient l'objet à contrôler
	 * @return true si les 2 objets se touchent
	 */
	public Boolean toucheObjet (Objet objet) {
		if (objet.jLabel==null || objet.jLabel==null) { //objet au lieu de this dans corrigé
			return false ;
		}else{
			return(this.getPosX()+this.jLabel.getWidth()>objet.getPosX() &&
				this.getPosX()<objet.getPosX()+objet.jLabel.getWidth() && 
				this.getPosY()+this.jLabel.getHeight()>objet.getPosY() &&
				this.getPosY()<objet.getPosY()+objet.jLabel.getHeight()) ;
		}
	}
	
	/**
	 * Contrôle si le sujet touche un membre d'une collection
	 * @param lesObjets collection d'objets (murs, joueurs ou boules)
	 * @return true si le sujet touche un autre objet
	 */
	public Objet toucheCollectionObjets(Collection<Objet> lesObjets) {
		for (Objet unObjet: lesObjets) {
			if(!this.equals(unObjet)) {
				if(this.toucheObjet(unObjet)) {
					return unObjet;
				}
			}
		}
		return null;
	}

}
