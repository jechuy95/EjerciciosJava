/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * Programa que lea dos números por teclado y muestre el resultado de la división del primer 
número por el segundo. Se debe comprobar que el divisor no puede ser cero.
 */
public class DividirDosNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        double numerouno = leer.nextDouble();
        System.out.println("Ingresa el segundo numero");
        double numerodos = leer.nextDouble();
        
        if (numerodos > 0) {
            double resultado = numerouno/numerodos;
            System.out.println("El resultado de la division es: " + resultado);            
        } else {
            System.out.println("El numero divisor es igual a 0");
        }
    }
}
