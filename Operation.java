import java.util.Date;

public interface Operation {
	void commander(Date dateCd, String codeArticle, int qte);
	double prixCommande(double prixTTC, String prixLettre);
}
