/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avc9wbnotifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Chavakula
 */
public class Avc9wbNotifier extends Application {
    @Override
    public void start(Stage primaryStage) {
        
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setAlignment(Pos.CENTER);
        
        Button btn = new Button();
        btn.setText("Notify");
        Button button = new Button();
        button.setText("Clear");
        Button botn = new Button();
        botn.setText("Print");
        Button butn = new Button();
        butn.setText("Alert!");
        TextField textField = new TextField();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                textField.setText("You have been notified by 'avc9wb'!");
            }
        });
        
        button.setOnAction((ActionEvent event) -> {
            textField.setText("");
        }); 
        
        
       
        root.add(btn, 1, 0);
        root.add(button, 1, 1);
        root.add(textField, 0, 0);
        
        Scene scene = new Scene(root, 400, 250);
        
        primaryStage.setTitle("Notifier");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
