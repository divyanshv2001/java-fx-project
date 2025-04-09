package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stg) throws Exception {
		try {
		Parent root=FXMLLoader.load(getClass().getResource("screen1.fxml"));
		Scene scene = new Scene(root);
		String css=getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stg.setScene(scene);
		stg.show();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
