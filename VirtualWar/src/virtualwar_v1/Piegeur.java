package virtualwar_v1;

public class Piegeur extends Robot {

	public Piegeur(int equipe, Vue vue, Coordonnees c) {
		super(equipe, vue, c);
		super.setEnergie(50);
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
		return 2;
	}

	@Override
	public int getDegatTir() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDegatMine() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Piégeur";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(super.getEquipe()==1){
			return "P";
		}
		else if(super.getEquipe()==2){
			return "p";
		}
		return null;
	}

	@Override
	public int getEnergieMax() {
		// TODO Auto-generated method stub
		return 50;
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
