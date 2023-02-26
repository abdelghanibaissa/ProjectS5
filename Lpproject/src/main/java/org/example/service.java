/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author argane
 */
public class service {
   public static int id=10;
    private String name;
    public service(String name){
        id++;
        this.name = name;
    }
  

   public static int getId() {
        return id;
    }

 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

