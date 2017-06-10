package examCnam;

public class NbPagesException extends Exception{

	public NbPagesException(){
		System.out.println("Instanciation de document avec nombre de pages négatif");
	}
	public NbPagesException(int nbPages){
		System.out.println("Instanciation de documents avec nombre de pages négatif :"+nbPages);
	}
}
