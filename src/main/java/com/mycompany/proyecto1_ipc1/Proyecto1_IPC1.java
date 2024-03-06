/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto1_ipc1;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @Natalia Ixmatul
 */
public class Proyecto1_IPC1 extends Usuario {

    //Este es el main
    public static void main(String[] args) {

        //valore iniciales de la matriz pacienteslst
        BaseDatos.Pacienteslst.add(new Usuario("Juan", "Pérez", "25", "1", "Masculino", "contraseña1", "codigo1", "", ""));
        BaseDatos.Pacienteslst.add(new Usuario("Maria", "González", "30", "1", "Femenino", "contraseña2", "codigo2", "", ""));
        BaseDatos.Pacienteslst.add(new Usuario("Esteban", "López", "40", "1", "Masculino", "contraseña3", "codigo3", "", ""));
        BaseDatos.Pacienteslst.add(new Usuario("Ana", "Martínez", "35", "2", "Femenino", "contraseña4", "codigo4", "Ginecologia", "123455"));

        // Agregar un doctor
        BaseDatos.Pacienteslst.add(new Usuario("Mica", "Pérez", "40", "2", "Masculino", "contraseña5", "codigo5", "Ginecologia", "123456"));

        BaseDatos.Pacienteslst.add(new Usuario("Martina", "González", "35", "2", "Femenino", "contraseña6", "codigo6", "Pediatria", "123457"));
        BaseDatos.Pacienteslst.add(new Usuario("Carlos", "López", "50", "2", "Masculino", "contraseña7", "codigo7", "Oncologia", "123458"));
        BaseDatos.Pacienteslst.add(new Usuario("Juanita", "Martínez", "45", "2", "Femenino", "contraseña8", "codigo8", "Gediatria", "123459"));
        BaseDatos.Pacienteslst.add(new Usuario("Pedro", "Sánchez", "55", "2", "Masculino", "contraseña9", "codigo9", "Dermatologia", "1234560"));

        //Valores iniciales de citas
        String[] nuevaCita1 = {"2024-03-02", " 10:30", "Pendiente", "Juan", "codigo5", "porquesi", "Juan", "codigo5"};
        String[] nuevaCita2 = {"2024-04-02 ", "10:30", "Aprobada", "Carlos", "codigo7", "porquesi", "Esteban", "codigo7"};
        String[] nuevaCita3 = {"2024-05-02", " 10:30", "Rechazada", "Juanita", "codigo8", "porquesi", "Maria", "codigo8"};
        String[] nuevaCita4 = {"2024-06-02 ", "10:30", "Pendiente", "Ana", "codigo9", "porquesi", "Pedro", "codigo9"};
        String[] nuevaCita5 = {"2024-06-02 ", "10:30", "Pendiente", "Luis", "codigo9", "porquesi", "Pedro", "codigo9"};
        String[] nuevaCita6 = {"2024-06-02 ", "10:30", "Pendiente", "Mario", "codigo9", "porquesi", "Pedro", "codigo9"};
        String[] nuevaCita7 = {"2024-06-02 ", "10:30", "Pendiente", "Heraldo", "codigo9", "porquesi", "Pedro", "codigo9"};

        // Agregar la cita al ArrayList
        BaseDatos.citas.add(nuevaCita1);
        BaseDatos.citas.add(nuevaCita2);
        BaseDatos.citas.add(nuevaCita3);
        BaseDatos.citas.add(nuevaCita4);
        BaseDatos.citas.add(nuevaCita5);
        BaseDatos.citas.add(nuevaCita6);
        BaseDatos.citas.add(nuevaCita7);

        // Verificar que se haya agregado correctamente imprimiendo el contenido del ArrayList
        for (String[] cita : BaseDatos.citas) {
            System.out.println(Arrays.toString(cita));
        }

        Login ventantaprincipal = new Login();

    }

    public Proyecto1_IPC1 (String nombre, String apellido, String edad, String idpaciente, String genero, String contra, String codigo, String Especialidad, String num_tel) {
        super(nombre, apellido, edad, idpaciente, genero, contra, codigo, Especialidad, num_tel);
    }

}
