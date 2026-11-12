/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int operacion;
        int val1;
        int val2;
        int resultado;
        String seleccion;
        System.out.println("Que operacion desea realizar\n"
                + "Ingrese 1 para sumar\n"
                + "Ingrese 2 para restar\n"
                + "Ingrese 3 para multiplicar\n"
                + "Ingrese 4 para dividir\n"
                + "Ingrese 5 para modulo\n"
                + "Ingrese 6 para potencia\n");
        operacion = entrada.nextInt();
       seleccion = "Ninguna operacion";
        resultado = 0;
        System.out.println("Ingrese el valor del primer termino: ");
        val1 = entrada.nextInt();
        System.out.println("Ingrese valor del segundo termino, debe ser menor al primer termino: ");
        val2 = entrada.nextInt();

        if (val1 > val2) {
            switch (operacion) {

                case 1:
                    seleccion = "Suma";
                    resultado = val1 + val2;
                    break;

                case 2:
                    seleccion = "Resta";
                    resultado = val1 - val2;
                    break;
                case 3:
                    seleccion = "Multiplicacion";
                    resultado = val1 * val2;
                    break;

                case 4:
                    seleccion = "Division";
                    resultado = val1 / val2;
                    break;

                case 5:
                    seleccion = "Modulo";

                    resultado = val1 % val2;
                    break;

                case 6:
                    seleccion = "Exponenete";
                    resultado = Math.powExact(val1, val2);
                    break;

                default:
                    System.out.println("Operacion invalida");
                    break;
            }

        } else {
            System.out.println("La operacion no puede ser realizada");

        }

        System.out.printf("OPERACIONES ARITMETICAS\n\n"
                + "Primer numero: %d\n"
                + "Segundo numero: %d\n"
                + "Operacion seleccionada: %s\n\n"
                + "Resultado de la operacion: %d\n", val1, val2, seleccion, resultado);
    }
}
