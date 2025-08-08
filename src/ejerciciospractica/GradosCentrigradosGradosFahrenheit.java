/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * EJERCICIO 4: 
    Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.  
    La fórmula correspondiente para pasar de grados centígrados a fahrenheit es: 
    F = 32 + ( 9 * C / 5) 
 */
public class GradosCentrigradosGradosFahrenheit {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa la cantidad en grados centigrados");
        double graC = leer.nextDouble();
        double F = 32 + (9 * graC / 5);
        System.out.println("La conversion de grados centrigrados: " + graC + " a grados Fahrenheit es: " + F);
    }
}
