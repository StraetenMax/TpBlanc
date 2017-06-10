package examCnam;

public class Main {

	public static void main(String[] args) {
		//instancier Doc1
		
		Document Doc1 = null;
		try
		{
		Doc1 = new Document("Rapport stage CNAM1", 25);
		}
		catch (CodeDocumentException Ex1Doc1)
		{}
		catch(NbPagesException Ex2Doc1 )
		{}
		finally
		{
		if (Doc1 == null)
		{
		Doc1 = new Document();
		}
		}
		System.out.println(Doc1.description());
		
		//instancier DocImp1
		DocImprime DocImp1 = null;
		try{
			DocImp1 = new DocImprime("Imprimé 1423", 50, "15/06/2014");
		}
		catch (CodeDocumentException Ex1DocImp1)
		{}
		catch(NbPagesException Ex2DocImp1)
		{}
		finally
		{
		if (DocImp1 == null)
		{
		DocImp1 = new DocImprime();
		}
		}
		System.out.println(DocImp1.description());
		
		//instancier Fac1
		
		Facture Fac1 = null;
		try{
		 Fac1 = new Facture("Facture 123", 4, "20/6/2014", -150);
		}
		catch (CodeDocumentException Ex1Fac1)
		{}
		catch(NbPagesException Ex2Fac1)
		{}
		finally
		{
		if (Fac1 == null)
		{
		Fac1 = new Facture();
		}
		}
		//instancier Fac2
		Facture Fac2 = null;
		try{
		 Fac2 = new Facture("Facture 456", 6, "23/6/2014", 427);
		}
		catch (CodeDocumentException Ex1Fac2)
		{}
		catch(NbPagesException Ex2Fac2)
		{}
		finally
		{
		if (Fac2 == null)
		{
		Fac2 = new Facture();
		}
		}
		//appeler la méthode
		System.out.println(Fac1.EstSuperieurA(Fac2));
		
		//instancier Cde1
		Commande Cde1 = null;
		try{
			Cde1 = new Commande("Cde A12", 5, "21/6/2014",350);
		}
		catch(CodeDocumentException Ex1Cde1)
		{}
		catch(NbPagesException Ex2Cde1)
		{}
		finally
		{
		if (Cde1 == null)
		{
		Cde1 = new Commande();
		}
		}
		
		//appeler la méthode
		System.out.println(Cde1.Description());
		
		//instancier Cde2
		Commande Cde2 = null;
		try{
			Cde2 = new Commande("Cde B62", 9 ,"27/6/2014",1085);
		}
		catch(CodeDocumentException Ex1Cde2)
		{}
		catch(NbPagesException Ex2Cde2)
		{}
		finally
		{
		if (Cde2 == null)
		{
		Cde2 = new Commande();
		}
		}
		//appeler la méthode
		System.out.println(Cde1.EstInferieurA(Cde2));
	}

}
