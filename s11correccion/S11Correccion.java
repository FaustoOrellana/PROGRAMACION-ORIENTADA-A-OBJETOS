/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.s11correccion;
import java.util.*;

public class S11Correccion {

    public static void main(String[] args) {
// LISTA de nombres
        List<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Ana");

        //  Corrección: usar un índice válido (0,1,2) o validar con size()
        System.out.println("Elemento en posición 2: " + nombres.get(2));

        //  Corrección: usar equals() en lugar de ==
        String buscado = new String("Ana");
        if (buscado.equals("Ana")) {
            System.out.println("Encontrado");
        }

        // MAPA de teléfonos
        Map<String, String> telefonos = new HashMap<>();

        telefonos.put("Ana", "0991111111");
        telefonos.put("Luis", "0992222222");
        telefonos.put("Ana", "0993333333"); // ✔ sobrescribe porque la clave es la misma

        //  Corrección: validar antes de usar .toString()
        String telefonoBea = telefonos.get("Bea");
        if (telefonoBea != null) {
            System.out.println("Bea: " + telefonoBea);
        } else {
            System.out.println("Bea no está en la agenda.");
        }

        // SET de inscritos
        Set<Alumno> inscritos = new HashSet<>();

        inscritos.add(new Alumno(1, "Ana"));
        inscritos.add(new Alumno(2, "Luis"));
        inscritos.add(new Alumno(1, "Ana")); // ✔ ahora no se duplicará porque equals/hashCode están implementados

        System.out.println("Tamaño del Set: " + inscritos.size());
        System.out.println(inscritos);
    }
}

class Alumno {
    int id;
    String nombre;

    Alumno(int id, String nombre) { 
        this.id = id; 
        this.nombre = nombre; 
    }

    //  Sobrescribir equals para comparar objetos Alumno
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return id == alumno.id && Objects.equals(nombre, alumno.nombre);
    }

    //  Sobrescribir hashCode junto con equals
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    //  Sobrescribir toString para mostrar datos legibles
    public String toString() {
        return "Alumno{id=" + id + ", nombre='" + nombre + "'}";
    }
}
