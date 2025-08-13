/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;
/**
 *
 * @author Jesus Rojas
 * Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días, de 31 
o de 28. Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes. Se debe 
comprobar que el valor introducido esté comprendido entre 1 y 12.
 */
public class ValidarMes {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el mes");
        int mes = leer.nextInt();
        
        if(mes >= 1 && mes <=12){
            switch (mes) {
                case 1:
                    System.out.println("Es el mes de enero y tiene 31 días");                    
                    break;
                case 2:
                    System.out.println("Es el mes de febrero y tiene 28 días");
                    break;
                case 3:
                    System.out.println("Es el mes de marzo y tiene 31 días");
                    break;
                case 4:
                    System.out.println("Es el mes de abril y tiene 30 días");
                    break;
                case 5:
                    System.out.println("Es el mes de mayo y tiene 31 días");
                    break;
                case 6:
                    System.out.println("Es el mes de junio y tiene 30 días");
                    break;
                case 7:
                    System.out.println("Es el mes de julio y tiene 31 días");
                    break;
                case 8:
                    System.out.println("Es el mes de agosto y tiene 31 días");
                    break;
                case 9:
                    System.out.println("Es el mes de septiembre y tiene 30 días");
                    break;
                case 10:
                    System.out.println("Es el mes de octubre y tiene 31 días");
                    break;
                case 11:
                    System.out.println("Es el mes de noviembre y tiene 30 días");
                    break;
                case 12:
                    System.out.println("Es el mes de diciembre y tiene 31 días");
                    break;
                default:
            }
        }else{
        System.out.println("Es un mes invalido");
        }
    }
}
