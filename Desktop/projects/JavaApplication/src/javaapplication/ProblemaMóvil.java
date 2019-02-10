/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemamóvil;
/**
 *
 * @author juano
 */
class Punto {
        private double x, y;
        
        Punto(double x, double y) {
            this.x = x;
            this.y = y;
        }
        
        double dameX(){
            return x;
        }
        
        double dameY(){
            return y;
        }
        
        String posición(){
            return "(" + x + ", " + y + ")";
        }
}
    
class MovUniforme {
        private double vel;
        
        MovUniforme(double vel) {
            this.vel = vel;
        }
        
        double recorrido(double t){
            return vel * t;
        }
    }
    
    class Recta{
        private double a;
        private double b;
        
        Recta(double a, double b){
            this.a = a;
            this.b = b;
        }
        
        double pendiente(){
            return Math.atan(a);
        }
    }
    
    class Móvil {
        
        private Punto posInicial;
        private Punto posAnterior;
        private Punto posActual;
        
        private final Recta trayectoria;
        private MovUniforme mov;
        
        Móvil(Punto origen, Recta trayectoria, MovUniforme mov) {
            this.posAnterior = this.posActual;
            this.posInicial = origen;
            
            this.trayectoria = trayectoria;
            this.mov = mov;
        }
        
        void avanza(double t) {
            Punto intermedio = new Punto (posActual.dameX(), 
                                          posActual.dameY());
            
            double dist = mov.recorrido (t);
            
            double alfa = trayectoria.pendiente();
            
            double incrX = dist * Math.cos(alfa);
            double incrY = dist * Math.sin(alfa);
            
            posActual = new Punto(posAnterior.dameX() + incrX,
                                  posAnterior.dameY() + incrY);
            
            posAnterior = intermedio;
        }
        
        Punto posActual(){
            return posActual;
        }
    }
public class ProblemaMóvil {
    
    public static void main(String[] args) {
        Punto inicial = new Punto (2.1, 5.2);
        
        Recta trayectoria = new Recta (2, 1);
        
        MovUniforme miMov = new MovUniforme (2.4);
        
        Móvil m = new Móvil(inicial, trayectoria, miMov);
        
        System.out.println("Me encuantro en " + m.posActual().posición());
        
        m.avanza(3.2);
        System.out.println("Me encuentro en " + m.posActual().posición());
        
        m.avanza(4);
        System.out.println("Me encuentro en " + m.posActual().posición());
        
        m.avanza(6.2);
        System.out.println("Me encuantro en " + m.posActual().posición());
    }
}
