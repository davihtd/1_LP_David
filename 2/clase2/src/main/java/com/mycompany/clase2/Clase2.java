/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase2;

/**
 *
 * @author rodri
 */
public class Clase2 {

    public static void main(String[] args) {
    int edad1 = 10;
    int edad2 = 20;
    int edad3 = 30;
    int edad4 = 39; 
    
    
    int sumaMayores = 0;
    int sumaMenores = 0;
    int cantidadMayores = 0;
    int cantidadMenores = 0;
    
    double promedioMayores = 0;
    double promedioMenores = 0;
    
    switch(edad1 >=18 ?1 :0){
        case 1:
            sumaMayores += edad1;
            cantidadMayores++;
            break;
        default:
            sumaMenores += edad1;
            cantidadMenores++;
            break;
    }
    switch(edad2 >=18 ?1 :0){
        case 1:
            sumaMayores += edad2;
            cantidadMayores++;
            break;
        default:
            sumaMenores += edad2;
            cantidadMenores++;
            break;
    }
    switch(edad3 >=18 ?1 :0){
        case 1:
            sumaMayores += edad3;
            cantidadMayores++;
            break;
        default:
            sumaMenores += edad3;
            cantidadMenores++;
            break;
    }
    switch(edad4 >=18 ?1 :0){
        case 1:
            sumaMayores += edad4;
            cantidadMayores++;
            break;
        default:
            sumaMenores += edad4;
            cantidadMenores++;
            break;
    }
    
    promedioMayores = sumaMayores / cantidadMayores;
    promedioMenores = sumaMenores / cantidadMenores;
    
    System.out.println("el promedio de las edades de los mayores es de: " + promedioMayores);
    System.out.println("el promedi de las edades de los menores es de: " + promedioMenores);
    }
}
