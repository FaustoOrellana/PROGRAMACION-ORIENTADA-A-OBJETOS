/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana6;

/**
 *
 * @author andre
 */
public class Persona {

    // Encapsulación: atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters para acceder a los atributos privados
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Método que será sobrescrito (polimorfismo)
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}


