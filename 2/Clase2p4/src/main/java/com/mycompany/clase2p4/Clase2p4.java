/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase2p4;

/**
 *
 * @author rodri
 */
import java.util.Scanner;
public class Clase2p4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        int[] edades = new int[size];
        for(int i = 0; i < edades.length; ++i){
            System.out.println("ingrese  la edad" + (i + 1));
            edades[i] = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();
    }
}
