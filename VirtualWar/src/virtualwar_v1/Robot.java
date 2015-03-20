package virtualwar_v1;

public abstract class Robot{

	private int energie;
	private int equipe;
	
	/**Constructeur**/
	public Robot(Vue vue, int x, int y, int equipe){
		super();
		this.equipe=equipe;		
	}
	
	/**Methodes**/
	
	/**Teste si le Robot se situe sur une base**/	
	public boolean estSurBase(){
		return true;
	}
	
	/**Initialise les coordonnees de Robot**/
	public void setCoordonnees(){
		
	}
	
	/***Obtenir une Vue de Robot**/
	public Vue getVue(){
		return null;		
	}
	
	/**Obtenir l'energie de Robot**/
	public int getEnergie() {
		return energie;
	}

	/**Initialiser l'energie de Robot**/
	public void setEnergie(int energie) {
		this.energie = energie;
	}
	
	/**Obtenir l'equipe de Robot**/
	public int getEquipe(){
		return equipe;
	}

	abstract public int getCoupAction();
	
	abstract public int getCoupDep();
	
	abstract public int getDegatTir();
	
	abstract public int getDegatMine();
	
	abstract public int String getType();
	
	
}
