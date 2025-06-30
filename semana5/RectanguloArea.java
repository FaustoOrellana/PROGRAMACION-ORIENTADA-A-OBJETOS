/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana5;

/**
 *
 * @author andre
 */
public class RectanguloArea {
    // Diferentes tipos de datos
    int id_rectangulo;        // entero (int)
    float ancho;              // decimal (float)
    float largo;              // decimal (float)
    String nombre_rectangulo; // texto (String)
    boolean es_grande;        // verdadero o falso (boolean)

    // Método para calcular el área
    public float calcular_area() {
        return ancho * largo;
    }

    // Método para verificar si el área es mayor a una referencia
    public void verificar_tamano() {
        float area = calcular_area();
        if (area > 20) {
            es_grande = true;
        } else {
            es_grande = false;
        }
    }
}
