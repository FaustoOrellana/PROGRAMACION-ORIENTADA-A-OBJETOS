/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana7;

/**
 *
 * @author andre
 */
public class Semana7 {

    public static void main(String[] args) {
        // Vehículo con constructor por defecto
        Vehiculo v1 = new Vehiculo();
        v1.mostrar();

        // Vehículo con constructor completo
        Vehiculo v2 = new Vehiculo("Toyota", "Corolla", 2022);
        v2.mostrar();

        // Vehículo con constructor sobrecargado (marca y modelo)
        Vehiculo v3 = new Vehiculo("Chevrolet", "Spark");
        v3.mostrar();
    }
}
