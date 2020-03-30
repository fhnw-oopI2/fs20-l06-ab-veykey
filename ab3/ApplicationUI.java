package ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ApplicationUI extends BorderPane {

	private Button btnLeft;
	private Button btnRight;
	private Button btnTop;
	private Button btnBottom;

	private TextField textArea;

	public ApplicationUI() {
		initializeControls();
		layoutControls();

	}

	private void initializeControls() {

		textArea = new TextField();
		btnLeft = new Button("Button");
		btnRight = new Button("Button");
		btnTop = new Button("Button");
		btnBottom = new Button("Button");

	}

	private void layoutControls() {

		setMargin(btnLeft, new Insets(15, 0, 0, 0));
		setMargin(btnRight, new Insets(15, 0, 0, 0));

		textArea.setMinHeight(170);
		textArea.setMaxWidth(250);
		setCenter(textArea);
		setPadding(new Insets(15, 20, 10, 10));

		// TOP
		btnTop.setMinWidth(380);
		btnTop.setPadding(new Insets(5, 5, 5, 5));
		setTop(btnTop);

		// BOTTOM
		btnBottom.setMinWidth(380);
		btnBottom.setPadding(new Insets(5, 5, 5, 5));
		setBottom(btnBottom);

		// RIGHT
		btnRight.setMinWidth(50);
//		btnRight.setPadding(new Insets(5, 5, 5, 5));
		setRight(btnRight);

		// LEFT
//		btnLeft.setPadding(new Insets(5, 5, 5, 5));
		btnLeft.setMinWidth(50);
		setLeft(btnLeft);

	}

}
