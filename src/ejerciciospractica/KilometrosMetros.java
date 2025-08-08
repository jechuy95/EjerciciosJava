/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * EJERCICIO 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado. 
 */
public class KilometrosMetros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la velocidad en kilometros/h");
        double vk = leer.nextDouble();
        double vm = vk*1000/3600;
        System.out.println("La velocidad en kilometros: " + vk + " a metros es " + vm);
    }
}
