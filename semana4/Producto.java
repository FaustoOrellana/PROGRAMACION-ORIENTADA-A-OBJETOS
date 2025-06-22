/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana4;

/**
 *
 * @author andre
 */
public class Producto {
    String nombre;
    double precio;

    // Constructor para crear un producto
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para mostrar la información del producto
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " - Precio: $" + precio);
    }    
}
