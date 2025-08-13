/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 */
public class ValidarHora {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la hora");
        int H = leer.nextInt();
        System.out.println("Ingresa el minuto");
        int M = leer.nextInt();
        System.out.println("Ingresa el segundo");
        int S = leer.nextInt();
        
        if (H >=0 && H <=24 && M >=0 && M <=59 && S>=0 && S<=59) {
            System.out.println("Es una hora valida");
        } else {
            System.out.println("No es una hora valida");
        }
    }
}
