

import java.io.FileInputStream;
import java.util.Arrays;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Yahtzee extends Application {
	
	
	// Set initial game parameters
	int rollCounter = 0;
	
	int firstDie = 0;
	int secondDie = 0;
	int thirdDie = 0;
	int fourthDie = 0;
	int fifthDie = 0;
	
	
	
	// Implement abstract method start() of the Application class	
	
	 @Override
	// Method that serves as the entry point of the application
	public void start(Stage primaryStage) throws Exception {
		 	    
		try {
		 
			// Instantiate GridPane layout object & Adjust the settings
			GridPane pane = new GridPane();
			pane.setAlignment(Pos.CENTER);
			pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.4));
			pane.setHgap(5.5);
			pane.setVgap(5.5);
			pane.setMinSize(300, 200); 
			 
			 
			 
			
			// SET UP LAYOUT = POPULATE GRIDPANE OBJECT: 
			
			
			// Add headline
			Text headline = new Text("Yahtzee");
			headline.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 40));
			pane.add(headline, 0, 0);
			GridPane.setColumnSpan(headline, 6);
			
			
			
			// Add dice [ 1 ] 
			FileInputStream inputstream1 = new FileInputStream("images/1.jpg"); 
			Image die1 = new Image(inputstream1); 
			ImageView imageView1 = new ImageView(die1);   
		    
		    imageView1.setFitHeight(60); 
		    imageView1.setFitWidth(60);
		    imageView1.setPreserveRatio(true);  
			
		    pane.add(imageView1, 0, 1);
		   
			
		    // Add dice [ 2 ] 
		    FileInputStream inputstream2 = new FileInputStream("images/2.jpg"); 
			Image die2 = new Image(inputstream2); 
			ImageView imageView2 = new ImageView(die2);   
		    
		    imageView2.setFitHeight(60); 
		    imageView2.setFitWidth(60);
		    imageView2.setPreserveRatio(true);  
			
		    pane.add(imageView2, 1, 1); 
		    
		    
		    // Add dice [ 3 ] 
		    FileInputStream inputstream3 = new FileInputStream("images/3.jpg"); 
			Image die3 = new Image(inputstream3); 
			ImageView imageView3 = new ImageView(die3);   
		    
		    imageView3.setFitHeight(60); 
		    imageView3.setFitWidth(60);
		    imageView3.setPreserveRatio(true);  
			
		    pane.add(imageView3, 2, 1);
		    
		    
		    // Add dice [ 4 ] 
		    FileInputStream inputstream4 = new FileInputStream("images/4.jpg"); 
			Image die4 = new Image(inputstream4); 
			ImageView imageView4 = new ImageView(die4);   
		    
		    imageView4.setFitHeight(60); 
		    imageView4.setFitWidth(60);
		    imageView4.setPreserveRatio(true);  
			
		    pane.add(imageView4, 3, 1);
			 
			
		    // Add dice [ 5 ] 
		    FileInputStream inputstream5 = new FileInputStream("images/5.jpg"); 
			Image die5 = new Image(inputstream5); 
			ImageView imageView5 = new ImageView(die5);   
		    
		    imageView5.setFitHeight(60); 
		    imageView5.setFitWidth(60);
		    imageView5.setPreserveRatio(true);  
			
		    pane.add(imageView5, 4, 1);
		    
		    
		    // Add dice [ 6 ]
		    FileInputStream inputstream6 = new FileInputStream("images/6.jpg"); 
			Image die6 = new Image(inputstream6); 
		    
		    
		    
		    // Add checkboxes
		    final CheckBox checkBox1 = new CheckBox();
		    pane.add(checkBox1, 0, 2);
		    checkBox1.setDisable(true);
		    
		    final CheckBox checkBox2 = new CheckBox();
		    pane.add(checkBox2, 1, 2);
		    checkBox2.setDisable(true);
		    
		    final CheckBox checkBox3 = new CheckBox();
		    pane.add(checkBox3, 2, 2);
		    checkBox3.setDisable(true);
		    
		    final CheckBox checkBox4 = new CheckBox();
		    pane.add(checkBox4, 3, 2);
		    checkBox4.setDisable(true);
		    
		    final CheckBox checkBox5 = new CheckBox();
		    pane.add(checkBox5, 4, 2);
		    checkBox5.setDisable(true);
		    
		    
		    
		    
		    // Add "roll the dice" button
		    final Button rollButton = new Button("Roll the dice...");
		    pane.add(rollButton, 0, 5);
		    GridPane.setColumnSpan(rollButton, 3);
		    
		    
		    // Add status line
		    final Text status = new Text("You have 3 rolls left...");
		    pane.add(status, 0, 6);
		    GridPane.setColumnSpan(status, 3);
		    
		    
		    
		    
		    // SET THE SCENE:
		    
			// Instantiate Scene object 
			Scene scene = new Scene(pane, 400, 300);
			 
			// Attach the scene object to the stage object
			primaryStage.setScene(scene);
			 
			// Set the title for the stage
			primaryStage.setTitle("Yahtzee");
			 
			// Display the contents of the stage
			primaryStage.show();
			 
			 
			 
			 
			 
			// EVENT HANDLING			
			rollButton.setOnAction( e -> {
				
								
				// If the player does not hold back the first die
				if(!checkBox1.isSelected())  {
					// Roll the first die
					firstDie = (int) (Math.random() * 6) + 1;
				
					switch(firstDie) {
						case 1:
							imageView1.setImage(die1);
							break;
						case 2: 
							imageView1.setImage(die2);
							break;
						case 3:
							imageView1.setImage(die3);
							break;
						case 4:
							imageView1.setImage(die4);
							break;
						case 5:
							imageView1.setImage(die5);
							break;
						case 6: 
							imageView1.setImage(die6);
							break;
					}
				}
				
				
				
				// If the player does not hold back the second die
				if(!checkBox2.isSelected()) {
					// Roll the second die
					secondDie = (int) (Math.random() * 6) + 1;
				
					switch(secondDie) {
						case 1:
							imageView2.setImage(die1);
							break;
						case 2: 
							imageView2.setImage(die2);
							break;
						case 3:
							imageView2.setImage(die3);
							break;
						case 4:
							imageView2.setImage(die4);
							break;
						case 5:
							imageView2.setImage(die5);
							break;
						case 6: 
							imageView2.setImage(die6);
							break;
					}
				}
				
				
				
				// If the player does not hold back the third die
				if(!checkBox3.isSelected()) {
					// Roll the third die
					thirdDie = (int) (Math.random() * 6) + 1;
				
					switch(thirdDie) {
						case 1:
							imageView3.setImage(die1);
							break;
						case 2: 
							imageView3.setImage(die2);
							break;
						case 3:
							imageView3.setImage(die3);
							break;
						case 4:
							imageView3.setImage(die4);
							break;
						case 5:
							imageView3.setImage(die5);
							break;
						case 6: 
							imageView3.setImage(die6);
							break;
					}
				}
				
				
				
				// If the player does not hold back the fourth die
				if(!checkBox4.isSelected()) {
					// Roll the fourth die
					fourthDie = (int) (Math.random() * 6) + 1;
				
					switch(fourthDie) {
						case 1:
							imageView4.setImage(die1);
							break;
						case 2: 
							imageView4.setImage(die2);
							break;
						case 3:
							imageView4.setImage(die3);
							break;
						case 4:
							imageView4.setImage(die4);
							break;
						case 5:
							imageView4.setImage(die5);
							break;
						case 6: 
							imageView4.setImage(die6);
							break;
					}
				}
				
				
				
				// If the player does not hold back the fifth die
				if(!checkBox5.isSelected()) {
					// Roll the fifth die
					fifthDie = (int) (Math.random() * 6) + 1;
				
					switch(fifthDie) {
						case 1:
							imageView5.setImage(die1);
							break;
						case 2: 
							imageView5.setImage(die2);
							break;
						case 3:
							imageView5.setImage(die3);
							break;
						case 4:
							imageView5.setImage(die4);
							break;
						case 5:
							imageView5.setImage(die5);
							break;
						case 6: 
							imageView5.setImage(die6);
							break;
					}
				}
				
				
				
				// Update roll counter
				rollCounter++;	
					
				
				// Update game status & functioanlity accordingly
				switch(rollCounter) {
					case 1:
						status.setText("You have 2 rolls left");
						
						// Activate checkboxes
						checkBox1.setDisable(false);
						checkBox2.setDisable(false);
						checkBox3.setDisable(false);
						checkBox4.setDisable(false);
						checkBox5.setDisable(false);
						
						break;
						
					case 2:
						status.setText("You have 1 roll left");
						break;
						
					case 3: 
						// Calculate game results
						int[] output = { firstDie, secondDie, thirdDie, fourthDie, fifthDie};
						
						int highestNumberOfMatches = getHighestNumberOfMatches(output);
						int numberOfUniqueElements = Arrays.stream(output).distinct().toArray().length;
											
						
						// Display game results						
						if (highestNumberOfMatches == 5)
							status.setText("It's Yahtzee!");
						
							
						else if (highestNumberOfMatches == 4) 
							status.setText("It's four of a kind!");
						
											
						else if(highestNumberOfMatches == 3 && numberOfUniqueElements == 2) 
							status.setText("It's Full House!");
						
										
						else if(highestNumberOfMatches == 3) 
							status.setText("It's three of a kind!");
														
						
						else if(secondDie - firstDie == 1 && thirdDie - secondDie == 1 && 
								fourthDie - thirdDie == 1 && fifthDie - fourthDie == 1)
							status.setText("It's a large Straight!");
											
						
						else if((secondDie - firstDie == 1 && thirdDie - secondDie == 1 &&  fourthDie - thirdDie == 1) ||
								(thirdDie - secondDie == 1 && fourthDie - thirdDie == 1 && fifthDie - fourthDie == 1)) 
							status.setText("It's a small Straight!");
							
						
						else if(highestNumberOfMatches == 2) 
							status.setText("It's a pair!");
						
							
						else 
							status.setText("You will get lucky next time");
						

						
							
						// Disable the button
						rollButton.setDisable(true);
						
						// Disable check boxes
						checkBox1.setDisable(true);
						checkBox2.setDisable(true);
						checkBox3.setDisable(true);
						checkBox4.setDisable(true);
						checkBox5.setDisable(true);
						
						break;
				}	
			}); 
			
					 
		 	} catch(Exception e) {
		 		e.printStackTrace();
		 }
	   
	   
	 }
	
	
	
	 public static void main(String[] args) {
		// launch the application (internally calls the start() method of the Application class)
		launch(args);
	}
	
	 
	// Method to retrieve the highest frequency of element occurence in an int[] array   
	public static int getHighestNumberOfMatches(int[] numbers) {
		    
		int highestNumberOfMatches = 0;

		for(int i = 0; i < numbers.length; i++) {
			
			int matches = 0;
		    int currentComparand = numbers[i];

		    for(int number : numbers) {
		    	if(number == currentComparand)
		    		matches++;
		    }

		    if(matches > highestNumberOfMatches)
		    	highestNumberOfMatches = matches;
		    
		}
		    
			return highestNumberOfMatches;
	}

}
