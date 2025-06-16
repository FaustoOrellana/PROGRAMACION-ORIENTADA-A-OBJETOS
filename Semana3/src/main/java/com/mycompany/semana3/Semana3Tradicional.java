/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author andre
 */
import java.util.Scanner;
public class Semana3Tradicional {
// Función para ingresar temperaturas
    public static double[] ingresarTemperaturas() {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese la temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
        }
        return temperaturas;
    }

    // Función para calcular el promedio
    public static double calcularPromedio(double[] temperaturas) {
        double suma = 0;
        for (double temp : temperaturas) {
            suma += temp;
        }
        return suma / temperaturas.length;
    }

    // Función principal
    public static void main(String[] args) {
        System.out.println("== Promedio Semanal del Clima (Programación Tradicional) ==");
        double[] temperaturas = ingresarTemperaturas();
        double promedio = calcularPromedio(temperaturas);
        System.out.printf("El promedio semanal de temperatura es: %.2f°C%n", promedio);
    }    
}
