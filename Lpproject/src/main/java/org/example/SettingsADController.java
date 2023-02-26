package org.example;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class SettingsADController implements Initializable {
    @FXML
    private Button addservice_btn;

    @FXML
    private Button modifier_btn;

    @FXML
    private TextField passwordacu_txt;

    @FXML
    private TextField service_txt;

    @FXML
    private Button supp_btn;

    @FXML
    private TextField username_txt;
    public static void main(String[] args) {
        launch(args);
    }


    public void showDashboardAD(javafx.event.ActionEvent event) throws IOException {
        URL url = new File("src/main/java/org/example/DashboordAD.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void showArchiveAD(javafx.event.ActionEvent event) throws IOException {
        URL url = new File("src/main/java/org/example/ArchiveAD.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void showMembersAD(javafx.event.ActionEvent event) throws IOException {
        URL url = new File("src/main/java/org/example/Members.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void showSetting(javafx.event.ActionEvent event) throws IOException {
        URL url = new File("src/main/java/org/example/SettingsAD.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }
    public void showAnnonceAD(ActionEvent event) throws IOException {
        URL url = new File("src/main/java/org/example/AnnonceAD.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ajoueterservice(){
        service servic =new service(service_txt.getText());
        System.out.println(servic.id);


        Connexion cn = new Connexion();
        try {
            cn.createconnection();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);

        }
        System.out.println(servic.id);

        cn.addservice(servic);

   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        Connexion cn = new Connexion();
//        try {
//            cn.createconnection();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        addservice_btn.setOnAction(e->ajoueterservice() );
    }    
    
}
