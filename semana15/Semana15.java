/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author andre
 */
public class Semana15 extends JFrame {
    private DefaultListModel<String> modelo;
    private JList<String> lista;
    private JTextField campo;

    public Semana15() {
        super("Lista de Tareas");
        setLayout(new BorderLayout());

        // Modelo y lista
        modelo = new DefaultListModel<>();
        lista = new JList<>(modelo);
        JScrollPane scroll = new JScrollPane(lista);

        // Campo de texto
        campo = new JTextField();
        campo.addActionListener(e -> agregarTarea()); // ENTER agrega tarea

        // Botones
        JButton btnAgregar = new JButton("Añadir Tarea");
        JButton btnCompletar = new JButton("Marcar como Completada");
        JButton btnEliminar = new JButton("Eliminar Tarea");

        btnAgregar.addActionListener(e -> agregarTarea());
        btnCompletar.addActionListener(e -> completarTarea());
        btnEliminar.addActionListener(e -> eliminarTarea());

        // Panel de botones
        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(btnAgregar);
        panelBotones.add(btnCompletar);
        panelBotones.add(btnEliminar);

        // Armar ventana
        add(campo, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void agregarTarea() {
        String texto = campo.getText().trim();
        if (!texto.isEmpty()) {
            modelo.addElement(texto);
            campo.setText("");
        }
    }

    private void completarTarea() {
        int i = lista.getSelectedIndex();
        if (i != -1) {
            String t = modelo.get(i);
            if (!t.startsWith("[✔] ")) {
                modelo.set(i, "[✔] " + t);
            } else {
                modelo.set(i, t.replace("[✔] ", "")); // desmarcar
            }
        }
    }

    private void eliminarTarea() {
        int i = lista.getSelectedIndex();
        if (i != -1) {
            modelo.remove(i);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Semana15().setVisible(true));
    }
}

