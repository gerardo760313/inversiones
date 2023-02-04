/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mexbank;

/**
 *
 * @author Geras
 */

//la clase Acciones hereda de la clase CuentaBase "extends" 
public class Acciones extends CuentaBase{
    //Metodo constructor (Inicialisamos los atributos)
    public Acciones(double montoActual, int tipoInversion, double depositar, double inversion, double aniosInversion){
        super (montoActual, tipoInversion, depositar, inversion, aniosInversion);      
        // Super le decimos cuales son los Heredados de otra clase, y ya estan inicialisados 
      
    }    
        //Metodo de Instancia y Muestro en mi clase principal con "sumaInteres"
    public void sumaInteres(double montoActual, int tipoInversion, double aniosInversion, double depositar){
        double interes;          
        double agregado;
        agregado = (aniosInversion-1)*depositar;
        if(tipoInversion ==1){            
            interes = (montoActual+agregado)*(0.05*aniosInversion);
            //total = montoActual + interes;
            System.out.println("Tus intereses seran: " + interes );
        }else{
            interes = (montoActual+agregado)*(0.20*aniosInversion); 
            //total = montoActual + interes;
            System.out.println("Tus intereses seran: " + interes );
        }
    }
    
    public void retirar(double montoActual){
        double retiro = 0, total;  
        total = montoActual - retiro; 
        System.out.println("tu saldo es: " + total);
    }
    
    public void invertir(double montoActual, double aportacionMensual,int tipoInversion, double aniosInversion, double depositar){
        double interes, total, granTotal;  
        double anual = (12*aniosInversion)*aportacionMensual;
        double agregado;
        agregado = (aniosInversion-1)*depositar;
        if(tipoInversion ==1){
            interes = (montoActual+agregado)*(0.05*aniosInversion); 
            total = (montoActual*(aniosInversion)) + interes + agregado;
            granTotal = total + anual;
            System.out.println("Tu saldo es: " + granTotal);
        } else {
            interes = (montoActual+agregado)*(0.20*aniosInversion); 
            total = (montoActual*(aniosInversion)) + interes + agregado;
            granTotal = total + anual;
            System.out.println("Tu saldo al final es: " + granTotal);
        }        
    }
}

