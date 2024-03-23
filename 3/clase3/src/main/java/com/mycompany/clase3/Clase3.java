/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase3;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Clase3 {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    int[] edades = new int[5];
        
    int sumaMayores = 0;
    int sumaMenores = 0;
    int cantidadMayores = 0;
    int cantidadMenores = 0;
    
        
        for(int i = 0; i < edades.length; ++i){
            try {
                System.out.println("ingrese la edad de la persona " + (i + 1) + ": ");
                edades[i] = scanner.nextInt();
            } catch (Exception e){
                System.out.println("Error: debe ingresar un numero entero. Intentelo de nuevo. " + e);
                scanner.nextLine();
                i--;
            }
        }
        
        
        for(int i =0; i < edades.length; ++i){
            switch(edades[i] >= 18 ?1 :0){
                case 1:
                    sumaMayores += edades[i];
                    cantidadMayores++;
                    break;
                default:
                    sumaMenores += edades[i];
                    cantidadMenores++;
                    break;
        }
    }
    

            double promedioMayores = cantidadMayores != 0 ? (double) sumaMayores / cantidadMayores : 0;
            double promedioMenores = cantidadMenores != 0 ? (double) sumaMenores / cantidadMenores : 0;
   
    
    
    System.out.println("el promedio de las edades de los mayores es de: " + promedioMayores);
    System.out.println("el promedi de las edades de los menores es de: " + promedioMenores);
    System.out.println("Ingrese una edad para buscar: ");
    
    int buscarEdad = scanner.nextInt();
    boolean encontrado = false;
    int cantidadEncuentros = 0;
    
    for(int i = 0; i < edades.length; ++i){
        if (edades[i] == buscarEdad){
            cantidadEncuentros++;
            encontrado = true;
        } 
     }
    if(!encontrado){
        System.out.println("no fue encontrado el valor");
    } else{
        
            System.out.println("la edad: " + buscarEdad+ " fue encontrada " + cantidadEncuentros + " :DDD");
    }
    
    }
}