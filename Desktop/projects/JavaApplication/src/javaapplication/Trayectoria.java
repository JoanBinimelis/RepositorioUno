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
public class Trayectoria {

    public static double recorrido (Punto ... puntos) throws Exception {
        double dist = 0.0;
        
        if (puntos.length == 0)
            throw new Exception("No hay trayectoria");
        
        Punto anterior = puntos[0];
        
        for (Punto actual : puntos) {
            if (actual == null)
                throw new Exception ("Hay un punto nulo");
            
            dist += actual.distancia(anterior);
            anterior = actual;
        }
        
        return dist;
    }
    
    public static void main(String[] args) throws Exception {
        Punto p1, p2, p3, p4, p5;
        
        p1 = new Punto (0, 0);
        p2 = new Punto (2, 4);
        p3 = new Punto (4, 5);
        p4 = new Punto (4, 6);
        p5 = new Punto (3, 4);
        
        System.out.println("Se ha recorrido " + 
                        recorrido (p1, p2, p3, p4, p5, p1));
        
        System.out.println("Se ha recorrido " + recorrido (p1));
        
        System.out.println("Se ha recorrido " + recorrido ());
    }
}
