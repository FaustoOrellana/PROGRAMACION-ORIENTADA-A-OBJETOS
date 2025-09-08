/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana12;
import java.util.*;

class Biblioteca {
    private Map<String, Libro> catalogoPorIsbn;
    private Map<String, Usuario> usuariosPorId;
    private Set<String> isbnsPrestados;

    public Biblioteca() {
        catalogoPorIsbn = new HashMap<>();
        usuariosPorId = new HashMap<>();
        isbnsPrestados = new HashSet<>();
    }

    // --- Funcionalidades ---
    public void añadirLibro(Libro libro) {
        catalogoPorIsbn.put(libro.getIsbn(), libro);
    }

    public void quitarLibro(String isbn) {
        catalogoPorIsbn.remove(isbn);
    }

    public void registrarUsuario(Usuario u) {
        usuariosPorId.put(u.getId(), u);
    }

    public void darBajaUsuario(String id) {
        usuariosPorId.remove(id);
    }

    public void prestarLibro(String idUsuario, String isbn) {
        Usuario u = usuariosPorId.get(idUsuario);
        if (u != null && catalogoPorIsbn.containsKey(isbn) && !isbnsPrestados.contains(isbn)) {
            u.getIsbnsPrestados().add(isbn);
            isbnsPrestados.add(isbn);
        }
    }

    public void devolverLibro(String idUsuario, String isbn) {
        Usuario u = usuariosPorId.get(idUsuario);
        if (u != null && u.getIsbnsPrestados().contains(isbn)) {
            u.getIsbnsPrestados().remove(isbn);
            isbnsPrestados.remove(isbn);
        }
    }

    public List<Libro> buscarPorTitulo(String texto) {
        List<Libro> encontrados = new ArrayList<>();
        for (Libro l : catalogoPorIsbn.values()) {
            if (l.getTitulo().toLowerCase().contains(texto.toLowerCase())) {
                encontrados.add(l);
            }
        }
        return encontrados;
    }

    public List<Libro> buscarPorAutor(String texto) {
        List<Libro> encontrados = new ArrayList<>();
        for (Libro l : catalogoPorIsbn.values()) {
            if (l.getAutor().toLowerCase().contains(texto.toLowerCase())) {
                encontrados.add(l);
            }
        }
        return encontrados;
    }

    public List<Libro> buscarPorCategoria(String texto) {
        List<Libro> encontrados = new ArrayList<>();
        for (Libro l : catalogoPorIsbn.values()) {
            if (l.getCategoria().toLowerCase().contains(texto.toLowerCase())) {
                encontrados.add(l);
            }
        }
        return encontrados;
    }

    public List<Libro> listarPrestados(String idUsuario) {
        List<Libro> result = new ArrayList<>();
        Usuario u = usuariosPorId.get(idUsuario);
        if (u != null) {
            for (String isbn : u.getIsbnsPrestados()) {
                result.add(catalogoPorIsbn.get(isbn));
            }
        }
        return result;
    }
}
