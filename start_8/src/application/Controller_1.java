package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller_1 {
	@FXML
	AnchorPane exit_screen;
	@FXML
	Button exit_button;
	Stage stage;
	public void logout(ActionEvent event) {
		Alert a=new Alert(AlertType.CONFIRMATION);
		a.setTitle("Confirmation");
		a.setHeaderText("Are you sure you want to log out?");
		a.setContentText("Click OK to log out.");
		if(a.showAndWait().get()== ButtonType.OK) {
		stage= (Stage) exit_screen.getScene().getWindow();
		System.out.println("Loggin out!!");
		stage.close();
		}
	}
}
