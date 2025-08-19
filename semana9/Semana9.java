/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana9;
import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException;
/**
 *
 * @author andre
 */
public class Semana9 {

    public static void main(String[] args) {
        GestorDeArchivo gestor = new GestorDeArchivo();
        ValidarArchivo validador = new ValidarArchivo();

        String archivo = "ejemplo.txt";
        String contenido = "Hola, este es la organización de un proyecto en POO";

        try {
            // 1. Guardar contenido en el archivo
            gestor.guardar(archivo, contenido);

            // 2. Leer contenido del archivo
            String leido = gestor.leer(archivo);
            System.out.println("Contenido leído:\n" + leido);

            // 3. Verificar que el archivo no esté vacío
            validador.verificarNoVacio(archivo);
            System.out.println("El archivo no está vacío ");

        } catch (ArchivoVacioException e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
