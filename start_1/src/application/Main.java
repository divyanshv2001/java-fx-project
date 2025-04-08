package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage a) throws Exception {
		Group root = new Group();
		Scene sc=new Scene(root,Color.BURLYWOOD);
		a.setHeight(300);
		a.setWidth(300);
		Image icon=new Image("file:src/res/good-icon.png");
		a.getIcons().add(icon);
		a.setTitle("Hello World");
		a.setFullScreen(true);
		a.setFullScreenExitHint("Radhe Radhe!! exit by pressing 'q' key");
		a.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		a.setResizable(false);
//		a.setOpacity(0.8);
		a.setX(300);
		a.setY(200);
		a.setScene(sc);
		a.show();
	}
}
