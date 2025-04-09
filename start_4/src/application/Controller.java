package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
public class Controller {
	@FXML
	private Circle circle;
	private double x=10;
	private double y=10;
	public void up(ActionEvent e) {
		circle.setCenterY(y-=10);
	}
	public void down(ActionEvent e) {
		circle.setCenterY(y+=10);
	}
	public void left(ActionEvent e) {		
		circle.setTranslateX(x-=10);
	}
	public void right(ActionEvent e) {
		circle.setTranslateX(x+=10);
	}
}
