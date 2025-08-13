/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * Programa Java que lea un número entero de 3 cifras y muestre por separado las cifras del número.
 */
public class LeerTresNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero de 3 cifras");
        int numero = leer.nextInt();
        String numeroStr = String.valueOf(numero); //convierte el numero entero en una cadena
        int[] digitos = new int[numeroStr.length()]; //Se crea un arreglo del tamaño del numero 
       
        //ciclo for para recorrer el numero
        for (int i = 0; i < numeroStr.length(); i++) {
            digitos[i] = Character.getNumericValue(numeroStr.charAt(i)); //guarda en digitos cada numero conforme se vaya recorriendo
            System.out.println("El numero es: " + digitos[i]); //Imprime el mensaje y cada numero
        }
    }
}
