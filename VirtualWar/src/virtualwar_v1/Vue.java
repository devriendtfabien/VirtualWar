package virtualwar_v1;

public class Vue {
	private int equipe;
	private Plateau p;

	public Vue(int equipe, Plateau plateau) {
		this.equipe = equipe;
		this.p = plateau;
	}

	public void exploseMine(Coordonnees c) {
		// TODO Auto-generated method stub
		p.exploseMine(c);
	}

	public int getHauteur() {
		return p.getHauteur();
	}

	public int getLargeur() {
		return p.getLargeur();
	}

	public void poserRobot(Robot r, Coordonnees c) {
		p.poserRobot(r, c);
	}

	public void retirerRobot(Robot r, Coordonnees c) {
		p.retirerRobot(r, c);
	}

	public int estMine(Coordonnees c) {
		return p.estMine(c);
	}

	public boolean estBase(Coordonnees c) {
		return p.estBase(c);
	}

	public boolean estObstacle(Coordonnees c) {
		return p.estObstacle(c);
	}

	public Robot estRobot(Coordonnees c) {
		return p.estRobot(c);
	}

	public void setMine(Coordonnees c) {
		p.poserMine(c, equipe);
	}

	public Plateau getPlateau() {
		return this.p;
	}

}
