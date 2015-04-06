package virtualwar_v1;

public class Obstacle extends Cellule {

	private Robot[] robot = new Robot[1];;

	public Obstacle(int h, int l) {
		super(h, l);
		super.obstacle = true;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void poserRobot(Robot r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void retirerRobot(Robot r) {
		// TODO Auto-generated method stub

	}

	@Override
	public Robot[] getContenu() {
		return robot;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "O";
	}

	@Override
	public boolean deplaceSur(Robot r) {
		return false;
	}

}
