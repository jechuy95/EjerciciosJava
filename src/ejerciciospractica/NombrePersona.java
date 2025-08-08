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
public class NombrePersona {
    //Ingresa un nombre y muestralo con el mensaje de buenos días
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        System.out.println("Buenos días " + nombre);
    }
}
