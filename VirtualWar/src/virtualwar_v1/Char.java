package virtualwar_v1;

public class Char extends Robot {

	public Char(int equipe, Vue vue, Coordonnees c) {
		super(equipe, vue, c);
		super.setEnergie(60);
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
		return 5;
	}

	@Override
	public int getDegatTir() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public int getDegatMine() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		if(super.getEquipe()==1){
			return "C";
		}
		else if(super.getEquipe()==2){
			return "c";
		}
		return null;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Char";
	}

	@Override
	public int getEnergieMax() {
		// TODO Auto-generated method stub
		return 60;
	}

	@Override
	public int getPorteeTir() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int getPorteeDep() {
		// TODO Auto-generated method stub
		return 2;
	}

}
