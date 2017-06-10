package examCnam;

public class Document {
	//propriétés
	private String codeDocument;
	private int nbPages;
	
	//constructeurs vide et initialisé
	public Document(){
		codeDocument ="";
		nbPages = 0;
	}
	
	public Document(String codeDocument, int nbPages)throws CodeDocumentException, NbPagesException {	
		
		if(codeDocument == ""){
			throw new CodeDocumentException();
		}
		if(nbPages<0){
			throw new NbPagesException(nbPages);
		}
		else{
		this.codeDocument = codeDocument;
		this.nbPages = nbPages;}
	}
	
	//mutateurs et accesseurs
	public String getCodeDocument(){
		return codeDocument;
	}
	public int getNbPages(){
		return nbPages;
	}
	public void setCodeDocument(String codeDocument){
		this.codeDocument = codeDocument;
	}
	public void setNbPages(int nbPages){
		this.nbPages = nbPages;
	}
	
	//méthodes
	public String Classifier(){
		String str="Classifier Document";
		return str;
	}
	public String Trouver(){
		String str1 ="Trouver Document";
		return str1;
	}
	public String description(){
		String str2 ="Le document a le code : "+this.getCodeDocument()+" pour "+this.getNbPages()+" pages";
		return str2;
	}
	
}
	

