/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_ipc1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Natalia Ixmatul
 */
public class ApartadoDeDoctor extends JFrame implements ActionListener, FocusListener {

    private JTextField citatxt;
    private JButton aceptarbtn;
    private JButton vermasbtn;
    private JButton rechazarbtn;
    private DefaultTableModel modelo;
    private JTable tabla;

    public  ApartadoDeDoctor() {
        // Configurar el JFrame
        this.setTitle("Bienvenido Doctor House");
        setSize(900, 600);
        this.setResizable(false);
        // this.setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear los paneles que actuarán como pestañas
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);

        JPanel panel2 = new JPanel();
        panel1.setLayout(null);

//♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦
// C o n t e n i d o   P a n e l   1          
        //texto codigo
        // Campo de texto para el nombre de usuario
        citatxt = new JTextField("cita");
        citatxt.setBounds(700, 130, 150, 25);
        citatxt.addFocusListener(this);
        panel1.add(citatxt);

        // Botón de mas info
        vermasbtn = new JButton("Mas información");
        vermasbtn.setBounds(700, 150, 150, 25); //Ajuste de posición
        vermasbtn.setBackground(new Color(214, 225, 50)); // Ajuste de color de boton, con color en RGB
        vermasbtn.addActionListener(this); // Agregamos un ActionListener al botón
        panel1.add(vermasbtn);

        // Botón de aceptar
        aceptarbtn = new JButton("Aceptar");
        aceptarbtn.setBounds(700, 250, 150, 25); //Ajuste de posición
        aceptarbtn.setBackground(new Color(214, 225, 50)); // Ajuste de color de boton, con color en RGB
        aceptarbtn.addActionListener(this); // Agregamos un ActionListener al botón
        panel1.add(aceptarbtn);

        // Botón de Rechazar
        rechazarbtn = new JButton("Rechazar");
        rechazarbtn.setBounds(700, 200, 150, 25); //Ajuste de posición
        rechazarbtn.setBackground(new Color(214, 225, 50)); // Ajuste de color de boton, con color en RGB
        rechazarbtn.addActionListener(this); // Agregamos un ActionListener al botón
        panel1.add(rechazarbtn);

        //tabla
// Crear el modelo de la tabla con la columna "ID"
        String[] columnas = {"ID", "Fecha", "Hora", "Estado", "Nombre Pciente", "Código"};
        modelo = new DefaultTableModel(columnas, 0);

// Generar el ID automáticamente y agregar los datos al modelo de la tabla
        int id = 1;
        for (String[] cita : BaseDatos.citas) {
            // Verificar si el parámetro "Código" es igual al codgio que le toca a cada doctor
            if (cita[7].equals(Login.codigoobtenido)) { // Suponiendo que "Código" es el quinto parámetro en tu array de citas
                // Agregar la cita al modelo de la tabla, incluyendo el ID automáticamente generado
                String[] citaConID = new String[cita.length + 1];
                citaConID[0] = String.valueOf(id++);
                System.arraycopy(cita, 0, citaConID, 1, cita.length);
                modelo.addRow(citaConID);
            }
        }

// Crear la tabla con el modelo
        tabla = new JTable(modelo);

// Agregar la tabla a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(50, 50, 600, 400); // Establecer la ubicación y el tamaño del JScrollPane

// Agregar el JScrollPane al panel1
        panel1.add(scrollPane);

        // Crear el JTabbedPane y agregar los paneles como pestañas
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Cita", panel1);
        tabbedPane.addTab("Asignar horario", panel2);

        // Agregar el JTabbedPane al JFrame
        getContentPane().add(tabbedPane, BorderLayout.CENTER);

        // Hacer visible el JFrame
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rechazarbtn) {
            // Obtener el número de ID proporcionado por el usuario desde el JTextField
            String idModificacionStr = citatxt.getText();
            int idModificacion = Integer.parseInt(idModificacionStr);

// Verificar si el ID proporcionado por el usuario es válido
            if (idModificacion >= 1 && idModificacion <= tabla.getRowCount()) {
                // Obtener el índice de la fila correspondiente en la tabla
                int filaSeleccionada = idModificacion - 1; // Ajustar el índice para que sea 0-based

                // Modificar el parámetro "estado" del elemento correspondiente en el ArrayList cita
                String[] citaSeleccionada = BaseDatos.citas.get(filaSeleccionada);
                // Aquí debes establecer el nuevo estado, por ejemplo, desde otra entrada de texto
                String nuevoEstado = "Rechazada"; // Suponiendo que textFieldEstado es tu campo de entrada de texto para el nuevo estado
                citaSeleccionada[3] = nuevoEstado;

                // Actualizar la tabla para reflejar los cambios
                modelo.setValueAt(nuevoEstado, filaSeleccionada, 3); // Actualiza el valor en la tabla
            } else {
                // Si el ID proporcionado por el usuario no es válido, muestra un mensaje de error o realiza alguna otra acción
                JOptionPane.showMessageDialog(null, "El ID ingresado no es válido.");
            }

        } else if (e.getSource() == aceptarbtn) {
            // Obtener el número de ID proporcionado por el usuario desde el JTextField
            String idModificacionStr = citatxt.getText();
            int idModificacion = Integer.parseInt(idModificacionStr);

// Verificar si el ID proporcionado por el usuario es válido
            if (idModificacion >= 1 && idModificacion <= tabla.getRowCount()) {
                // Obtener el índice de la fila correspondiente en la tabla
                int filaSeleccionada = idModificacion - 1; // Ajustar el índice para que sea 0-based

                // Modificar el parámetro "estado" del elemento correspondiente en el ArrayList cita
                String[] citaSeleccionada = BaseDatos.citas.get(filaSeleccionada);
                // Aquí debes establecer el nuevo estado, por ejemplo, desde otra entrada de texto
                String nuevoEstado = "Aceptada"; // Suponiendo que textFieldEstado es tu campo de entrada de texto para el nuevo estado
                citaSeleccionada[3] = nuevoEstado;

                // Actualizar la tabla para reflejar los cambios
                modelo.setValueAt(nuevoEstado, filaSeleccionada, 3); // Actualiza el valor en la tabla
            } else {
                // Si el ID proporcionado por el usuario no es válido, muestra un mensaje de error o realiza alguna otra acción
                JOptionPane.showMessageDialog(null, "El ID ingresado no es válido.");
            }

        } else if (e.getSource() == vermasbtn) {

            // Obtener el número de ID proporcionado por el usuario desde el JTextField
            String idBusquedaStr = citatxt.getText();
            int idBusqueda = Integer.parseInt(idBusquedaStr);

// Verificar si el ID proporcionado por el usuario es válido
            if (idBusqueda >= 1 && idBusqueda <= BaseDatos.citas.size()) {
                // Obtener el índice de la fila correspondiente en el ArrayList citas
                int indice = idBusqueda - 1; // Ajustar el índice para que sea 0-based

                // Obtener la cita correspondiente al ID proporcionado
                String[] cita = BaseDatos.citas.get(indice);

                // Obtener el motivo de la cita
                String motivo = cita[5]; // Suponiendo que la posición 5 en la cita corresponde al motivo

                // Mostrar el motivo en un mensaje flotante
                JOptionPane.showMessageDialog(null, "Motivo: " + motivo);
            } else {
                // Si el ID proporcionado por el usuario no es válido, muestra un mensaje de error o realiza alguna otra acción
                JOptionPane.showMessageDialog(null, "El ID ingresado no es válido.");
            }

        }
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
    }

}
