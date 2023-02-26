/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;


import static java.time.Clock.system;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import static javafx.geometry.Pos.CENTER;
import static javafx.geometry.Pos.CENTER_LEFT;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import static javafx.scene.layout.Priority.NEVER;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
// import static jdk.nashorn.internal.objects.Global.Infinity;

/**
 *
 * @author argane
 */
public class Composant {
    
   String styleHbp = "alignment="+"CENTER_LEFT" +"layoutX="+"10.0" +"layoutY="+"48.0" 
         +"  maxHeight="+"-Infinity"+" minHeight="+"-Infinity"+" prefHeight="+"60.0" 
      +  "  prefWidth="+"637.0"+" style="+"-fx-background-color: #0000; "
         + "-fx-border-style: solid none none none; -fx-background-radius: 30;";
   
   String stylehbpt = "-fx-background-color: ffff; -fx-border-style: solid none none none;";
    
double i =20;
    
    ImageView imgv = new ImageView();
    ImageView imgv2 = new ImageView();

    
    HBox hbp = new HBox();
    HBox hb1 = new HBox();
    HBox hb2 = new HBox();

    Button btn1 = new Button("modifier");
    Button btn2 = new Button("supprimer");
    Button btn3 = new Button("voire plus");


    Label lb1 = new Label("sejet1");
    Label lb2 = new Label("12/05/2022");
    
    public void imgstyle(){
       // Image image = new Image("/images/9648301_38767%201.png");
      
        imgv.setImage(new Image("file:/lp.images/dash.png"));
       // imgv = new ImageView(image);
        imgv.setFitWidth(53);
        imgv.setFitHeight(50);
        imgv.setPickOnBounds(true);
        imgv.setPreserveRatio(true); 
    }
     public void img2style(){
        imgv2.setImage(new Image("@anno.png"));
      
        
        imgv2.setFitWidth(53);
        imgv2.setFitHeight(50);
        imgv2.setPickOnBounds(true);
        imgv2.setPreserveRatio(true); 
    }
    
    // hb1 ----------------------------
    public void hb1style(){
        
         hb1.setStyle("-fx-background-color: ffff;");
        hb1.setAlignment(CENTER_LEFT);
    //    hb1.setMaxHeight(-Infinity);
      //  hb1.setMinHeight(-Infinity);
        hb1.setPrefHeight(59);
        hb1.setPrefWidth(425);   
     //     hb1.getChildren().add(imgv);

    }
     public void hb2style(){
       hb2.setAlignment(Pos.CENTER);
       hb2.setPrefHeight(60);
       hb2.setPrefWidth(252);
    //   hbp.setHgrow(hb2, Priority.NEVER);
       hb2.setStyle("-fx-background-color: #FFFF;"); 
    }
    
    public void hbpstyle(){
        hbp.setAlignment(CENTER_LEFT);
        hbp.setLayoutX(10);
        hbp.setLayoutY(48);
//        hbp.setMaxHeight(-Infinity);
  //      hbp.setMinHeight(-Infinity);
        hbp.setPrefHeight(60);
        hbp.setPrefWidth(637);
        hbp.setStyle(stylehbpt);
        
      
    }
    
    public void btn1style(){
        btn1.setId("btnok");
       btn1.setMnemonicParsing(false);
       btn1.setPrefHeight(35);
       btn1.setPrefWidth(94);
       btn1.setStyle("-fx-border-color: #329C0D; -fx-border-radius: 15; -fx-background-radius: 15;-fx-background-color: ffff");
       btn1.setText("Modifier");
       btn1.setTextFill(Paint.valueOf("#329C0D"));
    
       btn1.setFont(Font.font("system", FontWeight.NORMAL, FontPosture.REGULAR, 13));
       
    }
    
    public void btn2style(){
        btn2.setLayoutX(168);
       btn2.setLayoutY(28);
       btn2.setMnemonicParsing(false);
       btn2.setPrefHeight(35);
       btn2.setPrefWidth(94);
       btn2.setStyle("-fx-border-color: #C80202; -fx-border-radius: 15;-fx-background-radius: 15; -fx-background-color: ffff");
       btn2.setText("Supprimer");
       btn2.setTextFill(Paint.valueOf("C80202"));
       btn2.setPadding(new Insets(0,10,0,0));

       btn2.setFont(Font.font("system", FontWeight.NORMAL, FontPosture.REGULAR, 13));
    }
    
     public void btn3style(){
        btn3.setLayoutX(168);
       btn3.setLayoutY(28);
       btn3.setMnemonicParsing(false);
       btn3.setPrefHeight(35);
       btn3.setPrefWidth(215);
       btn3.setStyle("-fx-border-color: #031789; -fx-border-radius: 15;-fx-background-radius: 15; -fx-background-color: ffff");
       
       btn3.setTextFill(Paint.valueOf("031789"));
       btn3.setPadding(new Insets(0,10,0,0));

       btn3.setFont(Font.font("system", FontWeight.NORMAL, FontPosture.REGULAR, 13));
    }
    
     
     
     
     // ------------ add activites -------------------------
    
    public HBox addline(Activite act){
       
             
     imgstyle();
    hbpstyle();    
   
    hb2style();
    btn1style();
    btn2style();

     hb1style();
     
     lb1.setText(act.getSujet());
     lb2.setText(String.valueOf(act.getDate()));

     imgv.setImage(act.getImage());
     
        // hbp------------
        hbp.setPadding(new Insets(0,5,0,5));
    //    hb1.setPadding(new Insets(0,0,0,0));
        
        hb2.getChildren().add(btn1);
        hb2.getChildren().add(btn2);
        hbp.getChildren().add(hb1);
        hbp.getChildren().add(hb2);
      hb1.getChildren().add(imgv);
        hb1.getChildren().add(lb1);
       hb1.getChildren().add(lb2);  

         hb2.setSpacing(20);
      
        hbp.setHgrow(hb2, Priority.NEVER);
        hbp.setHgrow(hb1, Priority.ALWAYS);
             
        
        hbp.setOnMouseClicked(e->{
    
        });
        
        hbp.widthProperty().addListener(new ChangeListener<Number>() {
    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
        i =hb1.getWidth();
        
       double a = (i-lb1.getWidth()-lb2.getWidth()-53)/3;
       hb1.setSpacing(a<0?100:a);
   //  lb1.setText(String.valueOf(i));
    //   lb2.setText("hhhh");
    }
});
               
        return hbp;   
    }
    
    
    
            
            public HBox addlineann(Activite act){
       
             
     imgstyle();  
    hbpstyle();    
   
    hb2style();
    btn3style();
   

     hb1style();
     
        lb1.setText(act.getSujet());
     lb2.setText(String.valueOf(act.getDate()));

        // hbp------------
        hbp.setPadding(new Insets(0,5,0,5));
    //    hb1.setPadding(new Insets(0,0,0,0));
    btn3.setText("ajouter favorie");
        
        hb2.getChildren().add(btn3);
        
        hbp.getChildren().add(hb1);
        hbp.getChildren().add(hb2);
      hb1.getChildren().add(imgv);
        hb1.getChildren().add(lb1);
       hb1.getChildren().add(lb2);  

         hb2.setSpacing(20);
      
        hbp.setHgrow(hb2, Priority.NEVER);
        hbp.setHgrow(hb1, Priority.ALWAYS);
             
        
        hbp.setOnMouseClicked(e->{
    
        });
        
        hbp.widthProperty().addListener(new ChangeListener<Number>() {
    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
        i =hb1.getWidth();
        
       double a = (i-lb1.getWidth()-lb2.getWidth()-53)/3;
       hb1.setSpacing(a<0?100:a);
     lb1.setText(String.valueOf(i));
       lb2.setText("hhhh");
    }
});
               
        return hbp;   
    }
            
    
    public HBox addlinev(){
       
        imgv.setImage(new Image("file:/images/9648301_38767%201.png"));
        
        imgv.setFitWidth(53);
        imgv.setFitHeight(50);
        imgv.setPickOnBounds(true);
        imgv.setPreserveRatio(true);
        
        
        lb1.setText("ffshddd");
        lb2.setText("ff4554ddd");
        
        
       
    hbpstyle();    
    hb1style();
    hb2style();
    btn3style();
    

    
     
       

        // hbp------------
        hbp.setPadding(new Insets(0,5,0,5));
    //    hb1.setPadding(new Insets(0,0,0,0));
        
        hb2.getChildren().add(btn3);
       
        hbp.getChildren().add(hb1);
        hbp.getChildren().add(hb2);
        hb1.getChildren().add(imgv);
        hb1.getChildren().add(lb1);
        hb1.getChildren().add(lb2);

         hb2.setSpacing(20);
      
        hbp.setHgrow(hb2, Priority.NEVER);
        hbp.setHgrow(hb1, Priority.ALWAYS);
         
     //   hbp.setMargin(hb1,new Insets(0,0,0,0));

        
        hbp.setOnMouseClicked(e->{
  /*      System.out.println("hhdgckkkk");
         double i =hb1.getWidth();
       double a = (i-lb1.getWidth()-lb2.getWidth()-53)/3;
       hb1.setSpacing(a);
     lb1.setText(String.valueOf(i));   */
        });
        
        hbp.widthProperty().addListener(new ChangeListener<Number>() {
    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
        double i =hb1.getWidth();
        
       double a = (i-lb1.getWidth()-lb2.getWidth()-53)/3;
       hb1.setSpacing(50);
     lb1.setText(String.valueOf(i));
     lb2.setText("hhhh");
    }
});
        
        
        return hbp;
        
        /*  "alignment="+"CENTER_LEFT" +"layoutX="+"10.0" +"layoutY="+"48.0" 
         +"  maxHeight="+"-Infinity"+" minHeight="+"-Infinity"+" prefHeight="+"60.0" 
      +  "  prefWidth="+"637.0"  */
        
    }
}
