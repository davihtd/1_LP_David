/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.car_register;

/**
 *
 * @author rodri
 */
public class Registration {
    public int ID;
    public String marca;
    public String modelo;
    public int anho;
    public String tipo;
    public int chasis;
    public String color;
    
    public Registration(int ID, String marca, String modelo, int anho, String tipo, int chasis, String color){
        this.ID = ID;
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.tipo = tipo;
        this.chasis = chasis;
        this.color = color;
    }
    
    public int getID(){
        return ID;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setAnho(int anho){
        this.anho = anho;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public void setChasis(int chasis){
        this.chasis = chasis;
    }
    
    public void setColor(String color){
        this.color = color;
    }

    
    public void showinfo(){
                System.out.println("ID: " + ID + " MARCA: " + marca + " MODELO: " + modelo + " ANHO: " + anho + " TIPO: " + tipo + " CHASIS: " + chasis + " COLOR: " + color);        

    }
}
