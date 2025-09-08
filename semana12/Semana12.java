/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana12;

public class Semana12 {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.registrarUsuario(new Usuario("U1", "Ana"));
        biblioteca.registrarUsuario(new Usuario("U2", "Luis"));

        biblioteca.añadirLibro(new Libro("ISBN-001", "Clean Code", "Robert C. Martin", "Software"));
        biblioteca.añadirLibro(new Libro("ISBN-002", "Effective Java", "Joshua Bloch", "Java"));

        biblioteca.prestarLibro("U1", "ISBN-001");
        biblioteca.prestarLibro("U2", "ISBN-002");

        System.out.println("Libros prestados a U1: " + biblioteca.listarPrestados("U1"));

        biblioteca.devolverLibro("U1", "ISBN-001");

        System.out.println("Buscar por autor 'Bloch': " + biblioteca.buscarPorAutor("Bloch"));
        System.out.println("Buscar por categoría 'Software': " + biblioteca.buscarPorCategoria("Software"));
    }
}
