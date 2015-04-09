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
		else if(this.equipe==2){
			return "r";
		}		
		return "  ";
	}

	public Coordonnees getCoordonnees() {
		return coord;
	}


	public void setVue(Vue vue) {
		this.vue = vue;
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
