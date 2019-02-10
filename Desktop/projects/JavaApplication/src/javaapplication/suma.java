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
public class suma {
    
    public static int sumaTotal (int ... números) {
        int suma = 0;
        
        for (int num: números) {
            suma += num;
        }
        
        return suma;
    }
    
    public static void main(String[] args) {
        int x;
        
        x = sumaTotal (3, 5, 2, 4, 6);
        System.out.println("Primea suma = " + x);
        
        x = sumaTotal (2, 10, -1, 2);
        System.out.println("Segunda suma = " + x);
        
        x = sumaTotal (10);
        System.out.println("Tercera suma = " + x);
        
        x = sumaTotal ();
        System.out.println("Cuarta suma = " + x);
    }
}
