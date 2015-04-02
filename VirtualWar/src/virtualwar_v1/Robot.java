package virtualwar_v1;

public abstract class Robot {
	private int energie;
	private int equipe;
	private Coordonnees coord;
	private int porteeDep;
	private Vue vue;
	
	public Robot(int equipe, Vue vue, Coordonnees c){
		this.equipe=equipe;
		this.vue=vue;
		this.coord=c;
	}
	public Robot(int equipe, Vue vue, int x,int y){
		this.equipe=equipe;
		this.vue=vue;
		this.coord=new Coordonnees(x, y);
	}
	public String toString() {
		if(this.equipe==1) return "R";
		return "r";

	}
	public int getEnergie(){return energie;}
	public void setEnergie(int energie){ this.energie=energie;}
	public int getEquipe(){return equipe;}
	public Coordonnees getCoordonnees(){ return coord;}
	public void setCoordonnees(Coordonnees c){ this.coord=c;}
	public Vue getVue(){return vue;}
	public void setVue(Vue vue){this.vue=vue;}
	
	
	}
	
	
	
	

