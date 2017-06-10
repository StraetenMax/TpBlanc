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
	
	//méthodes
	public boolean EstInferieurA(Commande cdt1){
		boolean cdt2;
		if(this.montantCommand<cdt1.getMontantCommand()){
			 cdt2= true;
		}else{
			cdt2= false;
		}return cdt2;
	}
	public String description(){
		String str= super.description()+" dont le montant est de "+this.getMontantCommand()+" euros";
		return str;
	}
}
