package examCnam;

public class DocImprime extends Document {
	//propriétés
	private String dateImprim;
	
	//constructeurs vide et initialisé
	public DocImprime(){
		super();
		dateImprim = "";
	}
	public DocImprime(String codeDocument, int nbPages,String dateImprim){
		super(codeDocument,nbPages);
		this.dateImprim = dateImprim;
	}

}
