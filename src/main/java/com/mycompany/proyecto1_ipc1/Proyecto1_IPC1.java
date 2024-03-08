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
        BaseDatos.Pacienteslst.add(new Usuario("Diego", "Godinez", "24", "1", "Masculino", "contraseña1", "codigo1", "Cardiología", "12347"));
        BaseDatos.Pacienteslst.add(new Usuario("Carlos", "Lopez", "45", "2", "Masculino", "contraseña2", "codigo2", "Médico General", "12346"));
        BaseDatos.Pacienteslst.add(new Usuario("Roxana", "Hernandez", "5", "3", "Femenino", "contraseña3", "codigo3", "Pediatría", "12345"));
        BaseDatos.Pacienteslst.add(new Usuario("Luisa", "Perez", "50", "4", "Femenino", "contraseña4", "codigo4", "Nefrología", "12348"));

        // Agregar un doctor
        BaseDatos.Pacienteslst.add(new Usuario("Marcela", "González", "56", "3", "Femenino", "contraseña5", "codigo5", "Pediatría", "12345"));

        BaseDatos.Pacienteslst.add(new Usuario("Sebastián", "greenberg", "48", "1", "Masculino", "contraseña6", "codigo6", "Médico General", "12346"));
        BaseDatos.Pacienteslst.add(new Usuario("José", "Martínez", "37", "2", "Masculino", "contraseña7", "codigo7", "Cardiología", "12347"));
        BaseDatos.Pacienteslst.add(new Usuario("Rosaline", "Cob", "56", "3", "Femenino", "contraseña8", "codigo8", "Nefrología", "12348"));
        BaseDatos.Pacienteslst.add(new Usuario("Paola", "Orantes", "59", "2", "Femenino", "contraseña9", "codigo9", "Psquiatría", "123459"));

        //Valores iniciales de citas
        String[] nuevaCita1 = {"2024-03-02", " 10:30", "Pendiente", "Diego", "codigo7", "Angina de pecho", "Carlos", "codigo6"};
        String[] nuevaCita2 = {"2024-04-02 ", "10:30", "Aprobada", "Carlos", "codigo6", "Cefalea", "Roxana", "codigo5"};
        String[] nuevaCita3 = {"2024-05-02", " 10:30", "Rechazada", "Roxana", "codigo5", "Gastralgía", "    Luisa", "codigo8"};
        String[] nuevaCita4 = {"2024-06-02 ", "10:30", "Pendiente", "Luisa", "codigo8", "Hematuria", "Steven", "codigo9"};
        String[] nuevaCita5 = {"2024-06-02 ", "10:30", "Pendiente", "Steven", "codigo9", "Depresión", "Luis", "codigo5"};
        String[] nuevaCita6 = {"2024-06-02 ", "10:30", "Pendiente", "Luis", "codigo5", "Disfagia", "Gina", "codigo8"};
        String[] nuevaCita7 = {"2024-06-02 ", "10:30", "Pendiente", "Gina", "codigo8", "Uralgia", "Diego", "codigo7"};

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
