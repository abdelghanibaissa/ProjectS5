/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author argane
 */
public class User {
    public static int idUser;
    private String prenom;
    private String nom;
    private int telephone;
    private String email;
    private String password;
    private String img;
    String service;

    private int idRole;

    public User( String prenom, String nom, int telephone, String email, String password, String img, int idRole) {
         idUser++;
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.img = img;
        this.idRole = idRole;

    }
  
    
     public User( String prenom, String nom, int telephone, String email, String password) {
         idUser++;
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
     

    }
    
    public User(String email,String password){
        idUser++;
        this.email = email;
        this.password = password;
        this.idRole = 3;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getpImg() {
        return img;
    }

    public void setpImg(String pImg) {
        this.img = pImg;
    }


    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public void adduser(String email,String pass){

    }


}
