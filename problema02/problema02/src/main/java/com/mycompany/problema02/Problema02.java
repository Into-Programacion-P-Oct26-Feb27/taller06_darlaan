/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema02;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int vehiculo;
        int vehiculoLiviano;
        int vehiculoGrande;
        int taxi;
        int bus;
        
        System.out.println("Ingrese que vehiculo utiliza\n"
                + "Ingrese 1 si es Vehiculo liviano particular\n"
                + "Ingrese 2 si es Vehiculo grande particular\n"
                + "Ingrese 3 si es Taxi\n"
                + "Ingrese 4 si es Bus urbano\n");
                vehiculo = entrada.nextInt();
                
                
    }
}
