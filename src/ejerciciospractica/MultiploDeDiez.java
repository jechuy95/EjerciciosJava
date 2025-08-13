/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * Programa que lea un número entero y muestre si el número es múltiplo de 10. 
 
Podemos comprobar si un número entero es múltiplo de 10 si al dividirlo por 10 es resto de esta división 
es cero.
 */
public class MultiploDeDiez {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = leer.nextInt();
        if (numero%10==0) {
            System.out.println("El numero: " + numero + " es multiplo de 10");
        }else{
            System.out.println("El numero: " + numero + " no es multiplo de 10");
        }
    }
}
