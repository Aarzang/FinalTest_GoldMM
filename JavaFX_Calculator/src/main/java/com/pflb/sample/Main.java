package com.pflb.sample;

import com.pflb.helpers.controller.CalculatorWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.File;

import java.net.URL;


public class Main extends Application{
    Stage stage;
    private AnchorPane root;

    private File MainWindow = new File("src/main/resources/fxml/CalculatorWindow.fxml");
    private URL adress;

    @Override
    public void start(Stage primaryStage) throws Exception{

        adress = new URL("file:///"  + MainWindow.getAbsolutePath());
        this.stage = primaryStage;
        FXMLLoader loader = new FXMLLoader(adress);
        root = loader.load();
        CalculatorWindowController controller = loader.getController();
        primaryStage.setTitle("Calculator application");
        primaryStage.show();
        primaryStage.setScene(new Scene(root, 600, 100));

    }

    public static void main(String[] args) {
        launch(args);
    }

}
