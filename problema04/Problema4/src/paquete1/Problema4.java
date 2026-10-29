/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import java.util.Locale;

public class Problema4 {

    public static void main(String[] args) {
        // Configuración para el ingreso de valores con punto decimal por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // Declaración de variables
        String nombreCliente;
        double costoCpu;
        double costoTeclado;
        double costoRaton;
        double costoPantalla;
        
        double costoBase;
        double costoOperacional; // 15% fijo sobre el costo base
        double costoFinal;
        
        // Ingreso de datos por teclado
        System.out.println("Ingrese el nombre del cliente:");
        nombreCliente = entrada.nextLine();
        
        System.out.println("Ingrese el costo de la CPU (Torre):");
        costoCpu = entrada.nextDouble();
        
        System.out.println("Ingrese el costo del Teclado:");
        costoTeclado = entrada.nextDouble();
        
        System.out.println("Ingrese el costo del Ratón:");
        costoRaton = entrada.nextDouble();
        
        System.out.println("Ingrese el costo de la Pantalla:");
        costoPantalla = entrada.nextDouble();
        
        // Cálculos
        costoBase = costoCpu + costoTeclado + costoRaton + costoPantalla;
        costoOperacional = costoBase * 0.15; // 15% de Costos Operacionales
        costoFinal = costoBase + costoOperacional;
        
        // Generación del Reporte exacto sin guiones
        System.out.println("\nReporte:");
        System.out.printf("Nombres de cliente: %s\n", nombreCliente);
        System.out.println("Valores iniciales:");
        System.out.printf("CPU:  $ %.1f\n", costoCpu);
        System.out.printf("Teclado: $ %.1f\n", costoTeclado);
        System.out.printf("Ratón: $ %.1f\n", costoRaton);
        System.out.printf("Pantalla: $ %.1f\n\n", costoPantalla);
        
        System.out.printf("Costo base: $ %.0f\n", costoBase);
        System.out.printf("Costo adicional del 15%%: %.2f\n", costoOperacional);
        System.out.printf("Costo final: $ %.2f\n", costoFinal);
        
        entrada.close();
    }
}
