package examCnam;

public class nbPagesException extends Exception{

	public nbPagesException(){
		System.out.println("Instanciation de document avec nombre de pages négatif");
	}
	public nbPagesException(int nbPages){
		System.out.println("Instanciation de documents avec nombre de pages négatif :"+nbPages);
	}
}
