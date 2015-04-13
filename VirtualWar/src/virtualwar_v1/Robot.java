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
	public void subitTir(Robot r){
		this.energie = this.energie - r.getDegatTir();
		if (this.energie < 0) {
			this.energie = 0;
		}
	}
	public void subitMine(Coordonnees c){
		this.energie = this.energie - 2;
		if (this.energie < 0) {
			this.energie = 0;
		}
		this.getVue().exploseMine(c);
	}
	
	public Coordonnees getCoordonnees() {
		return coord;
	}

	public void setVue(Vue vue) {
		this.vue = vue;
	}
	public void deplacerSur(Coordonnees c){
		
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

	abstract public String toString();

	abstract public int getEnergieMax();

	abstract public int getPorteeTir();

	abstract public int getPorteeDep();

}
