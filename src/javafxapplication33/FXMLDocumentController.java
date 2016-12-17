/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication33;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField Usertxt;
    @FXML
    private PasswordField Passtxt;
    @FXML
    private Label message;
    @FXML
    private Button closeButton;
   
    
    private Button agrendir;
    @FXML
    private Button btn;

    @FXML
    public void login(ActionEvent event) {
        try {
            if (Usertxt.getText().equals("user") && Passtxt.getText().equals("pass")) {
                Stage primaryStage = new Stage();
                message.setText("Successful Connexion");
                Parent root = FXMLLoader.load(getClass().getResource("sample4.fxml"));
                primaryStage.setTitle("Hello");
                primaryStage.setScene(new Scene(root));
                primaryStage.setResizable(false);
                ((Node) event.getSource()).getScene().getWindow().hide();
                primaryStage.show();

            } else {
                message.setText("Connexion Failed");

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void exit(MouseEvent event) {
        closeButton.setStyle("-fx-background-color:#ff6633;");
    }

    @FXML
    private void close(MouseEvent event) {
        ((Node) event.getSource()).getScene().getWindow().hide();
    }

    @FXML
    private void exite(MouseEvent event) {
        closeButton.setStyle("-fx-background-color: #1cb0;");
    }

    private void angrEn(MouseEvent event) {
        agrendir.setStyle("-fx-background-color:#1cde");
    }

    private void angrEx(MouseEvent event) {
        agrendir.setStyle("-fx-background-color:#1cb0");

    }

    @FXML
    private void yousernameVer(KeyEvent event) {
    }

    @FXML
    private void yousername(KeyEvent event) {
       

    }

}
