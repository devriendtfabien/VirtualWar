package virtualwar_v1;

public class Tireur extends Robot {

	public Tireur(int equipe, Vue vue, Coordonnees c) {
		super(equipe, vue, c);
		super.setEnergie(40);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCoupAction() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getCoupDep() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getDegatTir() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int getDegatMine() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Tireur";
	}

	@Override
	public String toString() {
		if(super.getEquipe()==1){
			return "T";
		}
		else if(super.getEquipe()==2){
			return "t";
		}
		return null;
	}

	@Override
	public int getEnergieMax() {
		// TODO Auto-generated method stub
		return 40;
	}

	@Override
	public int getPorteeTir() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getPorteeDep() {
		// TODO Auto-generated method stub
		return 1;
	}

}
