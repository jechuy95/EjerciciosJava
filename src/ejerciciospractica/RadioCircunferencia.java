/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra 
    por pantalla la longitud y el área de la circunferencia.  
    Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
 */
public class RadioCircunferencia {
    public static void main(String[] args) {
        double longitud, area, primerC;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el redio de la circunferencia");
        double radio = leer.nextDouble();
        //Math.PI = 3.14166666  El valor de PI 
        longitud = 2*Math.PI*radio;
        primerC = Math.pow(radio,2);
        area = Math.PI*primerC;
        
        System.out.println("La longitud del radio: " + radio + " es " + longitud);
        System.out.println("El area del radio: " + radio + " es " + area);   
    }
}
