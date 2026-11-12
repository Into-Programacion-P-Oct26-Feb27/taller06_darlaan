/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dadaa
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String empleado;
        int tipo;
        double sueldoActual;
        int anios;
        double porcentaje;
        double incremento;
        double bonificacion;
        double nuevoSueldo;

        System.out.println("Ingrese el nombre del empleado: ");
        empleado = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado (1, 2, 3, 4 u otro): ");
        tipo = entrada.nextInt();
        System.out.println("Ingrese los años de servicio: ");
        anios = entrada.nextInt();
System.out.println("Ingrese el sueldo actual: ");
        sueldoActual = entrada.nextDouble();
        porcentaje = 0;
        incremento = 0;
        bonificacion = 0;
        nuevoSueldo = 0;

        if (sueldoActual >= 0 && anios >= 0) {

            switch (tipo) {

                case 1:
                    porcentaje = 5;
                    break;

                case 2:
                    porcentaje = 7;
                    break;

                case 3:
                    porcentaje = 9;
                    break;

                case 4:
                    porcentaje = 12;
                    break;

                default:
                    porcentaje = 15;
                    break;
            }

            incremento = sueldoActual * porcentaje / 100;

            if (anios < 2) {
                bonificacion = 0.00;
            } else if (anios < 5) {
                bonificacion = 30.00;
            } else if (anios < 10) {
                bonificacion = 60.00;
            } else {
                bonificacion = 100.00;
            }

            nuevoSueldo = sueldoActual + incremento + bonificacion;

            System.out.printf("\nREPORTE DE INCREMENTO SALARIAL\n"
                    + "Empleado: %s\n"
                    + "Tipo de empleado: %d\n"
                    + "Años de servicio: %d\n\n"
                    + "    Sueldo inicial: $%.2f\n"
                    + "    Porcentaje de incremento: %.0f%%\n"
                    + "    Incremento salarial: $%.2f\n"
                    + "    Bonificacion por antiguedad: $%.2f\n\n"
                    + "    Nuevo sueldo: $%.2f\n",
                    empleado, tipo, anios, sueldoActual, porcentaje,
                    incremento, bonificacion, nuevoSueldo);
        } else {
            System.out.println("El sueldo y los años de servicio no pueden ser negativos");
        }
    }
}
