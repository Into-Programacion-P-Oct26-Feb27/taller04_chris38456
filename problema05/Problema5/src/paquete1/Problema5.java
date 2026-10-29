/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import java.util.Locale;

public class Problema5 {

    public static void main(String[] args) {
        try ( // Configuración para el ingreso de valores con punto decimal por teclado
                Scanner entrada = new Scanner(System.in)) {
            entrada.useLocale(Locale.US);
            
            // Declaración de variables
            String nombreCliente;
            
            // Precios originales
            double precioNetflix;
            double precioYoutube;
            double precioDropbox;
            double precioSpotify;
            
            // Valores de descuento
            double descuentoNetflix;
            double descuentoYoutube;
            double descuentoDropbox;
            double descuentoSpotify;
            
            // Precios finales por servicio
            double precioFinalNetflix;
            double precioFinalYoutube;
            double precioFinalDropbox;
            double precioFinalSpotify;
            
            // Totales generales
            double costoTotalSinDescuento;
            double ahorroTotalMensual;
            double valorTotalAPagar;
            
            // Ingreso de datos por teclado
            System.out.println("Ingrese el nombre del cliente:");
            nombreCliente = entrada.nextLine();
            
            System.out.println("Ingrese el precio mensual original de Netflix:");
            precioNetflix = entrada.nextDouble();
            
            System.out.println("Ingrese el precio mensual original de YouTube Premium:");
            precioYoutube = entrada.nextDouble();
            
            System.out.println("Ingrese el precio mensual original de Dropbox:");
            precioDropbox = entrada.nextDouble();
            
            System.out.println("Ingrese el precio mensual original de Spotify:");
            precioSpotify = entrada.nextDouble();
            
            // Cálculo de descuentos (Netflix 23%, YouTube 23%, Dropbox 45%, Spotify 0%)
            descuentoNetflix = precioNetflix * 0.23;
            descuentoYoutube = precioYoutube * 0.23;
            descuentoDropbox = precioDropbox * 0.45;
            descuentoSpotify = 0.0;
            
            // Cálculo de precios finales por servicio
            precioFinalNetflix = precioNetflix - descuentoNetflix;
            precioFinalYoutube = precioYoutube - descuentoYoutube;
            precioFinalDropbox = precioDropbox - descuentoDropbox;
            precioFinalSpotify = precioSpotify - descuentoSpotify;
            
            // Cálculos generales
            costoTotalSinDescuento = precioNetflix + precioYoutube + precioDropbox + precioSpotify;
            ahorroTotalMensual = descuentoNetflix + descuentoYoutube + descuentoDropbox + descuentoSpotify;
            valorTotalAPagar = precioFinalNetflix + precioFinalYoutube + precioFinalDropbox + precioFinalSpotify;
            
            // Generación del Reporte Detallado
            System.out.println("\n----------------------------------------------------------");
            System.out.println("REPORTE DE SERVICIOS DIGITALES");
            System.out.println("----------------------------------------------------------");
            System.out.printf("Cliente: %s\n\n", nombreCliente);
            
            System.out.println("--- Netflix ---");
            System.out.printf("Precio original: $%.2f | Descuento (23%%): $%.2f | Precio final: $%.2f\n",
                    precioNetflix, descuentoNetflix, precioFinalNetflix);
            
            System.out.println("\n--- YouTube Premium ---");
            System.out.printf("Precio original: $%.2f | Descuento (23%%): $%.2f | Precio final: $%.2f\n",
                    precioYoutube, descuentoYoutube, precioFinalYoutube);
            
            System.out.println("\n--- Dropbox ---");
            System.out.printf("Precio original: $%.2f | Descuento (45%%): $%.2f | Precio final: $%.2f\n",
                    precioDropbox, descuentoDropbox, precioFinalDropbox);
            
            System.out.println("\n--- Spotify ---");
            System.out.printf("Precio original: $%.2f | Descuento (0%%): $%.2f | Precio final: $%.2f\n",
                    precioSpotify, descuentoSpotify, precioFinalSpotify);
            
            System.out.println("\n----------------------------------------------------------");
            System.out.printf("Costo mensual total (sin descuentos): $%.2f\n", costoTotalSinDescuento);
            System.out.printf("Ahorro mensual total obtenido: $%.2f\n", ahorroTotalMensual);
            System.out.printf("Valor total a pagar mensualmente: $%.2f\n", valorTotalAPagar);
            System.out.println("----------------------------------------------------------");
        }
    }
}

