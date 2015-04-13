package virtualwar_v1;

public abstract class Cellule {

	protected Coordonnees coordonnees;
	protected int mine;
	protected int base;
	protected boolean obstacle;

	public Cellule(int h, int l) {
		this.coordonnees = new Coordonnees(l, h);
		this.mine = 0; // pas de mine
		this.base = 0; // pas une base
		this.obstacle = false; // pas d'obstacle
	}

	public int contientMine() {
		return mine;
	}

	public void poserMine(int mine) {
		this.mine = mine;
	}

	public int estBase() {
		return base;
	}

	public Coordonnees getCoordonnees() {
		return coordonnees;
	}

	public void setCoordonnees(Coordonnees c) {
		this.coordonnees = c;
	}

	public boolean estObstacle() {
		return obstacle;
	}

	public void viderCase() {
		this.mine = 0;
		this.obstacle = false;
	}

	public void exploseMine() {
		this.mine = 0;
	}

	abstract public void poserRobot(Robot r);

	abstract public void retirerRobot(Robot r);

	abstract public Robot[] getContenu();

	abstract public String toString();

	public abstract boolean deplaceSur(Robot r);

	public void setMine(int equipe) {
		this.mine = equipe;
	}

}
