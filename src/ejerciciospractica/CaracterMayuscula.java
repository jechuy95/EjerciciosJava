/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * Programa que lea un carácter por teclado y compruebe si es una letra mayúscula 
 */
public class CaracterMayuscula {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una letra ");
        char letra = leer.next().charAt(0);
        
        if (Character.isUpperCase(letra)) {
            System.out.println("La letra: " + letra + " es mayuscula");
        }else{
        System.out.println("La letra " + letra + " es minuscula");
        }
    }
}
