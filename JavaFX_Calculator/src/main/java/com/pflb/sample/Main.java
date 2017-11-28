package com.pflb.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import com.pflb.helpers.controller.CalculatorWindowController;

import java.net.URL;


public class Main extends Application {
    Stage stage;
    private AnchorPane root;

    private URL adress; //Пришлось захардкодить URL таблицы, поскольку getClass.getResource("CalculatorWindow.fxml") не желал находить ни при каких вводных.

    @Override
    public void start(Stage primaryStage) throws Exception{

        adress = new URL("file:///C://Users/endless/Downloads/JavaFX_Calculator/src/main/java/com/pflb/sample/CalculatorWindow.fxml");

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
