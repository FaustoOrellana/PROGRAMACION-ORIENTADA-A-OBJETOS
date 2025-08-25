/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana10;
import java.io.IOException;
import java.nio.file.*;

// Acceso directo al archivo (DAO)
class ArchivoDAO {
    String leer(String ruta) throws IOException {
        // Usa Files.readString para leer todo el contenido del archivo como texto
        return Files.readString(Path.of(ruta));
    }
}

// Lógica de negocio que usa el DAO (Service)
class ArchivoService {
    private final ArchivoDAO dao = new ArchivoDAO();

    String cargarConfig(String ruta) throws IOException {
        // Propaga IOException si ocurre
        return dao.leer(ruta);
    }
}


public class Semana10 {

    public static void main(String[] args) {
      try {
            // Intentamos leer la configuración
            String cfg = new ArchivoService().cargarConfig("config/app.cfg");
            System.out.println("Contenido del archivo:\n" + cfg);
        } catch (IOException e) {
            // Capturamos errores de lectura/escritura y avisamos al usuario
            System.err.println("No se pudo cargar configuración: " + e.getMessage());
        }
    }
}
