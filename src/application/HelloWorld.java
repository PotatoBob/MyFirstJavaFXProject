package application;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.TextFlow;
import javafx.scene.text.Text;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloWorld extends Application/* implements EventHandler<ActionEvent>*/ {
	
	Button button; //button, button2, and label aren't important
	Button button2;
	Button button3;
	Label label;
	TextFlow testFlow; //button3 and testFlow are important now, with random
	Random r = new Random();
	
	public static void main(String[] args) {
		new HelloWorld();
		launch(args);
	}//end main method

	@Override
	public void start(Stage primaryStage) throws Exception {
		final VBox layout = new VBox(6);
		
		button = new Button();
		button.setText("Click");
		button.setOnAction( e -> {
			System.out.println("Button1 clicked");
			label.setText("Degrees Celcius: \u2103");
		});
		
		label = new Label("Test successful");
		
		button2 = new Button();
		button2.setText("Click");
		button2.setOnAction( e -> {
			System.out.println("Button2 clicked");
			label.setText("Copyright: \u00a9");
		});
		
		testFlow = new TextFlow();
		
		button3 = new Button();
		button3.setText("Image Check");
		button3.setOnAction( e -> {
			Text text = new Text();
			Text imageName = new Text();
			int tempRand = r.nextInt(8);
			ImageView imageView;
			if(tempRand==0) {
				imageView = new ImageView("GompPrep.png");
				imageName.setText("Gompers Prep");
			}
			else if (tempRand==1) {
				imageView = new ImageView("HooverHS.jpg");
				imageName.setText("Hoover High");
			}
			else if (tempRand==2) {
				imageView = new ImageView("LEAGUE.png");
				imageName.setText("Carmel Valley");
			}
			else if (tempRand==3) {
				imageView = new ImageView("MalcomX.png");
				imageName.setText("Malcom X Library");}
			else if (tempRand==4) {
				imageView = new ImageView("SanElijoMS.png");
				imageName.setText("San Elijo Middle");}
			else if (tempRand==5) {
				imageView = new ImageView("SanMarcosMS.png");
				imageName.setText("San Marcos Middle");}
			else if (tempRand==6) {
				imageView = new ImageView("SDCentral.jpg");
				imageName.setText("SD Central Library");}
			else {
				imageView = new ImageView("WilsonMS.jpg");
				imageName.setText("Wilson Middle");}
			imageView.setPreserveRatio(true);
			imageView.setFitHeight(15);
			text.setText("\nButton: ");
			testFlow.getChildren().addAll(text, imageView, imageName);
		});
		
		//StackPane layout = new StackPane();
		layout.setAlignment(Pos.CENTER);
		layout.getChildren().add(button);
		layout.getChildren().add(label);
		layout.getChildren().add(button2);
		layout.getChildren().add(button3);
		layout.getChildren().add(testFlow);
		
		Scene scene = new Scene(layout, 500, 300);
		
		primaryStage.setTitle("Hello. Is it me you're looking for?");
		primaryStage.setScene(scene);
		primaryStage.show();
	}//end start method
		
	/*@Override
	public void handle(ActionEvent event) {
		
	}*/
	
}
