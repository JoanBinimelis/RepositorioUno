package javaapplication11;


public class JavaApplication11 {

    
    public static int[][] escacs( int c, int f ){
        
        int [][] tauler = new int [c] [f] ;
        
        for  ( int i = 0 ; i < tauler.length; i ++){
            System.out.println("     ");
            for (int k = 0; k <tauler[0].length; k ++) {
                
                int calcul = tauler [i] [k] = k+i*tauler[0].length;
                
                System.out.print(calcul);
        
            }
        }
        return tauler;
        
    }
    
    
    public static void main(String[] args) {
        
        escacs(8, 8) ;
    }
}


