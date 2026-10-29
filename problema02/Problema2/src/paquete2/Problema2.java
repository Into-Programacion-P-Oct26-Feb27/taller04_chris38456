/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete2;

import java.util.Scanner;
import java.util.Locale;

public class Problema2 {

    public static void main(String[] args) {
        // Configuración para el ingreso de valores con punto decimal por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // Declaración de variables
        double base;
        double altura;
        double area;
        
        // Ingreso de datos por teclado
        System.out.println("Ingrese la base del triángulo:");
        base = entrada.nextDouble();
        
        System.out.println("Ingrese la altura del triángulo:");
        altura = entrada.nextDouble();
        
        // Cálculo del área del triángulo
        area = (base * altura) / 2;
        
        // Presentación del reporte organizado con dos cifras decimales (%.2f)
        System.out.println("\n========================================");
        System.out.println("         REPORTE DE ÁREA DE TRIÁNGULO    ");
        System.out.println("========================================");
        System.out.printf("Base: %.2f\n", base);
        System.out.printf("Altura: %.2f\n", altura);
        System.out.println("----------------------------------------");
        System.out.printf("Área del triángulo: %.2f\n", area);
        System.out.println("========================================");
        
        entrada.close();
    }
}
