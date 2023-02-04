/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mexbank;

/**
 *
 * @author Geras
 */
import  java.util.Scanner;
public class MexBank {

    public static void main(String[] args) {
        //Creamos el objeto de la clase Acciones, nombre accion, new, Clase Acciones, (inicialisamos)
        Scanner sc = new Scanner(System.in);
        double inversionInicial, aportacionMensual,aniosInversion, depositar;
        int tipoInversion = 0;
        System.out.println("Tipo de Inversion ingresa segun el caso: 1 = Cetes, 2 = Bolsa");
        tipoInversion = sc.nextInt();        
        while(tipoInversion != 1 && tipoInversion != 2 )
        {
            System.out.println("Elige una opcion Valida");
            tipoInversion = sc.nextInt();
        }
        System.out.println("Ingresa cuanto invertiras");
        inversionInicial = sc.nextDouble();
        while(inversionInicial < 1000)
        {
            System.out.println("Tu inversion debe ser mayor a  $1,000.00");
            inversionInicial = sc.nextDouble();
        }
        
        System.out.println("Cuanto aportaras mensualmente?");
        aportacionMensual = sc.nextDouble();
        System.out.println("Por cuantos años es tu inversion?");
        aniosInversion = sc.nextDouble();
        System.out.println("Cuanto incrementara cada año la aportación?");
        depositar = sc.nextDouble();
        
        Acciones accion = new Acciones(0, tipoInversion,0, inversionInicial, aniosInversion); 
        accion.sumaInteres(inversionInicial, tipoInversion, aniosInversion, depositar);
        accion.invertir(inversionInicial, aportacionMensual, tipoInversion, aniosInversion, depositar);
        accion.retirar(0);        
        
       

    }
}
