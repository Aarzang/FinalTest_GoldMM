package com.pflb.helpers.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.math.BigDecimal;

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

    private Stage dialogStage;
    private BigDecimal numbersResult;


    @FXML
    private void initialize(){}

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    @FXML
    public void handleMath() {
        this.numbersResult = MathDealer.checkNumbers(dividendField.getText(),dividerField.getText());

        if(numbersResult.compareTo(new BigDecimal(0.0000000000000001))==0) {
            this.resultField.setText("");
            this.errorLabel.setText("ERROR: UNACCEPTABLE INPUT");
        }
        else{
            if(numbersResult.compareTo(new BigDecimal(0.0000000000000002))==0) {
                this.resultField.setText("");
                this.errorLabel.setText("ERROR: DIVIDING BY ZERO");
            }
            else{
                this.resultField.setText(numbersResult.toString());
                this.errorLabel.setText("MATH SUCCESSFUL");
            }
        }
    }

}
