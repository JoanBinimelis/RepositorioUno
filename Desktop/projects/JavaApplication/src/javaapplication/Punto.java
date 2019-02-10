/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author juano
 */
import java.lang.Math;

public class Punto {
    
     private double x, y;
     
     public Punto(double x, double y) {
         this.x = x;
         this.y = y;
     }
     
     public double dameX(){
         return x;
     }
     
     public double dameY(){
         return y;
     }
     
     public Punto () {
         this (0, 0);
     }
     
     public double distancia (Punto p) {
         double diffX = x - p.x;
         double diffY = y - p.y;
         
         return Math.sqrt (diffX * diffX + diffY * diffY);
     }
}
