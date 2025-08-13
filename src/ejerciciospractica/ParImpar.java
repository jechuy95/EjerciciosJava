/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * Programa Java que lea un número entero por teclado y calcule si es par o impar. 
 
Podemos saber si un número es par si el resto de dividir el número entre 2 es igual a cero. En caso contrario 
el número es impar 
 
El operador Java que calcula el resto de la división entre dos números enteros o no es el operador % 
 */
public class ParImpar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu numero");
        int numero = leer.nextInt();
        if (numero%2==0) {
            System.out.println("El numero: " + numero + " es par");
        } else {
            System.out.println("El numero: " + numero + " es impar");
        }
    }
}
