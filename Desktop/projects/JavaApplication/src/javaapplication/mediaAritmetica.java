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
public class mediaAritmetica {

    public static double mediaAritmetica (double ... números) {
        double suma = 0.0;
        
        for (double num: números) {
            suma += num;
        }
        
        return suma / números.length;
    }
    public static void main(String[] args) {
        double media;
        
        media = mediaAritmetica (10, 5, 0, 7, 20);
        System.out.println("La meida es = " + media);
    }
}
