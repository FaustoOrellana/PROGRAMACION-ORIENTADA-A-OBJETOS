/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana4;

/**
 *
 * @author andre
 */
public class Tienda {
    Producto producto1;
    Producto producto2;

    // Constructor: Se crean productos al iniciar la tienda
    public Tienda() {
        producto1 = new Producto("Pan", 0.50);
        producto2 = new Producto("Leche", 1.20);
    }

    // Método para mostrar los productos disponibles en la tienda
    public void mostrarProductos() {
        System.out.println("Productos disponibles:");
        producto1.mostrarProducto();
        producto2.mostrarProducto();
    }    
}
