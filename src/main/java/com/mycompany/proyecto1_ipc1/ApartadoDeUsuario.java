/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_ipc1;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import com.mycompany.proyecto1_ipc1.RegistroDelPaciente.codigo;

/**
 *
 * @author Natalia Ixmatul
 */
public class ApartadoDeUsuario extends JFrame implements ActionListener, FocusListener {
    private String  especselected;
    private String codigorelacionado;
    // B o  t o n   u  n i v e r s a l
    private JButton editarperfilbtn;
    private JButton regresarbtn;
    // ◘-◘ E l e m e n t o s   d e   S O L I C I T A R   C I T A   ◘-◘ 
    private JTextField motivotxt;
    private JButton doctoresbtn;
    private JButton horariosbtn;
    private JButton generarbtn;
    
    private JComboBox<String> especialidadcmbx;
    private JComboBox<String> doctorcmbx;
    private JComboBox<String> fechacmbx;
    private JComboBox<String> horacmbx;
    private String codigodoctorselected;
    public static String codigo;

    public ApartadoDeUsuario() {
        // Configurar el JFrame
        this.setTitle("Pacientes");
        setSize(400, 500);
        this.setResizable(false);
        // this.setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear los paneles que actuarán como pestañas
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);

        JPanel panel2 = new JPanel();
        panel1.setLayout(null);

        JPanel panel3 = new JPanel();
        panel1.setLayout(null);
        
//Boton Regresar

        regresarbtn = new JButton("<<");
        regresarbtn.setBounds(30, 50, 50, 30); //Ajuste de posición
        regresarbtn.setBackground(new Color(214, 50, 50)); // Ajuste de color de boton, con color en RGB
        regresarbtn.addActionListener(this); // Agregamos un ActionListener al botón
        this.add(regresarbtn);
        
        
        
        

//
//
//
//♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦
//
//
//
//
// ♣ ♣ C o  n t e n i d o   P A N E L   1  ♣ ♣
        JLabel motivocitalbl = new JLabel("Motivo de la cita");
        motivocitalbl.setFont(new Font("sans-serif", Font.BOLD, 20)); // Establece el tipo de letra y el tamaño
        motivocitalbl.setBounds(200, 10, 200, 30); //pos x, pos y, ancho, alto
        panel1.add(motivocitalbl);
        setTitle("Formulario");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Campo de texto para el nombre de usuario
        motivotxt = new JTextField("");
        motivotxt.setBounds(45, 75, 500, 80);
        motivotxt.addFocusListener(this);
        panel1.add(motivotxt);

        JLabel especialidadlbl = new JLabel("Especialidad:");
        especialidadlbl.setFont(new Font("Kristen ITC", Font.BOLD, 14)); // Establece el tipo de letra y el tamaño
        especialidadlbl.setBounds(50, 200, 150, 25);
        panel1.add(especialidadlbl);

        especialidadcmbx = new JComboBox<>();
        // Agregar opciones predefinidas al JComboBox
        especialidadcmbx.setBounds(160, 200, 125, 25);
        especialidadcmbx.addItem("Ginecologia");
        especialidadcmbx.addItem("Pediatria");
        especialidadcmbx.addItem("Oncologia");
        especialidadcmbx.addItem("Gediatria");
        especialidadcmbx.addItem("Dermatologia");
        especialidadcmbx.addActionListener(this);

        panel1.add(especialidadcmbx);

        JLabel doctorlbl = new JLabel("Doctor:");
        doctorlbl.setFont(new Font("Kristen ITC", Font.BOLD, 14)); // Establece el tipo de letra y el tamaño
        doctorlbl.setBounds(50, 250, 150, 25);
        panel1.add(doctorlbl);

        doctorcmbx = new JComboBox<>();
        // Agregar opciones predefinidas al JComboBox

        doctorcmbx.setBounds(160, 250, 125, 25);

        panel1.add(doctorcmbx);

        JLabel horariotxt = new JLabel("Horario de citas dispobibles:");
        horariotxt.setFont(new Font("Kristen ITC", Font.BOLD, 14)); // Establece el tipo de letra y el tamaño
        horariotxt.setBounds(30, 300, 275, 25);
        panel1.add(horariotxt);

        JLabel fechatxt = new JLabel("Fecha:");
        fechatxt.setFont(new Font("Kristen ITC", Font.BOLD, 14)); // Establece el tipo de letra y el tamaño
        fechatxt.setBounds(45, 350, 275, 25);
        panel1.add(fechatxt);

        fechacmbx = new JComboBox<>();
        // Agregar opciones predefinidas al JComboBox
        fechacmbx.setBounds(110, 350, 125, 25);
        fechacmbx.addItem("15 marzo");
        fechacmbx.addItem("20 feberero");
        fechacmbx.addItem("3 abril");
        //
        panel1.add(fechacmbx);

        JLabel horatxt = new JLabel("Hora:");
        horatxt.setFont(new Font("Kristen ITC", Font.BOLD, 14)); // Establece el tipo de letra y el tamaño
        horatxt.setBounds(275, 350, 275, 25);
        panel1.add(horatxt);

        horacmbx = new JComboBox<>();
        // Agregar opciones predefinidas al JComboBox
        horacmbx.setBounds(350, 350, 125, 25);
        horacmbx.addItem("2 AM");
        horacmbx.addItem("3 Pm");
        horacmbx.addItem("6 AM");
        //
        panel1.add(horacmbx);

        // Botón de Registro
        generarbtn = new JButton("Generar Cita");
        generarbtn.setBounds(500, 350, 150, 25); //Ajuste de posición
        generarbtn.setBackground(new Color(214, 225, 50)); // Ajuste de color de boton, con color en RGB
        generarbtn.addActionListener(this); // Agregamos un ActionListener al botón
        panel1.add(generarbtn);

        // Botón de DOCTORES
        doctoresbtn = new JButton("Mostrar doctores");
        doctoresbtn.setBounds(350, 200, 150, 25); //Ajuste de posición
        doctoresbtn.setBackground(new Color(214, 225, 50)); // Ajuste de color de boton, con color en RGB
        doctoresbtn.addActionListener(this); // Agregamos un ActionListener al botón
        panel1.add(doctoresbtn);

        // Botón de Horarios
        horariosbtn = new JButton("Mostrar Horarios");
        horariosbtn.setBounds(350, 250, 150, 25); //Ajuste de posición
        horariosbtn.setBackground(new Color(214, 225, 50)); // Ajuste de color de boton, con color en RGB
        horariosbtn.addActionListener(this); // Agregamos un ActionListener al botón
        panel1.add(horariosbtn);

//
//
//
//♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦
// C O N T E N I D O   P A N E L   2
//
//
//
        JLabel historiallbl = new JLabel("Historial de citas:");
        historiallbl.setFont(new Font("sans-serif", Font.BOLD, 20)); // Establece el tipo de letra y el tamaño
        historiallbl.setBounds(70, 10, 200, 30); //pos x, pos y, ancho, alto
        panel2.add(historiallbl, BorderLayout.CENTER);

        // Crear el panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        // Definir las columnas de la tabla
        String[] columnas = {"No.", "Fecha", "Hora", "Estado"};

        // Crear el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Generar el ID automáticamente y agregar los datos al modelo de la tabla
  
        int id = 1;
        for (String[] cita : BaseDatos.citas) {
            if (cita[3].equals(Login.namepaciente)) { // Comprobamos si el nombre del paciente es "Mica"
                String[] citaConID = new String[cita.length + 1];
                citaConID[0] = String.valueOf(id++);
                System.arraycopy(cita, 0, citaConID, 1, cita.length);
                modelo.addRow(citaConID);
            }
        }
        // Crear la tabla con el modelo
        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);

        // Agregar la tabla al panel
        panel2.add(scrollPane, BorderLayout.CENTER);

        // Crear el JTabbedPane y agregar los paneles como pestañas
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Solicitar Cita", panel1);
        tabbedPane.addTab("Ver estado Cita", panel2);
        tabbedPane.addTab("Farmacia", panel3);

        // Agregar el JTabbedPane al JFrame
        getContentPane().add(tabbedPane, BorderLayout.CENTER);

        // Hacer visible el JFrame
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == especialidadcmbx) {

           especselected = (String) especialidadcmbx.getSelectedItem();

            // Limpiar el JComboBox de doctores antes de agregar nuevos elementos
            doctorcmbx.removeAllItems();

// Filtrar la lista de usuarios por el ID de paciente que contiene "2"
            for (Usuario usuario : BaseDatos.Pacienteslst) {
                // Verificar si el ID de paciente del usuario contiene "2"
                if (usuario.getEspecialidad().contains(especselected)) {
                    // Agregar el nombre del usuario al JComboBox de doctores
                    doctorcmbx.addItem(usuario.getNombre());
                    codigorelacionado = (String) usuario.getCodigo();

                }
                // Salida de depuración: Imprimir información sobre cada usuario
                System.out.println("Nombre: " + usuario.getNombre() + ", ID Paciente: " + usuario.getIdpaciente());
            }

// Salida de depuración: Imprimir la cantidad de elementos en el JComboBox de doctores
            System.out.println("Total de elementos en el JComboBox: " + doctorcmbx.getItemCount());

        } else if (e.getSource() == generarbtn) {
            //obtener lodatos de los textos y combobox

            String motivo = motivotxt.getText();
            String fecha = (String) fechacmbx.getSelectedItem();
            String hora = (String) horacmbx.getSelectedItem();
            String estado = "Pendiente";
            String doctor = (String) doctorcmbx.getSelectedItem();

            String[] citagenerada = {fecha, hora, estado, Login.namepaciente, codigorelacionado, motivo, doctor, codigorelacionado};
            BaseDatos.citas.add(citagenerada);

            for (String[] cita : BaseDatos.citas) {
                System.out.println(Arrays.toString(cita));
            }

            JOptionPane.showMessageDialog(this, "Cita generada exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            Login primerventana = new Login();

        } else if (e.getSource() == doctoresbtn) {

          //Mostrar tabla que contiene los doctores
          
                     especselected = (String) especialidadcmbx.getSelectedItem();
           // Crear el modelo de la tabla
        String[] columnas = {"Nombre", "Apellido", "Edad", "Especialidad", "Número"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

         for (Usuario doctor : BaseDatos.Pacienteslst) {
            if (doctor.getEspecialidad().equals(especselected)) { // Filtrar por especialidad "Pediatría"
                Object[] fila = {
                    doctor.getNombre(),
                    doctor.getApellido(),
                    doctor.getEdad(),
                    doctor.getEspecialidad(),
                    doctor.getNum_tel()
                };
                modelo.addRow(fila);
            }
        }
        
        
     
        
             // Crear la tabla con el modelo
                JTable tabla = new JTable(modelo);
                
                // Crear un panel para contener la tabla y agregarle un JScrollPane
                JPanel panel = new JPanel(new BorderLayout());
                panel.add(new JScrollPane(tabla), BorderLayout.CENTER);
                
                // Mostrar la tabla en un JOptionPane
                JOptionPane.showMessageDialog(null, panel, "Tabla de Pacientes", JOptionPane.PLAIN_MESSAGE);
   


        }
        else if (e.getSource() == regresarbtn) {
            
            this.dispose();
             Login ventantaprincipal = new Login();
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
    }

}
