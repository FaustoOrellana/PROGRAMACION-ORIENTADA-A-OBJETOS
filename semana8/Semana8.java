/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana8;

/**
 *
 * @author andre
 */
public class Semana8 {

    public static void main(String[] args) {
        GestorProductos gestor = new GestorProductos();
        Vista vista = new Vista();

        vista.mostrarEncabezado("Lista de Productos");
        gestor.producto1.mostrarInformacion();
        gestor.producto2.mostrarInformacion();
        vista.mostrarSeparador();
        vista.mostrarDespedida();
    }
}
