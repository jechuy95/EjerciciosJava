/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;
import java.util.Scanner;
/**
 *
 * @author Jesus Rojas
 * Programa Java que muestre los números del 1 al 100 utilizando la instrucción 
while
 */
public class UnoAlCien {
    public static void main(String[] args) {
        int x = 1;
        while (x<101) {
            int resultado = x++;
            System.out.println("numero = " + resultado);
        }
    }
}
