/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package org.example;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import static javafx.application.Application.launch;
import static org.example.User.idUser;

/**
 * FXML Controller class
 *
 * @author KAMUI
 */
public class AnnonceController implements Initializable {

    @FXML
    private VBox vb1;
    @FXML
    private Button validerann;
    @FXML
    private DatePicker date_txt;

    @FXML
    private TextField details_txt;

    @FXML
    private ImageView image_txt;
    @FXML
    private Button image_btn;

    @FXML
    private TextField lieu_txt;

    @FXML
    private TextField sujet_txt;

    @FXML
    private ComboBox<?> type_txt;

    public static void main(String[] args) {
        launch(args);
    }


    public void showDashboardRS(ActionEvent event) throws IOException {
        URL url = new File("src/main/java/org/example/DashboordRS.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void showArchiveRS(ActionEvent event) throws IOException {
        URL url = new File("src/main/java/org/example/Archive.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void showMembersRS(ActionEvent event) throws IOException {
        URL url = new File("src/main/java/org/example/MembersRS.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void showSetting(ActionEvent event) throws IOException {
        URL url = new File("src/main/java/org/example/SettingsAD.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    public void showAnnonceRS(ActionEvent event) throws IOException {
        URL url = new File("src/main/java/org/example/Annonce.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public Image importimage(Stage stage){
        byte[] imageBytes = new byte[0];
        Image img = null;
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PNG", "*.png"));
        File pngImage = fileChooser.showOpenDialog(stage);
        if (pngImage != null) {
            try {
                imageBytes = Files.readAllBytes(pngImage.toPath());
            } catch (IOException e) {
                System.err.println("File couldn't be read to byte[].");
            }
        }
        img = new Image(new ByteArrayInputStream(imageBytes));
        System.out.println(imageBytes.length);
        image_txt.setImage(img);

     //   return imageBytes;
      return  img;

    }
    public void AjouterAnn() {
        System.out.println("hhhhhhhh");

        Activite activite = new Activite(sujet_txt.getText(),type_txt.getValue().toString(),lieu_txt.getText(),date_txt.getValue().toString(),details_txt.getText(),image_txt.getImage());
      //  activite = new Activite();
  //     activite.setSujet(sujet_txt.getText());
     //   activite.setCategorie(type_txt.getPromptText());
   //     activite.setLieu(lieu_txt.getText());
      //  activite.setDate(date_txt.getPromptText());
     //   activite.setDetails(details_txt.getText());
//    activite.setImage(Byte.parseByte(image.getText()));
        Composant comp = new Composant();

     //   HBox hb1 = comp.addlineann(activite);
        vb1.getChildren().add(comp.addline(activite));

        System.out.println("mmmmmmm");

        Connexion cn = new Connexion();
        try {
            cn.createconnection();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        cn.addactivite(1,activite);
        System.out.println("jjjjjjjj");


    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        validerann.setOnAction(e-> AjouterAnn());

        image_btn.setOnAction(event ->importimage(new Stage()) );

    }
}