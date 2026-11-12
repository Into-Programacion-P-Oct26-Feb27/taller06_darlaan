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
     int resultado = 0;
         System.out.println("Que operacion desea realizar"
             + "Ingrese 1 para sumar\n"
             + "Ingrese 2 para restar\n"
             + "Ingrese 3 para multiplicar\n"
             + "Ingrese 4 para dividir\n"
             + "Ingrese 5 para modulo\n"
             + "Ingrese 6 para potencia\n");
     operacion = entrada.nextInt();
     
    System.out.println("Ingrese el valor del primer termino: ");
         val1 = entrada.nextInt();
     System.out.println("Ingrese valor del segundo termino: ");
         val2 = entrada.nextInt();
         
         if (val1 > val2){
             switch (operacion){
                  
             case 1:
             resultado = val1 + val2;
             
             break;
             
             case 2:
                 resultado = val1 - val2;
                 break;
             case 3:
             resultado = val1 * val2;
             break;
             
             case 4:
             resultado = val1 / val2;
             break;
             
             case 5:
                 resultado = val1 % val2;
                 break;
                 
             case 6: 
                 resultado = Math.powExact(val1, val2);
             break;
             
             default:
                 System.out.println("Operacion invalida");
                 break;
             } 
         
             }else{
             System.out.println("La operacion no puede ser realizada");
             
                 }
         
         System.out.printf("El resultado de la operación es : %d\n", resultado);
}
}


