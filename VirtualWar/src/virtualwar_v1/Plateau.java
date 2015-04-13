package virtualwar_v1;

public class Plateau {
	private int hauteur = 2;
	private int largeur = 2;
	private Cellule[][] map;
	private boolean[][] chemin;

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
		int randh = 0;
		int randl = 0;
		int nbrObst = (((l - 1) * (h - 1)) * main.pourcentageObst) / 100;

		chemin = new boolean[hauteur][largeur];
		protegerChemin();

		for (int i = 0; i < nbrObst; i++) {
			while (estBase(new Coordonnees(randh, randl))
					|| (chemin[randh][randl] == true)
					|| (estObstacle(new Coordonnees(randh, randl)))) {
				randh = main.r.nextInt(hauteur);
				randl = main.r.nextInt(largeur);
			}
			map[randh][randl] = new Obstacle(randh, randl);
		}
		for (int i = 0; i < hauteur; i++) {
			for (int j = 0; j < largeur; j++) {
				if (!estObstacle(new Coordonnees(i, j))
						&& !estBase(new Coordonnees(i, j))) {
					map[i][j] = new Case(i, j);
				}
			}
		}
		map[0][0] = new Base(0, 0, 1);
		map[hauteur - 1][largeur - 1] = new Base(hauteur - 1, largeur - 1, 2);

	}

	public void protegerChemin() {

		int lChemin = 0;
		int hChemin = 0;
		int rand;
		chemin[0][0] = true;
		while ((lChemin != largeur - 1) || (hChemin != hauteur - 1)) {
			if (lChemin == largeur - 1) {
				hChemin = hChemin + 1;
			} else if (hChemin == hauteur - 1) {
				lChemin = lChemin + 1;
			} else {
				rand = main.r.nextInt(3);
				if (rand == 1) {
					lChemin = lChemin + 1;
				} else {
					hChemin = hChemin + 1;
				}
			}
			chemin[hChemin][lChemin] = true;
		}
	}
	public void poserRobot(Robot r, Coordonnees c){
		map[c.getHauteur()][c.getLargeur()].poserRobot(r);
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

	public void poserMine(Coordonnees c, int equipe) {
		map[c.getHauteur()][c.getLargeur()].poserMine(equipe);
	}

	public void setMine(Coordonnees c, int equipe) {
		map[c.getHauteur()][c.getLargeur()].setMine(equipe);
	}

	public int getHauteur() {
		return this.hauteur;
	}

	public int getLargeur() {
		return this.largeur;
	}
}
