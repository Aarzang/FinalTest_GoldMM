package com.pflb.helpers.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import com.pflb.helpers.worker.MathDealer;

public class CalculatorWindowController {

    @FXML
    private TextField dividendField;

    @FXML
    private TextField dividerField;

    @FXML
    private TextField resultField;

    @FXML
    private Label errorLabel;

    @FXML
    private Button mathButton;

    private MathDealer checker = new MathDealer();

    private Stage dialogStage;
    private double dividendNumber;
    private double dividerNumber;
    private double resultNumber;


    @FXML
    private void initialize(){}

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    @FXML
    public void handleMath() {
        int numbersOk = checker.checkNumbers(dividendField.getText(),dividerField.getText());

        if(numbersOk==0){
            this.dividendNumber = Double.parseDouble(dividendField.getText());
            this.dividerNumber = Double.parseDouble(dividerField.getText());
            this.resultNumber = dividendNumber/dividerNumber;
            this.resultField.setText(Double.toString(resultNumber));
            this.errorLabel.setText("MATH SUCCESSFUL");
        }else {
            this.resultField.setText("");
            if (numbersOk==1)
                this.errorLabel.setText("ERROR: UNACCEPTABLE TYPE");
            else
                this.errorLabel.setText("ERROR: DIVIDING BY ZERO");
        }
    }

}
