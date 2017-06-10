package examCnam;

public class Facture extends DocImprime{
	//propriétés
	private int montant;
	private String typeFact;
	
	//constructeurs vide et initialisé
	public Facture(){
		super();
		montant = 0;
		this.setTypeFact();
	}
	public Facture(String codeDocument, int nbPages,String dateImprim, int montant){
		super(codeDocument, nbPages, dateImprim);
		this.montant = montant;
		this.setTypeFact();
	}
	
}
