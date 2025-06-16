/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author andre
 */
import java.util.ArrayList;
import java.util.Scanner;

// Clase para representar la temperatura diaria
class ClimaDiario {
    private double temperatura;

    public ClimaDiario(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }
}

// Clase que representa la semana climática
class SemanaClimatica {
    private ArrayList<ClimaDiario> dias;

    public SemanaClimatica() {
        dias = new ArrayList<>();
    }

    public void agregarTemperatura(double temperatura) {
        dias.add(new ClimaDiario(temperatura));
    }

    public double calcularPromedio() {
        double suma = 0;
        for (ClimaDiario dia : dias) {
            suma += dia.getTemperatura();
        }
        return suma / dias.size();
    }
}

public class Semana3POO {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SemanaClimatica semana = new SemanaClimatica();

        System.out.println("== Promedio Semanal del Clima (POO) ==");

        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese la temperatura del día " + (i + 1) + ": ");
            double temp = sc.nextDouble();
            semana.agregarTemperatura(temp);
        }

        double promedio = semana.calcularPromedio();
        System.out.printf("El promedio semanal de temperatura es: %.2f°C%n", promedio);
    }  
}
