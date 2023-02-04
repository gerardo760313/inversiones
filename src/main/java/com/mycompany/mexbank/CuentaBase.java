/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mexbank;

/**
 *
 * @author Geras
 */
public class CuentaBase {
    //Mis atributos
    private double inversionInicial;
    private double montoActual;
    private int tipoInversion;
    private double depositar;
    private double aniosInversion;
    
    //Constructor de montoActual
    public CuentaBase(double montoActual) {
        this.montoActual = montoActual;
    }       
            //Inicializo el estado de los atributos mediante el constructor 
    public CuentaBase(double montoActual, int tipoInversion, double depositar, double inversionInicial, double aniosInversion) {
        this.montoActual = montoActual;
        this.tipoInversion = tipoInversion;
        this.depositar = depositar; 
        this.inversionInicial = inversionInicial;
        this.aniosInversion = aniosInversion;
    }      
                //Encapsulo montoActual
        public void setmontoActual(double montoActual) {
        this.montoActual = montoActual;
    }
                //EncapsuloinversionInicial
    public void setinversion(double inversionInicial) {
        this.inversionInicial = inversionInicial;
    }
    
                //Mostramos el montoActual
    public double getmontoActual() {
        return montoActual;
    }
            //Encapsulo tipo
    public void setTipoInversion(int tipoInversion) {
        this.tipoInversion = tipoInversion;
    }
            //Mostramos tipo
     public int getTipoInversion() {
        return tipoInversion;
    }
     
    public void setAniosInversion(int aniosInversion) {
        this.aniosInversion = aniosInversion;
    }
            //Mostramos tipo
     public double getAniosInversion() {
        return aniosInversion;
    }
     
             //Encapsulo inversionInicial
    public void setInversionInicial(double inversionInicial) {
        this.inversionInicial = inversionInicial;
    }
            //Mostramos InversionInicial
     public double getInversionInicial() {
        return inversionInicial;
    }
     
          //Encapsulo depositar
    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }
            //Mostramos depositar
     public double getDepositar() {
        return depositar;
    }
}


