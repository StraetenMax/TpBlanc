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
	
	//accesseur et mutateur
	public String getDateImprim(){
		return dateImprim;
	}
	public void setDateImprim(String dateImprim){
		this.dateImprim = dateImprim;
	}
	
	//méthodes
	public String Classifier(){
		String str ="Classifier docImprime";
		return str;
	}
	
	public String Description(){
		String str1 =super.description()+" qui a été imprimé le "+this.getDateImprim();
		return str1;
	}

}
