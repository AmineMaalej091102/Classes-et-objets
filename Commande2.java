import java.util.Date;

public class Commande2 implements Operation {
	private String numCmd;
	private Date dateCmd;
	private double totalHT;
	private double totalTTC;
	
	@Override
	public void commander(Date dateCd, String codeArticle, int qte) {
	System.out.println("Commande cree le" + dateCd + "pour l'article " + codeArticle + " avec quantite : " + qte);
	}
	
	@Override
	public double prixCommande(double prixTTC, String prixLettre) {
	System.out.println("Prix en lettres : " + prixLettre);
	return prixTTC;
	}
}
