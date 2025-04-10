package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class scene_controller {
	Stage stage;
	Scene scene;
	Parent root;
	@FXML
	void swtich1(ActionEvent event) throws Exception{
		root= FXMLLoader.load(getClass().getResource("scene_1.fxml"));
		stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	void switch2(ActionEvent event) throws Exception {
		root= FXMLLoader.load(getClass().getResource("scene_2.fxml"));
		stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
