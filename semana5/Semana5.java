/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana5;

/**
 *
 * @author andre
 */
public class Semana5 {

    public static void main(String[] args) {
    // Crear objeto con nombre area_rectangulo
        RectanguloArea area_rectangulo = new RectanguloArea();
// Asignar valores directamente
        area_rectangulo.id_rectangulo = 1;              // int
        area_rectangulo.ancho = 5.0f;                   // float
        area_rectangulo.largo = 3.0f;                   // float
        area_rectangulo.nombre_rectangulo = "Rectángulo Principal"; // String

        // Calcular área
        float area = area_rectangulo.calcular_area();

        // Verificar si el área es grande (boolean)
        area_rectangulo.verificar_tamano();

        // Mostrar resultados
        System.out.println("ID: " + area_rectangulo.id_rectangulo);
        System.out.println("Nombre: " + area_rectangulo.nombre_rectangulo);
        System.out.println("El ancho es: " + area_rectangulo.ancho);
        System.out.println("El largo es: " + area_rectangulo.largo);
        System.out.println("El área del rectángulo es: " + area);

        if (area_rectangulo.es_grande) {
            System.out.println("El rectángulo es grande.");
        } else {
            System.out.println("El rectángulo es pequeño.");
        }
    }
}
