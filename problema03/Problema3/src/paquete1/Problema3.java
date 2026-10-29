/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import java.util.Locale;

public class Problema3 {

    public static void main(String[] args) {
        try ( // Configuración para el ingreso de valores con punto decimal por teclado
                Scanner entrada = new Scanner(System.in)) {
            entrada.useLocale(Locale.US);
            
            // Declaración de variables
            String titular;
            String direccion;
            double costoPorMinuto;
            double minutosConsumidos;
            double valorTotalAPagar;
            
            // Ingreso de datos por teclado
            System.out.println("Ingrese el nombre del titular:");
            titular = entrada.nextLine();
            
            System.out.println("Ingrese la dirección:");
            direccion = entrada.nextLine();
            
            System.out.println("Ingrese el costo por minuto:");
            costoPorMinuto = entrada.nextDouble();
            
            System.out.println("Ingrese los minutos consumidos:");
            minutosConsumidos = entrada.nextDouble();
            
            // Cálculo del valor total a pagar
            valorTotalAPagar = costoPorMinuto * minutosConsumidos;
            
            // Generación del reporte organizado
            System.out.println("\n==========================================================");
            System.out.println("PLANILLA DE SERVICIO TELEFÓNICO");
            System.out.println("==========================================================");
            System.out.printf("Titular: %s\n", titular);
            System.out.printf("Dirección: %s\n", direccion);
            System.out.println("----------------------------------------------------------");
            System.out.printf("Costo por minuto: $%.2f\n", costoPorMinuto);
            System.out.printf("Minutos consumidos: %.0f\n", minutosConsumidos);
            System.out.println("----------------------------------------------------------");
            System.out.printf("VALOR TOTAL A PAGAR:  $%.2f\n", valorTotalAPagar);
            System.out.println("==========================================================");
        }
    }
}