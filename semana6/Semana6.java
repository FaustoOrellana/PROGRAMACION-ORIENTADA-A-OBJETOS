/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana6;

/**
 *
 * @author andre
 */
public class Semana6 {

    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", 35);
        persona.mostrarInformacion();
    
    System.out.println();

        // Crear objeto de la clase derivada Estudiante
        Estudiante estudiante = new Estudiante("Ana", 20, "Ingeniería");
        estudiante.mostrarInformacion(); // Polimorfismo: método sobrescrito
    }
}
