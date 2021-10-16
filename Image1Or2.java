package com.mycompany.week7;

import java.io.FileInputStream;
import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import java.io.IOException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;

/**
 * JavaFX App
 */
public class Image1Or2 extends Application {

    private Button image1Button, image2Button;
    private FlowPane pane;

    @Override
    public void start(Stage primaryStage) {
        image1Button = new Button("Image 1");
        image1Button.setOnAction(this:: processImageButton);
        
        image2Button = new Button ("Image 2");
        image2Button.setOnAction(this:: processImageButton);
        
        image1Button img = new image1Button ("Bulldog.jpg");
        imageView img1View =new imageVeiw(img);
        
        image2Button img = new image2Button ("FrenchBulldog.jpg");
        imageView img2View = new imageView(img);
        
        pane = new FlowPane(image1Button, image2Button);
        pane.setAlignment (Pos.BOTTOM_RIGHT);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: white");
        
        StackPane pane= new StackPane(imageView);
        
        Scene scene = new Scene(pane, 300, 100);
        
        primaryStage.setTitle("Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        
    public void processImageButton (ActionEvent event)
    {
        if (event.getSource() == image1Button)
            pane.setStyle("")
    }
}