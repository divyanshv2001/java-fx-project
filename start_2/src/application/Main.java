package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage st) throws Exception {
		Group root=new Group();
		Scene sc=new Scene(root,300,300,Color.BURLYWOOD);
		st.setScene(sc);
		Text t=new Text("Hello World");
		t.setX(50);
		t.setY(50);
		t.setFont(new Font("Times New Roman",20));
		
//		Line l=new Line();
//		l.setStartX(60);
//		l.setStartY(60);
//		l.setEndX(100);
//		l.setEndY(60);
//		l.setStroke(Color.RED);
//		l.setStrokeWidth(1);

		root.getChildren().add(t);
		st.show();
	}
	
}
