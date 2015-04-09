package virtualwar_v1;

public class Plateau {
	private int hauteur = 2;
	private int largeur = 2;
	private Cellule[][] map;

	/**
	 * Créé un plateau avec comme taille les entiers en paramètres s'ils sont
	 * supérieurs à 2 (taille min)
	 * 
	 * @param h
	 *            hauteur du plateau
	 * @param l
	 *            largeur du plateau
	 */
	public Plateau(int h, int l) {
		if (h > 2)
			hauteur = h;
		if (l > 2)
			largeur = l;
		map = new Cellule[hauteur][largeur];
		for (int i = 0; i < largeur; i++) {
			for (int j = 0; j < hauteur; j++) {
				map[i][j] = new Case(i, j);
			}
		}
		map[0][0] = new Base(0, 0, 1);
		map[hauteur - 1][largeur - 1] = new Base(hauteur - 1, largeur - 1, 2);
	}

	public void retirerRobot(Robot r, Coordonnees c) {
		map[c.getHauteur()][c.getLargeur()].retirerRobot(r);
	}

	public String toString() {
		String res = "";

		for (int h = 0; h < hauteur; h++) {
			res += "+";
			for (int l = 0; l < largeur; l++) {
				res += "---+";
			}
			res += "\n";
			for (int l = 0; l < largeur; l++) {
				if (map[h][l] == null) {
					res += "| P ";
				} else {
					res += "| " + map[h][l] + " ";
				}

			}
			res += "|\n";
		}
		res += "+";
		for (int l = 0; l < largeur; l++) {
			res += "---+";
		}
		return res;
	}

	public boolean estBase(Coordonnees c) {
		if (map[c.getHauteur()][c.getLargeur()] == null) {
			return false;
		}
		if (map[c.getHauteur()][c.getLargeur()] instanceof Base) {
			return true;
		}
		return false;
	}

	public int estMine(Coordonnees c) {
		return map[c.getHauteur()][c.getLargeur()].contientMine();
	}

	public boolean estObstacle(Coordonnees c) {
		if (map[c.getHauteur()][c.getLargeur()] == null) {
			return false;
		}
		return map[c.getHauteur()][c.getLargeur()].estObstacle();

	}

	public Robot estRobot(Coordonnees c) {
		if (map[c.getHauteur()][c.getLargeur()].getContenu().length == 0)
			return null;
		return map[c.getHauteur()][c.getLargeur()].getContenu()[0];
	}

	public void exploseMine(Coordonnees c) {
		map[c.getHauteur()][c.getLargeur()].exploseMine();
	}

}
