/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema012;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author dadaa
 */
public class Problema012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
 
        int operacion;
        int val1;
        int val2;
        double resultado;
        String seleccion;
        boolean valido;
 
        System.out.println("Que operacion desea realizar\n"
                + "Ingrese 1 para sumar\n"
                + "Ingrese 2 para restar\n"
                + "Ingrese 3 para multiplicar\n"
                + "Ingrese 4 para dividir\n"
                + "Ingrese 5 para modulo\n"
                + "Ingrese 6 para potencia\n");
        operacion = entrada.nextInt();
        System.out.println("Ingrese el valor del primer numero: ");
        val1 = entrada.nextInt();
        System.out.println("Ingrese el valor del segundo numero, debe ser menor al primero: ");
        val2 = entrada.nextInt();
 
        seleccion = "Ninguna operacion";
        resultado = 0;
        valido = true;
 
        if (operacion < 1 || operacion > 6) {
            System.out.println("La opcion ingresada no es valida");
        } else if (val1 <= val2) {
            System.out.println("No es posible realizar la operacion: "
                    + "el primer numero debe ser mayor que el segundo");
        } else {
 
            if (operacion == 1) {
                seleccion = "Suma";
                resultado = val1 + val2;
            } else if (operacion == 2) {
                seleccion = "Resta";
                resultado = val1 - val2;
            } else if (operacion == 3) {
                seleccion = "Multiplicacion";
                resultado = val1 * val2;
            } else if (operacion == 4) {
                seleccion = "Division";
                if (val2 == 0) {
                    valido = false;
                } else {
                    resultado = (double) val1 / val2;
                }
            } else if (operacion == 5) {
                seleccion = "Modulo";
                if (val2 == 0) {
                    valido = false;
                } else {
                    resultado = val1 % val2;
                }
            } else {
                seleccion = "Potencia";
                resultado = Math.pow(val1, val2);
            }
 
            if (valido) {
                System.out.printf("\nOPERACIONES ARITMÉTICAS\n\n"
                        + "Primer número: %d\n"
                        + "Segundo número: %d\n"
                        + "Operación seleccionada: %s\n\n",
                        val1, val2, seleccion);
                if (operacion == 4) {
                    System.out.printf("Resultado: %.2f\n", resultado);
                } else {
                    System.out.printf("Resultado: %.0f\n", resultado);
                }
            } else {
                System.out.println("No es posible realizar la operacion: "
                        + "el segundo numero no puede ser cero");
            }
        }
    }
}
    
    

