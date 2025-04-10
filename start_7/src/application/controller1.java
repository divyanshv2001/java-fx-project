package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class controller1 {
	Parent root;
	Scene scene;
	Stage stg;
	@FXML
	private TextField namef;
	@FXML
	private PasswordField pwdf;
	public void logger(ActionEvent event) throws Exception {
		FXMLLoader loader= new FXMLLoader(getClass().getResource("scene_2.fxml"));
		root=loader.load();
		stg = (Stage)((Node)event.getSource()).getScene().getWindow();
		controller2 x=loader.getController();
		x.setName(namef.getText().toString());
		x.setPassword(pwdf.getText().toString());
		x.disp();
		scene=new Scene(root);
		stg.setScene(scene);
		stg.show();
	}
}
