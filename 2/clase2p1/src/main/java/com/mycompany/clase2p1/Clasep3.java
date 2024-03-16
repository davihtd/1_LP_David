/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase2p1;

/**
 *
 * @author rodri
 */
import java.util.Scanner;

public class Clasep3 {
    public static void main(String[] args) {
    //crear un objeto scanner para poder ingresar los datos
    Scanner scanner = new Scanner(System.in);
    
    //solisitar al usario que ingrese datos
    System.out.println("ingrese su nombre");
    
    String nombre = scanner.nextLine();
    
    System.out.println("ingrese su apellido");
    
    String apellido = scanner.nextLine();
    scanner.close();
    
    System.out.println("Su nombre es: " + nombre + " y su apellido es: " + apellido);
    

}
}
