package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stg) throws Exception {
		Parent root=FXMLLoader.load(getClass().getResource("scene_1.fxml"));
		Scene scene=new Scene(root);
		stg.setOnCloseRequest(event -> {
			event.consume();
			exit(stg);
		});
		stg.setScene(scene);
		stg.show();
	}
	public void exit(Stage stg) {
		Alert ar=new Alert(AlertType.CONFIRMATION);
		ar.setTitle("exit confirmation");
		ar.setContentText("exiting");
		if(ar.showAndWait().get()== ButtonType.OK) {
			stg.close();
		}
	}
}

