package virtualwar_v1;

import java.util.Random;

public class main {
static Plateau p;
static int pourcentageObst=50;
static Random r = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p = new Plateau(5	, 5);
		Robot rbt = new Tireur(1, new Vue(1, p), new Coordonnees(0, 0));
		p.poserRobot(rbt, new Coordonnees(1, 0));
		System.out.println(p.toString());
	}

}
