package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller_1 {
	@FXML
	ImageView img_frm;
	@FXML
	Button btn;
	Image img=new Image(getClass().getResourceAsStream("img2.jpg"));
	@FXML
	void switch_img(ActionEvent event) {
		img_frm.setImage(img);
	}
}
