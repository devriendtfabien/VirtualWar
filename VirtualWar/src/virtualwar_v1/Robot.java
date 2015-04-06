package virtualwar_v1;

public abstract class Robot {
	private int energie;
	private int equipe;
	private Coordonnees coord;
	private int porteeDep;
	private Vue vue;

	// Contructeur
	public Robot(int equipe, Vue vue, Coordonnees c) {
		this.equipe = equipe;
		this.vue = vue;
		this.coord = c;
	}

	public Robot(int equipe, Vue vue, int x, int y) {
		this.equipe = equipe;
		this.vue = vue;
		this.coord = new Coordonnees(x, y);
	}

	public String toString() {
		if (this.equipe == 1)
			return "R";
		return "r";

	}

	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) {
		this.energie = energie;
	}

	public int getEquipe() {
		return equipe;
	}

	public Coordonnees getCoordonnees() {
		return coord;
	}

	public void setCoordonnees(Coordonnees c) {
		this.coord = c;
	}

	public Vue getVue() {
		return vue;
	}

	public void setVue(Vue vue) {
		this.vue = vue;
	}

}

public abstract class Robot {

	private int energie;
	private int equipe;

	/** Constructeur **/
	public Robot(Vue vue, int x, int y, int equipe) {
		super();
		this.equipe = equipe;
	}

	/** Methodes **/

	/** Teste si le Robot se situe sur une base **/
	public boolean estSurBase() {
		return true;
	}

	/** Initialise les coordonnees de Robot **/
	public void setCoordonnees(Coordonnees c) {
		this.coord = c;
	}

	/*** Obtenir une Vue de Robot **/
	public Vue getVue() {
		return vue;
	}

	/** Obtenir l'energie de Robot **/
	public int getEnergie() {
		return energie;
	}

	/** Initialiser l'energie de Robot **/
	public void setEnergie(int energie) {
		this.energie = energie;
	}

	/** Obtenir l'equipe de Robot **/
	public int getEquipe() {
		return equipe;
	}

	abstract public int getCoupAction();

	abstract public int getCoupDep();

	abstract public int getDegatTir();

	abstract public int getDegatMine();

	abstract public String getType();

}
