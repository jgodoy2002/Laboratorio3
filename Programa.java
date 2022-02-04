/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio3;

import java.util.Scanner;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author jcgof
 */
public class Programa {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        while (temp != 10) {
            System.out.println("************************************************");
            System.out.println("1) Imprimir numero hasta el numero deseado\n"
                    + "2) Imprimir el mismo numero varias veces\n"
                    + "3) Encontrar con el metodo UP la suma de un numero\n"
                    + "4) Encontrar con el metodo DOWN la suma de un numero\n"
                    + "5) Se calcula la potencia de un numero con el metodo UP\n"
                    + "6) Se calcula la potencia de un numero con el metodo DOWN\n"
                    + "7) Dice si una palabra es Palindromo\n"
                    + "8) Imprimir una piramide en un numero de filas\n"
                    + "9) Ejecutar estructura Fibonacci\n"
                    + "10) Salir");
            System.out.println("***********************************************");
            System.out.println("Ingrese la eleccion que desea");
            temp = sc.nextInt();
            System.out.println("***************");
            switch (temp) {
            }
        }
    }
}
