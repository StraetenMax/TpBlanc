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
	
	//accesseurs et mutateurs
	public int getMontant(){
		return montant;
	}
	public String getTypeFact(){
		return typeFact;
	}
	public void setMontant(int montant){
		this.montant=montant;
		this.setTypeFact();
	}
	public void setTypeFact(){
		if(this.montant<0){
			typeFact="Facture d'avoir";
		}else{
			typeFact="Facture";
		}
	}
	//méthodes
	public boolean EstSuperieurA(Facture f1){
		boolean str;
		if(this.montant > f1.getMontant()){
			str = true;
		}else{
			str = false;
		}return str;
	}
	public String description(){
		String str1 = super.description()+" dont le montant est de"+this.getMontant()+" euros";
		return str1;
	}
	}
