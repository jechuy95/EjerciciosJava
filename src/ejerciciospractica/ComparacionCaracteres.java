/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * Programa que lea dos caracteres y compruebe si son iguales. 
 */
public class ComparacionCaracteres {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una letra ");
        char letraA = leer.next().charAt(0);
        System.out.println("Ingresa otra letra");
        char letraB = leer.next().charAt(0);
        
        if (letraA == letraB) {
            System.out.println("Las dos letras son iguales");            
        }else{
            System.out.println("Las dos letras son diferentes");
        }
    }
}
