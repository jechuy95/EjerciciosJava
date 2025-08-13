/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

/**
 *
 * @author Jesus Rojas
 *  Ejemplo de uso de do-while. Programa Java que muestre los números del 1 al 100 
utilizando la instrucción do..while. 
 */
public class DoWhileUnoAlCien {
    public static void main(String[] args) {
        int x = 1;
        do {            
            System.out.println("numero = " + x);
            x++;
        } while (x<=100);
    }
}
