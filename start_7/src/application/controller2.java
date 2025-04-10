package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class controller2 {
	@FXML
	private Text greet;
	private String name;
	private String password;
	public void setName(String name) {
		this.name=name;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void disp() {
		System.out.println(name+"  "+password);
		greet.setText("Welcome "+name);
	}
	
}
