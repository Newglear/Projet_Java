package org.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class LoginController {

    public ArrayList<String> usernames = new ArrayList<>(Arrays.asList("Paul","Jean"));

    public boolean checkUnicity(String  username){
        boolean isFind = true;
        for (String u : usernames) {
            if(username.equals(u)){
                System.out.println("oj");
                isFind = false;
            }
        }
        return isFind;
    }

    @FXML
    private Button bt_login;

    @FXML
    private Label warning_lb;

    @FXML
    private TextField username_in;


    @FXML
    private void userLogin() throws IOException {
        if(checkUnicity(username_in.getText())) {
            Stage stage = (Stage) bt_login.getScene().getWindow();
            stage.setHeight(500);
            stage.setWidth(800);
            stage.centerOnScreen();
            App.setRoot("chat");

        }else{
            warning_lb.setVisible(true);
        }
    }


}
