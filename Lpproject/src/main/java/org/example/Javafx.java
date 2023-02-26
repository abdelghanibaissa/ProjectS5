package org.example;

import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.concurrent.ExecutionException;


public class Javafx extends Application {
  //  Firestore db = FirestoreOptions.getDefaultInstance().getService();

    @Override
    public void start(Stage stage) throws Exception {
        Connexion con = new Connexion();
        con.createconnection();
     //   con.importimage(stage);
      String javaversion = System.getProperty("java.version");
      String javafxversion = System.getProperty("javafx.version");
        Label label = new Label("hakiiim");
        URL url = new File("src/main/java/org/example/DashboordRS.fxml").toURI().toURL();

        Parent root = FXMLLoader.load(url);


        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
     System.out.println("Hello world!");


      launch();
    }

}