import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ArticleUI extends Application {

	@Override
	public void start(Stage primaryStage) {
		TextField codeField = new TextField();
		TextField libelleField = new TextField();
		TextField qteField = new TextField();
		TextField prixField = new TextField();
		Button addButton = new Button("Add Article");
				
		addButton.setOnAction(e -> {
			System.out.println("Article added!");
		});
		
		VBox layout = new VBox(10, new Label("Code:"), codeField, new Label("Libelle:"), libelleField, new Label("Quantity:"), qteField, new Label("Price HT:"), prixField, addButton);
		Scene scene = new Scene(layout, 300, 400);
		primaryStage.setTitle("Article Management");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
		
