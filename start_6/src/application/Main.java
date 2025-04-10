package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stg) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("scene_1.fxml"));
		Scene scene = new Scene(root);
		stg.setScene(scene);
		stg.setTitle("Scene Switcher");
		stg.setResizable(false);
		stg.show();
	}
}
