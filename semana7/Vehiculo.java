/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana7;

/**
 *
 * @author andre
 */
public class Vehiculo {
    // Atributos
    String marca;
    String modelo;
    int año; 
    
    // Constructor por defecto
    public Vehiculo() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.año = 0;
    }

    // Constructor parametrizado (marca, modelo, año)
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Sobrecarga del constructor (solo marca y modelo, el año es por defecto 2024)
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = 2024;
    }

    // Método para mostrar la información del vehículo
    public void mostrar() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }
}
