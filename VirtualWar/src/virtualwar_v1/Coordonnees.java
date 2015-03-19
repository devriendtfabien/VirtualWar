package virtualwar_v1;

public class Coordonnees {
	
	private int largeur;
	private int hauteur;
	
	public Coordonnees(int largeur, int hauteur){
		
	}

	public String toString() {
		return "Coordonnees [largeur=" + largeur + ", hauteur=" + hauteur + "]";
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
