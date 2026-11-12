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
        String propietario;
        String descripcion;
        int tipo;
        double avaluo;
        double porcentaje;
        double valorFijo;
        double valorBase;
        double recargo;
        double total;

        System.out.println("Ingrese el nombre del propietario");
        propietario = entrada.nextLine();
        System.out.println("Vehiculo del propietario\n"
                + "1 si es Vehiculo liviano particular\n"
                + "2 si es Vehiculo pesado particular\n"
                + "3 si es Taxi\n"
                + "4 si es Bus urbano\n");
        tipo = entrada.nextInt();
        System.out.println("Ingrese el avaluo comercial del vehiculo: ");
        avaluo = entrada.nextDouble();

        descripcion = "Ninguno";
        porcentaje = 0;
        valorFijo = 0;
        valorBase = 0;
        total = 0;

        if (tipo >= 1 && tipo <= 4) {
            switch (tipo) {
                case 1:
                    descripcion = "Vehiculo liviano particular";
                    porcentaje = 0.01;
                    valorFijo = 2.50;
                    break;

                case 2:
                    descripcion = "Vehiculo pesado particular";
                    porcentaje = 0.02;
                    valorFijo = 2.50;
                    break;

                case 3:
                    descripcion = "Taxi";
                    porcentaje = 0.04;
                    valorFijo = 1.50;
                    break;

                case 4:
                    descripcion = "Bus urbano";
                    porcentaje = 0.05;
                    valorFijo = 2.20;
                    break;

            }
            valorBase = avaluo * porcentaje / 100 + valorFijo;
            recargo = 0;
            if ((tipo == 1 || tipo == 2) && avaluo > 30000) {
                recargo = 1.50;
            }

            total = valorBase + recargo;

            System.out.printf("Peaje Buena Via\n\n"
                    + "Propietario: %s\n"
                    + "Tipo: %s\n "
                    + "   Avaluo: %.2f\n"
                    + "   Valor base del peaje: $%.2f\n"
                    + "   Recargo: $%.2f\n\n"
                    + "   Total a cancelar: $%.2f\n", propietario, descripcion,
                    avaluo, valorBase, recargo, total);

        } else {
            System.out.println("El tipo de vehiculo ingresado no es valido");

        }
    }
}
