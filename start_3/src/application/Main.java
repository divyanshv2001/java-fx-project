package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent px=FXMLLoader.load(getClass().getResource("main.fxml"));
		Group root=new Group(px);
		Scene scene = new Scene(root, 600, 400);
		stage.setTitle("Hello World");
		stage.setScene(scene);
		stage.show();
	}
}
