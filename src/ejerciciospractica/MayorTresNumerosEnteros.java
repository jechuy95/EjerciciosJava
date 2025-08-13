/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * El programa lee por teclado tres números enteros y calcula y muestra el mayor de los tres
 */
public class MayorTresNumerosEnteros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int numerouno = leer.nextInt();
        System.out.println("Ingresa el segundo numero");
        int numerodos = leer.nextInt();
        System.out.println("Ingresa el tercer numero");
        int numerotres = leer.nextInt();
        
        if (numerouno > numerodos) {
            if(numerouno > numerotres){
            System.out.println("El numero mayor es: " + numerouno);
            }else{
                System.out.println("El numero mayor es " + numerotres);
            }
        } else if (numerodos > numerotres){
                System.out.println("El numero mayor es: " + numerodos);
            } else {
            System.out.println("El numero mayor es: " + numerotres);
        }
    }
}
