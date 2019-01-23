package com.shocknode.gradlefx;

import com.shocknode.gradlefx.scenes.HelloWorldScene;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;

public class FXApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        HelloWorldScene scene = new HelloWorldScene();
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
