package ch.fhnw.module06.ab3;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Parent rootPanel = new ApplicationUI();
		Scene scene = new Scene(rootPanel);
		
		primaryStage.setTitle("JavaFX App");
		primaryStage.setScene(scene);
		primaryStage.setWidth(400);
		primaryStage.setHeight(300);
		primaryStage.centerOnScreen();
		primaryStage.show();

	}

}
