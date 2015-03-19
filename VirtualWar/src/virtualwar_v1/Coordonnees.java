package virtualwar_v1;

public class Coordonnees {
	
	private int largeur;
	private int hauteur;
	
	public Coordonnees(int largeur, int hauteur){
		this.largeur=largeur;
		this.hauteur=hauteur;
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
	
	public Coordonnees ajout(Coordonnees coord){
		return coord;		
	}
}
