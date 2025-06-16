/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana2;

/**
 *
 * @author andre
 */
public class Semana2 {

    // Clase para Abstracción
    static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        }
    }

    // Clase para Encapsulación
    static class CuentaBancaria {
        private double saldo;

        public CuentaBancaria() {
            this.saldo = 0;
        }

        public void depositar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
            }
        }

        public double getSaldo() {
            return saldo;
        }
    }

    // Clase base para Herencia y Polimorfismo
    static class Animal {
        public void hablar() {
            System.out.println("El animal hace un sonido");
        }
    }

    static class Perro extends Animal {
        @Override
        public void hablar() {
            System.out.println("El perro ladra");
        }
    }

    static class Gato extends Animal {
        @Override
        public void hablar() {
            System.out.println("El gato maúlla");
        }
    }

    public static void main(String[] args) {
        // Ejemplo de Abstracción
        System.out.println("🧪 Abstracción:");
        Persona persona1 = new Persona("Carlos", 30);
        persona1.mostrarInfo();

        // Ejemplo de Encapsulación
        System.out.println("\n🧪 Encapsulación:");
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(100);
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        // Ejemplo de Herencia
        System.out.println("\n🧪 Herencia:");
        Animal animal = new Animal();
        animal.hablar();
        Perro perro = new Perro();
        perro.hablar();

        // Ejemplo de Polimorfismo
        System.out.println("\n🧪 Polimorfismo:");
        Animal[] animales = {new Gato(), new Perro()};
        for (Animal a : animales) {
            a.hablar();
        }
    }
}
