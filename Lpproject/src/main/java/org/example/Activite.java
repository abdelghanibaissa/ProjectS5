/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import com.google.cloud.Date;
import javafx.scene.image.Image;

import java.util.ArrayList;

/**
 *
 * @author argane
 */
public class Activite {
    public static int idActivite = 500;
    private String detActivite;
    private String date;
    private String sujet;
    private String lieu;
    private String details;
    private int idUser;
    private String  Categorie;
    private Image image;



    public Activite(String detActivite, String sujet, String lieu, int idUser, String Categorie) {

        idActivite++;
        this.detActivite = detActivite;
        this.date = date;
        this.sujet = sujet;
        this.lieu = lieu;
        this.idUser = idUser;
        this.Categorie =Categorie;
    }

    public Activite(String sujet, String Categorie, String lieu, String date, String details, Image image){
        idActivite++;
         this.sujet=sujet;
         this.Categorie=Categorie;
         this.lieu=lieu;
         this.date= date;
         this.details=details;
         this.image=image;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCategorie() {
        return Categorie;
    }

 /*   public byte getImage() {
        return image;
    }

    public void setImage(byte image) {
        this.image = image;
    }   */
    /*  public Activite(String sujet,String nomActivite,ArrayList<String> img){
        this.sujet = sujet;
        this.detActivite = nomActivite;
        this.img = img;
    }  */

    public int getIdActivite() {
        return idActivite;
    }

    
    public void setIdActivite(int idActivite) {
        this.idActivite = idActivite;
    }

    public String getNomActivite() {
        return detActivite;
    }

    public void setNomActivite(String nomActivite) {
        this.detActivite = nomActivite;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

 
   

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

  
  

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getIdCategorie() {
        return Categorie;
    }

    public void setCategorie(String idCategorie) {
        this.Categorie = idCategorie;
    }
}

