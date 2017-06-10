package examCnam;

public class Commande extends DocImprime {
	//propriété
	private int montantCommand;
	
	//constructeurs vide et initialisé
	public Commande(){
		super();
		montantCommand = 0;
	}
	public Commande(String codeCommande,int nbPages, String dateImprim,int montantCommand){
		super(codeCommande, nbPages, dateImprim);
		this.montantCommand= montantCommand;
	}
	
	//accesseur et mutateur
	public int getMontantCommand(){
		return montantCommand;
	}
	public void setMontantCommand(int montantCommand){
		this.montantCommand = montantCommand;
	}
}
