/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 */
public class EjerciciosPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Leer dos numeros y mostrarlos en consola
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int n1 = leer.nextInt();
        System.out.println("Ingresa otro numero");
        int n2 = leer.nextInt();
        System.out.println("Los numero que ingresaste son: " + n1 + " y " + n2);
    }
    
}
