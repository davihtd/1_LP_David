/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_3_david_rodriguez;

/**
 *
 * @author rodri
 */
public class CalculadoraEdades {
    private int[] edades;

    public CalculadoraEdades(int[] edades) {
        this.edades = edades;
    }

    public double calcularPromedioMayoresEdad() {
        int suma = 0;
        int contador = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                suma += edad;
                contador++;
            }
        }
        return contador == 0 ? 0 : (double) suma / contador;
    }

    public double calcularPromedioMenoresEdad() {
        int suma = 0;
        int contador = 0;
        for (int edad : edades) {
            if (edad < 18) {
                suma += edad;
                contador++;
            }
        }
        return contador == 0 ? 0 : (double) suma / contador;
    }
    
}
