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
public class PuntoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p1 = new Punto (0, 0);
        Punto p2 = new Punto (5, 3);
        Punto p3 = new Punto (2, -1);
        Punto p4 = new Punto ((p2.dameX() + p3.dameX())/2,
                            (p2.dameY() + p3.dameY())/2);
    }
    
}
