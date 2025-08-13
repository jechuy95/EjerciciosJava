/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * Programa que tome como dato de entrada un número que corresponde a la longitud del radio una esfera y 
nos calcula y escribe el volumen de la esfera que se corresponden con dicho radio. 
 
La fórmula para calcular el volumen de la esfera es  
v = (4/3)*PI*r^3 
 */
public class VolumenEsfera {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la longitud del radio");
        double longitudRadio = leer.nextDouble();
        double volumen = (4.0/3)*Math.PI*Math.pow(longitudRadio, 3);
        System.out.println("El volumen de la esfera es: " + volumen);
    }
}
