/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana16;

import javax.swing.*;
import java.awt.event.*;

public class Semana16 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Captura Tecla C");

        // Lista con algunos elementos
        String[] datos = {"Elemento 1", "Elemento 2", "Elemento 3"};
        JList<String> lista = new JList<>(datos);
        JScrollPane scroll = new JScrollPane(lista);

        // Listener para detectar tecla C
        lista.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_C) {
                    int index = lista.getSelectedIndex();
                    if (index != -1) {
                        JOptionPane.showMessageDialog(frame,
                                "Tecla C detectada sobre: " + lista.getSelectedValue());
                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "Tecla C detectada, pero no hay elemento seleccionado.");
                    }
                }
            }
        });

        frame.add(scroll);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}