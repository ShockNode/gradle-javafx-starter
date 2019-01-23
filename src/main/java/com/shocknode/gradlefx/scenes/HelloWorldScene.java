package com.shocknode.gradlefx.scenes;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class HelloWorldScene extends Scene {

    private static BorderPane helloWorld() {

        BorderPane pane = new BorderPane();
        Label label = new Label("Hello, World!");
        Button button = new Button("Button");

        pane.setCenter(label);
        pane.setBottom(button);
        button.prefWidthProperty().bind(pane.widthProperty());

        //Set onClickAction for button
        button.setOnAction((event)->{

            Platform.runLater(()->{
                label.setText("Button clicked!");
            });

        });

        return pane;

    }

    public HelloWorldScene(){
        super(helloWorld());
    }


}
