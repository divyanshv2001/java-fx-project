package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Control_1 {
	@FXML
	private TextField nm;
	@FXML
	private TextField rn;
	@FXML
	protected PasswordField pd;
	@FXML
	public void submit(ActionEvent e) {
		String name=nm.getText().toString();	
		String roll=rn.getText().toString();
		String pass=pd.getText().toString();
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Password: "+pass);
	}
}
