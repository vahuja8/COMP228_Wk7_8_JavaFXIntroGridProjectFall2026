package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		GridPane pane = new GridPane();

		/*
		 * This is for creating a grid type object..
		 */

		pane.setAlignment(Pos.CENTER);
		/*
		 * Sets the alignment of the Pane Window.. Center, left, right....
		 */

		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		// specifies the spacing ..

		pane.setHgap(5.5);
		pane.setVgap(5.5);
		// Place nodes in the pane
		pane.add(new Label("First Name:"), 0, 0);
		/*
		 * This is not same as Matrices in Math.. 1st param is the object. 2nd param is
		 * the column 3rd param is the row.
		 * 
		 */

		pane.add(new TextField(), 1, 0);
		pane.add(new Label("MI:"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Last Name:"), 0, 2);
		pane.add(new TextField(), 1, 2);
	
		/*
		 * Added for class to play!!
		 */
		pane.add(new Label("Age:"), 0, 3);
		pane.add(new TextField(), 1, 3);
		
		

		Button btAdd = new Button("Add Name");
		pane.add(btAdd, 1, 4);
		GridPane.setHalignment(btAdd, HPos.RIGHT);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowGridPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}
