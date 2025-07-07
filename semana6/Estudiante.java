/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana6;

/**
 *
 * @author andre
 */

public class Estudiante extends Persona {
    private String carrera;

    // Constructor
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad); // Herencia: llama al constructor de la clase base
        this.carrera = carrera;
    }

    // Getter para carrera
    public String getCarrera() {
        return carrera;
    }

    // Sobrescritura del método mostrarInformacion (polimorfismo)
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Carrera: " + carrera);
    }
}


