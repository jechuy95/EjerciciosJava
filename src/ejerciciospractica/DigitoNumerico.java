/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra 
entre 0 y 9).
 */
public class DigitoNumerico {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un caracter");
        char c = leer.next().charAt(0);
        
        if (c >='0' && c<='9') {
            System.out.println(c + " es un numero");
        } else {
            System.out.println("No es un numero");
        }
    }
}
