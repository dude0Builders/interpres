package com.interpres.main;

import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by rajes on 1/19/2019.
 */
public class Main extends Application{


    public static  void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        JFXButton button = new JFXButton("Hello World");
        button.setButtonType(JFXButton.ButtonType.RAISED);

        Label label = new Label("Hello World");
        StackPane layout = new StackPane();
        layout.getChildren().addAll(label, button);
        Scene window = new Scene(layout, 300, 300);
        primaryStage.setScene(window);
        primaryStage.show();
    }
}
