/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Semana13 {

    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {

            // Ventana principal
            JFrame f = new JFrame("Lista de Datos");
            f.setLayout(new BorderLayout(10,10));

            // Panel superior (entrada + botones)
            JPanel p = new JPanel(new FlowLayout());
            JLabel lTexto = new JLabel("Escribe algo:");
            JTextField tTexto = new JTextField(15);
            JButton bAgregar = new JButton("Agregar");
            JButton bLimpiar = new JButton("Limpiar");

            p.add(lTexto);
            p.add(tTexto);
            p.add(bAgregar);
            p.add(bLimpiar);

            // Lista para mostrar datos
            DefaultListModel<String> modelo = new DefaultListModel<>();
            JList<String> lista = new JList<>(modelo);
            JScrollPane scroll = new JScrollPane(lista);

            // Acción botón Agregar
            bAgregar.addActionListener(e -> {
                String texto = tTexto.getText().trim();
                if (!texto.isEmpty()) {
                    modelo.addElement(texto);
                    tTexto.setText("");
                } else {
                    JOptionPane.showMessageDialog(f,
                        "No puedes agregar vacío",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
                }
            });

            // Acción botón Limpiar
            bLimpiar.addActionListener(e -> {
                modelo.clear();
                tTexto.setText("");
            });

            // Agregar al frame
            f.add(p, BorderLayout.NORTH);
            f.add(scroll, BorderLayout.CENTER);

            // Configuración ventana
            f.setSize(450, 250);
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        });
    }
}