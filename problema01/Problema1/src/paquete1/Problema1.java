/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import java.util.Locale;

public class Problema1 {

    public static void main(String[] args) {
        try ( // Configuración para el ingreso de valores con punto decimal por teclado
                Scanner entrada = new Scanner(System.in)) {
            entrada.useLocale(Locale.US);
            
            // Declaración de variables para los proyectos y sus gastos
            String nombreProyecto1;
            String nombreProyecto2;
            String nombreProyecto3;
            
            double gastoProyecto1;
            double gastoProyecto2;
            double gastoProyecto3;
            
            double gastoTotalMensual;
            
            // Ingreso de datos para el Proyecto 1
            System.out.println("Ingrese el nombre del proyecto 1:");
            nombreProyecto1 = entrada.nextLine();
            System.out.println("Ingrese el gasto mensual del proyecto 1:");
            gastoProyecto1 = entrada.nextDouble();
            entrada.nextLine(); // Limpieza del buffer después de leer un número
            
            // Ingreso de datos para el Proyecto 2
            System.out.println("Ingrese el nombre del proyecto 2:");
            nombreProyecto2 = entrada.nextLine();
            System.out.println("Ingrese el gasto mensual del proyecto 2:");
            gastoProyecto2 = entrada.nextDouble();
            entrada.nextLine(); // Limpieza del buffer
            
            // Ingreso de datos para el Proyecto 3
            System.out.println("Ingrese el nombre del proyecto 3:");
            nombreProyecto3 = entrada.nextLine();
            System.out.println("Ingrese el gasto mensual del proyecto 3:");
            gastoProyecto3 = entrada.nextDouble();
            
            // Cálculo del gasto mensual total
            gastoTotalMensual = gastoProyecto1 + gastoProyecto2 + gastoProyecto3;
            
            // Generación del reporte organizado con dos cifras decimales (%.2f)
            System.out.println("\n========================================");
            System.out.println("       REPORTE DE GASTOS MENSUALES      ");
            System.out.println("========================================");
            System.out.printf("Proyecto 1: %s - Gasto: $%.2f\n", nombreProyecto1, gastoProyecto1);
            System.out.printf("Proyecto 2: %s - Gasto: $%.2f\n", nombreProyecto2, gastoProyecto2);
            System.out.printf("Proyecto 3: %s - Gasto: $%.2f\n", nombreProyecto3, gastoProyecto3);
            System.out.println("----------------------------------------");
            System.out.printf("Gasto mensual total: $%.2f\n", gastoTotalMensual);
            System.out.println("========================================");
        }
    }
}
