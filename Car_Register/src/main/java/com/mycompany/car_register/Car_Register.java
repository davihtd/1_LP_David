/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.car_register;

/**
 *
 * @author rodri
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Car_Register {

    public static void main(String[] args) {
        ArrayList<Registration> registered = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int share = 0;
        boolean encontrado = false;

        do {
            try{
            System.out.println("Bienvenido al Registrador de Automoviles");
            System.out.println("1. Crear Registro");
            System.out.println("2. Buscar Registro");
            System.out.println("3. Editar Registro");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            } catch(Exception e){
                System.out.println("Error: Datos ingresados incorrectos. Por favor, vuelva a intentarlo.");
                scanner.nextLine(); // Limpiar el buffer del scanner                
            }

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese los datos del Vehiculo:");
                    try {
                        System.out.println("Ingrese el ID: ");
                        int ID = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Ingrese la MARCA del vehiculo: ");
                        String marca = scanner.nextLine();

                        System.out.println("Ingrese el MODELO del vehiculo ");
                        String modelo = scanner.nextLine();

                        System.out.println("Ingrese el ANHO del vehiculo ");
                        int anho = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Ingrese el TIPO de vehiculo ");
                        String tipo = scanner.nextLine();

                        System.out.println("Ingrese el CHASIS del vehiculo ");
                        int chasis = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Ingrese el COLOR de su vehiculo ");
                        String color = scanner.nextLine();

                        registered.add(new Registration(ID, marca, modelo, anho, tipo, chasis, color));
                    } catch (Exception e) {
                        System.out.println("Error: Datos ingresados incorrectos. Por favor, vuelva a intentarlo.");
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("Ingrese su ID para BUSCAR los datos de del vehiculo:");
                    try{
                    share = scanner.nextInt();

                    for (Registration registration : registered) {
                        if (share == registration.getID()) {
                            System.out.println("Su vehiculo es el siguiente: ");
                            encontrado = true;
                            registration.showinfo();
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No fue encontrado...");
                    }} catch(Exception e){
                        System.out.println("Error: Datos ingresados incorrectos. Por favor, vuelva a intentarlo.");
                        scanner.nextLine();                        
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el ID del para EDITAR los datos del vehiculo:");
                    try{
                    share = scanner.nextInt();
                    } catch(Exception e){
                        System.out.println("Error: Datos ingresados incorrectos. Por favor, vuelva a intentarlo.");
                        scanner.nextLine(); 
                    }
                    for (Registration registration : registered) {
                        if (share == registration.getID()) {
                            try {
                                System.out.println("Nueva MARCA ");
                                String nuevaMarca = scanner.nextLine();
                                scanner.nextLine(); 
                                registration.setMarca(nuevaMarca);

                                System.out.println("Nuevo MODELO ");
                                String nuevoModelo = scanner.nextLine();
                                registration.setModelo(nuevoModelo);

                                System.out.println("Nuevo ANHO ");
                                int nuevoAnho = scanner.nextInt();
                                scanner.nextLine();
                                registration.setAnho(nuevoAnho);

                                System.out.println("Nuevo TIPO ");
                                String nuevoTipo = scanner.nextLine();
                                registration.setTipo(nuevoTipo);

                                System.out.println("Nuevo CHASIS ");
                                int nuevoChasis = scanner.nextInt();
                                scanner.nextLine();
                                registration.setChasis(nuevoChasis);

                                System.out.println("Nuevo COLOR ");
                                String nuevoColor = scanner.nextLine();
                                registration.setColor(nuevoColor);

                                encontrado = true;
                            } catch (Exception e) {
                                System.out.println("Error: Datos ingresados incorrectos. Por favor, vuelva a intentarlo.");
                                scanner.nextLine(); // Limpiar el buffer del scanner
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No fue encontrado...");
                    }
                    break;

                case 4:
                    opcion = 4;
                    break;
                default:

                    System.out.println("Opcion no valida. Por favor, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 4);
        scanner.close();
    }
}

