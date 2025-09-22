/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.s14;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author andre
 */
public class S14 {

    public static void main(String[] args) {
// Crear la ventana principal
        JFrame ventana = new JFrame("Agenda Personal");
        ventana.setSize(500, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        // --- Panel de entrada ---
        JPanel panelEntrada = new JPanel(new GridLayout(3, 2));

        panelEntrada.add(new JLabel("Fecha:"));
        JSpinner spFecha = new JSpinner(new SpinnerDateModel());
        spFecha.setEditor(new JSpinner.DateEditor(spFecha, "dd/MM/yyyy"));
        panelEntrada.add(spFecha);

        panelEntrada.add(new JLabel("Hora:"));
        JSpinner spHora = new JSpinner(new SpinnerDateModel());
        spHora.setEditor(new JSpinner.DateEditor(spHora, "HH:mm"));
        panelEntrada.add(spHora);

        panelEntrada.add(new JLabel("Descripción:"));
        JTextField txtDescripcion = new JTextField();
        panelEntrada.add(txtDescripcion);

        ventana.add(panelEntrada, BorderLayout.NORTH);

        // --- Tabla ---
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Fecha", "Hora", "Descripción"}, 0);
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        ventana.add(scroll, BorderLayout.CENTER);

        // --- Panel de botones ---
        JPanel panelBotones = new JPanel();
        JButton btnAgregar = new JButton("Agregar");
        JButton btnEliminar = new JButton("Eliminar");

        ventana.add(panelBotones, BorderLayout.SOUTH);
        JButton btnSalir = new JButton("Salir");
        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnSalir);

        // --- Eventos ---
        btnAgregar.addActionListener(e -> {
            String desc = txtDescripcion.getText().trim();
            if (desc.isEmpty()) {
                JOptionPane.showMessageDialog(ventana, "La descripción no puede estar vacía");
                return;
            }
            Date fecha = (Date) spFecha.getValue();
            Date hora = (Date) spHora.getValue();

            String f = new SimpleDateFormat("dd/MM/yyyy").format(fecha);
            String h = new SimpleDateFormat("HH:mm").format(hora);

            modelo.addRow(new Object[]{f, h, desc});
            txtDescripcion.setText("");
            txtDescripcion.requestFocus();
        });

        btnEliminar.addActionListener(e -> {
            int fila = tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(ventana, "Selecciona un evento primero");
                return;
            }
            int opcion = JOptionPane.showConfirmDialog(ventana, "¿Eliminar el evento?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                modelo.removeRow(fila);
            }
        });

        btnSalir.addActionListener(e -> ventana.dispose());

        // --- Mostrar ventana ---
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
