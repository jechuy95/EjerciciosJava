/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo. 
Por ejemplo para un número N = 12345   La salida debe ser:
* 1 
12 
123 
1234 
12345
 */
public class ProgramaCincoCifras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero");
        int numero = leer.nextInt();
        
        System.out.println(numero/10000);
        System.out.println(numero/1000);
        System.out.println(numero/100);
        System.out.println(numero/10);
        System.out.println(numero);
    }
}
