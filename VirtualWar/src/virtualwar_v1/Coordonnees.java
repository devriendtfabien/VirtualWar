package virtualwar_v1;

public class Coordonnees {

	private int largeur;
	private int hauteur;

	public Coordonnees(int hauteur, int largeur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	public String toString() {
		return "Coordonnees [x:" + largeur + ", y:" + hauteur + "]";
	}

	public int getLargeur() {
		return largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public Coordonnees ajout(Coordonnees coord) {
		return new Coordonnees(this.hauteur + coord.hauteur, this.largeur
				+ coord.largeur);
	}

	public Coordonnees retire(Coordonnees coord) {
		return new Coordonnees(this.hauteur - coord.hauteur, this.largeur
				- coord.largeur);
	}
}
