/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea_3_david_rodriguez;

/**
 *
 * @author rodri
 */

import java.util.Scanner;

public class Tarea_3_David_Rodriguez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas en el grupo:");
        int cantidadPersonas = scanner.nextInt();
        int[] edades = new int[cantidadPersonas];

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
            edades[i] = scanner.nextInt();
        }

        CalculadoraEdades calculadora = new CalculadoraEdades(edades);

        double promedioMayores = calculadora.calcularPromedioMayoresEdad();
        double promedioMenores = calculadora.calcularPromedioMenoresEdad();

        System.out.println("El promedio de edades de los mayores de edad es: " + promedioMayores);
        System.out.println("El promedio de edades de los menores de edad es: " + promedioMenores);

        scanner.close();
    }
}
