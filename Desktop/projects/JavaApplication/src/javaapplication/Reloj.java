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
enum TipoHorario { H24, H12 };

enum TurnoHorario { AM, PM };

class Reloj {
    
    private int hora, minutos, segundos;
        
private void compruebaHora (int hora, int minutos, int segundos)
                                throws Exception {
        if ( hora < 0 || hora > 23 )
            throw new Exception ("Error en hora");
        if ( minutos < 0 || minutos > 59 )
            throw new Exception ("Error en minutos");
        if ( segundos < 0 || segundos > 59 )
            throw new Exception ("Error en segundos");
    }   

    public Reloj() {
        hora = minutos = segundos = 0;
}

public Reloj(int hora, int minutos, int segundos) throws Exception {
        compruebaHora(hora, minutos, segundos);
    
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
}

    public Reloj(int hora, int minutos) throws Exception {
        this(hora, minutos, 0);
    }
    
    String dameHora(){
        return hora + ":" + minutos + ":" + segundos;
    }
    
    String dameHora(TipoHorario tipo) {
        String res;
        
        if ( tipo == TipoHorario.H12 && hora > 12 )
            res = "" + (hora-12);
        else
            res = "" + hora;
        
        res += ":" + minutos + ":" + segundos + ( (hora < 12) ? "am" : "pm");
        
        return res;
    }
    
    void ponHora(int hora, int minutos) throws Exception {
        ponHora(hora, minutos, 0);
    }
    
void ponHora (int hora, int minutos, int segundos) throws Exception {
        compruebaHora(hora, minutos, segundos);
    
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

void ponHora (int hora, int minutos, int segundos, TurnoHorario t)
                            throws Exception {
    compruebaHora (hora, minutos, segundos, TipoHorario.H12);
    
    if ( t == TurnoHorario.PM ){
        hora += 12;
    }
    
    this.hora = hora;
    this.minutos = minutos;
    this.segundos = segundos;
}

private void compruebaHora (int hora, int minutos, int segundos, TipoHorario t)
                            throws Exception {
    if ( t == TipoHorario.H24){
        if ( hora < 0 || hora > 23 ){
            throw new Exception ("Error en hora formato 24H");
        }
    }
    
    if ( t == TipoHorario.H12){
        if ( hora < 0 || hora > 11){
            throw new Exception ("Error en hora formato 12H");
        }
    }
    
    if ( minutos < 0 || minutos > 59 ){
        throw new Exception ("Error en minutos");
    }
    
    if ( segundos < 0 || segundos > 59){
        throw new Exception ("Error en segundos");
    }
}
}

