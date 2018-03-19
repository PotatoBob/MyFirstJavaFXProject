package application;
	
import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloWorld extends Application implements EventHandler<ActionEvent> {
	
	Button button;
	Button button2;
	
	public static void main(String[] args) {
		launch(args);
	}//end main method

	@Override
	public void start(Stage primaryStage) throws Exception {
		final VBox layout = new VBox(5);
		
		button = new Button();
		button.setText("Click");
		button.setOnAction(this);
		
		button2 = new Button();
		button2.setText("Click");
		button2.setOnAction(this);
		
		//StackPane layout = new StackPane();
		layout.setAlignment(Pos.CENTER);
		layout.getChildren().add(button);
		layout.getChildren().add(button2);
		
		Scene scene = new Scene(layout, 500, 300);
		
		primaryStage.setTitle("Title of window");
		primaryStage.setScene(scene);
		primaryStage.show();
	}//end start method
		
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource()==button) {
			System.out.println("Button clicked");
		}
		else if (event.getSource()==button2) {
			System.out.println("Button2 clicked");
		}
	}
	
}
