/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase2p1;

/**
 *
 * @author rodri
 */
public class Clase2p1 {

    public static void main(String[] args) {
    int[] edades = {10,23,34,22,20};
        
    int sumaMayores = 0;
    int sumaMenores = 0;
    int cantidadMayores = 0;
    int cantidadMenores = 0;
    
    double promedioMayores = 0;
    double promedioMenores = 0;
    
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
    promedioMayores = sumaMayores / cantidadMayores;
    promedioMenores = sumaMenores / cantidadMenores;
    
    System.out.println("el promedio de las edades de los mayores es de: " + promedioMayores);
    System.out.println("el promedi de las edades de los menores es de: " + promedioMenores);
    
    
        
    }
}
