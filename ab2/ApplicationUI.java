package ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {

	private Button button;
	private Label label;
	private TextField textfield;
	private TextField textArea;

	public ApplicationUI() {
		initializeControls();
		layoutControls();

	}

	private void initializeControls() {
		label = new Label("Label");
		textfield = new TextField("Textfield");
		textArea = new TextField("Textarea");
		button = new Button("Button");

	}

	private void layoutControls() {
		setSpacing(5);
		textArea.setMinHeight(150);
		textArea.setAlignment(Pos.TOP_LEFT);
		setPadding(new Insets(15,20, 10,10));
		getChildren().addAll(label, textfield, textArea, button);
	

	}

}
