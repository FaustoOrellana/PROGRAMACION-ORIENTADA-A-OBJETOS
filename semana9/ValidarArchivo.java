/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana9;
import java.io.*;

/**
 *
 * @author andre
 */
public class ValidarArchivo {
    public void verificarNoVacio(String nombreArchivo) throws ArchivoVacioException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            if (reader.readLine() == null) { // si no tiene ninguna línea
                throw new ArchivoVacioException("El archivo está vacío.");
            }
        } catch (IOException e) {
            System.out.println("Error al verificar: " + e.getMessage());
        }
    }
}
