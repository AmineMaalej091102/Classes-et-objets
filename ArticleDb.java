import java.sql.*;

public class ArticleDb {
	private Connection conn;
	
	public ArticleDb() throws SQLException {
		conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Gestion", "postgres", "243JMT");
	}
	
	public void createArticle(Article article) throws SQLException {
	String query = "INSERT INTO Article (CodeArticle, Libelle, Qte, PrixHT) VALUES (?, ?, ?, ?)";
	PreparedStatement stmt = conn.prepareStatement(query);
	stmt.setString(1, article.getCodeArticle());
	stmt.setString(2, article.getLibelle());
	stmt.setInt(3, article.getQte());
	stmt.setDouble(4, article.getPrixHT());
	stmt.executeUpdate();
	}
	
	public Article readArticle(String codeArticle) throws SQLException {
		String query = "SELECT * FROM Article WHERE CodeArticle=?";
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, codeArticle);
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			return new Article();
		}
		return null;
	}
	
	public void updateArticle(Article article) throws SQLException {
		String query = "UPDATE Article SET Libelle = ?, Qte = ?, PrixHT = ?WHERE CodeArticle = ?";
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, article.getLibelle());
		stmt.setInt(2, article.getQte());
		stmt.setDouble(3, article.getPrixHT());
		stmt.setString(4, article.getCodeArticle());
		stmt.executeUpdate();
	}
	
	public void deleteArticle(String CodeArticle) throws SQLException {
		String query = "DELETE FROM Article WHERE CodeArticle = ?";
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, CodeArticle);
		stmt.executeUpdate();
	}
}
