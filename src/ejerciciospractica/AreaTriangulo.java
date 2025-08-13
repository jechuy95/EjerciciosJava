/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospractica;

import java.util.Scanner;

/**
 *
 * @author Jesus Rojas
 * Programa Java que calcule el área de un triángulo en función de las longitudes de sus lados (a, b, c), 
según la siguiente fórmula:   
Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c)) 
donde p =  (a+b+c)/2 
Para calcular la raíz cuadrada se utiliza el método Math.sqrt() 
 */
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double a,b,c;
        System.out.println("Ingrese la longitud del lado a");
        a = leer.nextDouble();
        System.out.println("Ingrese la longitud del lado b");
        b = leer.nextDouble();
        System.out.println("Ingrese la longitud del lado c");
        c = leer.nextDouble();
        double p = (a+b+c)/2;
        double operacion = (p*(p-a)*(p-b)*(p-c));
        double area = Math.sqrt(operacion);
        System.out.println("El area del triangulo es: " + area);
    }
}
