import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.application.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;


@SuppressWarnings("restriction")
public class FlipCards extends Application {
	
	Button shownext;
	Button reset;
	Image[] cards;
	int i;
	@SuppressWarnings("static-access")
	public void start(Stage primaryStage){
		//buttons
		StackPane pane = new StackPane();
		 
		reset = new Button("Reset deck");
		shownext = new Button("Show next card");
		
		 
		
		 
		
		
		
		Label label = new Label("My First JavaFX Assignment");
		
		
		
		pane.getChildren().add(reset);
		pane.getChildren().add(shownext);
		pane.getChildren().add(label);
		 

		
		StackPane.setAlignment(reset, Pos.CENTER_LEFT);
		StackPane.setAlignment(shownext, Pos.CENTER_RIGHT);
		StackPane.setAlignment(label, Pos.TOP_CENTER);
		 
		
		cards = new Image[55];
		
		for( i=54;i>=1;i--){
			 
			cards[i]=new Image("Cards/"+i+".png");
			pane.getChildren().add(new ImageView(cards[i]));
			

						
			shownext.setOnAction(new EventHandler<ActionEvent>(){
				public void handle (ActionEvent e){
			
					pane.getChildren().add(new ImageView(cards[i++]));
				}
			});
			
			
			reset.setOnAction(new EventHandler<ActionEvent>(){
				public void handle (ActionEvent e){
		 
					i=1;
					pane.getChildren().add(new ImageView(cards[i]));
									 
								
							}
						});
			
		}
		
		//Pane buttons
		primaryStage.setTitle("Show cards");
		Scene scene = new Scene(pane,400,400);
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);



	}

	
}
	