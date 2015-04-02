package virtualwar_v1;

public class map {
    private String[][] grille = new String [22][22];
    private int largeur,hauteur;
public map(int largeur, int hauteur){
	this.largeur=(largeur*2+2);
	this.hauteur=(hauteur*2+2);
	this.init(this.largeur,this.hauteur);
}
String [][] init(int largeur, int hauteur){
	grille = new String [hauteur][largeur];
	for(int ligne=0; ligne<grille.length; ligne++){ //parcours des lignes
	    if(ligne==grille.length-1){  //si c'est la derniere ligne
		for(int i=0; i<grille.length;i++){ 
		    grille[ligne][i]=" ";
		}
	    }	    
	    else if(ligne%2==0){ // si la ligne est paire  
		for(int col=0; col<grille.length; col=col+2){ //parcours des colonnes des lignes paires
		    if(col==grille.length-2){
			    
			grille[ligne][col]="+";
			grille[ligne][col+1]=" ";
		    }
		    else{
			grille[ligne][col]="+";
			grille[ligne][col+1]="_";
		    }	
		}
	    } else{ for(int col=0; col<grille.length; col=col+2){
		    grille[ligne][col]="|";
		    grille[ligne][col+1]=" ";}
	    }
			
	}	return grille;
} 
public String toString(){
	int nb=0;
	for (int i = 0; i < grille.length; i++) {
	    for (int j = 0; j <grille.length; j++) {
		System.out.print(grille[i][j]);
	    }
	    System.out.println();
	}
	return "";
}


}

