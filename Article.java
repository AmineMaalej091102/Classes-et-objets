import java.util.Date;

public class Article {
	private String codeArticle;
	private String libelle;
	private int qte;
	private double prixHT;

	public String getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(String codeArticle) {
        this.codeArticle = codeArticle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
	}
	
	public void afficheArticle(String codeClient, Date date) {
	System.out.println("Article pour le client : " + codeClient + " a la date : " + date);
	}
	
	public static void main(String[] args) {
	
	}
}

