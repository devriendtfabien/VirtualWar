package virtualwar_v1;

public class Case extends Cellule {
	private int mine;
	protected Robot[] robot = new Robot[1];

	public Case(int h, int l) {
		super(h, l);
		this.mine = 0;
	}

	public int getMine() {
		return mine;
	}

	public void setMine(int mine) {
		this.mine = mine;
	}

	public void viderCase() {
		super.viderCase();
	}

	public Robot[] getContenu() {
		return robot;
	}

	public void poserRobot(Robot r) {
		if (robot[0] == null)
			robot[0] = r;
	}

	public void retirerRobot() {
		robot[0] = null;
	}

	public String toString() {
		if (super.mine == 1) {
			return "X";
		} else if (super.mine == 2) {
			return "x";
		} else if (robot[0] == null) {
			return " ";
		} 
			return robot[0].toString();
		

	}

	@Override
	public void retirerRobot(Robot r) {
		robot[0] = null;
	}

	@Override
	public boolean deplaceSur(Robot r) {
		// TODO Auto-generated method stub
		return false;
	}
}
