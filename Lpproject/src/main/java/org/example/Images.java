/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author argane
 */
public class Images {
    private static int idimg;
    private String imgs;
    
    public Images(String img){
        idimg++;
        this.imgs = img;
    
    }
    
     public int getid() {
        return idimg;
    }

    
     public String getName() {
        return imgs;
    }

    public void setName(String name) {
        this.imgs = name;
    }
}
