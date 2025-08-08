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
public class NumeroDobleTriple {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int n1 = leer.nextInt();
        System.out.println("El numero que ingresaste es el siguiente: " + n1);
        System.out.println("Doble del numero: " + n1 + " es " + 2*n1);
        System.out.println("Triple del numero: " + n1 + " es " + 3*n1);
    }
}
