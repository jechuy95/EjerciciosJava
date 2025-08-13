/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

/**
 *
 * @author Jesus Rojas
 *  Ejemplo de uso de do-while. Programa Java que muestre los números del 100 al 1 
utilizando la instrucción do..while. 
 */
public class DoCienUno {
    public static void main(String[] args) {
        int x=100;
        do {            
            System.out.println("Numero : " + x);
            x--;
        } while (x>=1);
    }
}
