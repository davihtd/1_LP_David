/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase3_p2;

/**
 *
 * @author rodri
 */
import java.util.Scanner;

public class Clase3_p2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("ingrese el momento del dia ");
        System.out.println("1- Manhana");
        System.out.println("2- Tardre");
        System.out.println("3- Noche");
        
        int dayMoment = scanner.nextInt();
        
        System.out.println("ingrese la temperatura: ");
        int temp = scanner.nextInt();
        
        int temp_B_M = 15;
        int temp_N_M = 20;
        int temp_P_M = 30;
        
        if(dayMoment == 1){
            if(temp <= temp_B_M){
                System.out.println("La temparatura de " + temp +" Grados Centigrados es muy buena");
            } if(temp >= temp_B_M && temp < temp_P_M){
                System.out.println("La temparatura de" +temp+ " es normal");
            } if(temp >= temp_P_M){
                System.out.println("La temparatura de" +temp+ " es peligrosa");
            }
        }
        
        int temp_B_T = 20;
        int temp_N_T = 25;
        int temp_P_T = 40; 
        
        if(dayMoment == 2){
            if(temp <= temp_B_T){
                System.out.println("La temparatura de " + temp +" Grados Centigrados es muy buena");
            } if(temp >= temp_B_T && temp < temp_P_T){
                System.out.println("La temparatura de" +temp+ " es normal");
            } if(temp >= temp_P_T){
                System.out.println("La temparatura de" +temp+ " es peligrosa");
            }
        }   
        int temp_B_N = 5;
        int temp_N_N = 10;
        int temp_P_N = 15; 
        
        if(dayMoment == 3){
            if(temp <= temp_B_N){
                System.out.println("La temparatura de " + temp +" Grados Centigrados es muy buena");
            } if(temp >= temp_B_N && temp < temp_P_N){
                System.out.println("La temparatura de" +temp+ " es normal");
            } if(temp >= temp_P_N){
                System.out.println("La temparatura de" +temp+ " es peligrosa");
            }
        } 
   
    }
}
