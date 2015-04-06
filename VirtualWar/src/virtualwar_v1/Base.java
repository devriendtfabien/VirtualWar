package virtualwar_v1;

import java.util.ArrayList;

public class Base extends Cellule {
	protected int equipe;
	protected ArrayList<Robot> robot = new ArrayList<Robot>();

	public Base(int h, int l, int equ) {
		super(h, l);
		super.base = equ;
		this.equipe = equ;
	}

	/**
	 * Retourne l'équipe à laquelle appartient la base
	 * 
	 * @return l'entier correspondant à l'équipe
	 */
	public int getEquipe() {
		return equipe;
	}

	public String toString() {
		if (this.equipe == 1) {
			return "B";
		} else {
			return "b";
		}
	}

	/**
	 * Retourne la liste des robots présents sur la base
	 * 
	 * @return la liste des robots contenus dans la base
	 */
	public Robot[] getContenu() {
		Robot[] rb = new Robot[0];
		return robot.toArray(rb);
	}

	/**
	 * Ajoute le robot en paramètre sur la base
	 * 
	 * @param r
	 *            - le robot à ajouter sur la base
	 */
	@Override
	public void poserRobot(Robot r) {
		robot.add(r);
	}

	/**
	 * Retire le robot en paramètre de la base
	 * 
	 * @param r
	 *            - le robot à enlever de la base
	 */
	@Override
	public void retirerRobot(Robot r) {
		robot.remove(r);
	}

	/**
	 * Retourne si un robot peut se déplacer sur la base
	 * 
	 * @return false car on ne peut pas se déplacer sur une base (règles).
	 */
	@Override
	public boolean deplaceSur(Robot r) {
		// TODO Auto-generated method stub
		return false;
	}
}
