package pruebaa;

import java.io.IOException;
import java.util.Scanner;


public class Pruebaa {


    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        
        double num1, num2 ;
        
        System.out.println("Escribe el numero q quieres dividir");
        num1 = entrada.nextDouble();
        
        System.out.println("Introduce el divisor");
        
        num2 = entrada.nextDouble();
        
        if (num2 == 0) {
            System.out.println("no se puede dividir");
        } else {
            
            System.out.println(num1 /num2);
        }
    
    
    
    
    }
}
    

