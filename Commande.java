import java.util.Date;

public class Commande {
	private String numCmd;
	private Date dateCmd;
	private double totalHT;
	private double totalTTC;
	
	public void afficheCommande(String codeClient) {
	System.out.println("Commande pour le client : " + codeClient);
	}
}
