/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author argane
 */
public class rapport extends Activite{
    
    String pdf;
    
    public rapport(String detActivite, String sujet, String lieu, int idUser, String Categorie,String pdf) {
        super(detActivite, sujet, lieu, idUser, Categorie);
        this.pdf = pdf;
    }
    
      public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }
    
}
