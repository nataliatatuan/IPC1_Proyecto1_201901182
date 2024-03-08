/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_ipc1;
/**
 *
 * @author Natalia Ixmatul
 */

import java.util.ArrayList;

//Base de datos debe herenciar a la clase Usuario 
public class BaseDatos extends Usuario {
   
    //Datos para doctor
    public BaseDatos(String Especialidad, String num_tel, String nombre, String apellido, String edad, String idpaciente, String genero, String contra, String codigo) {
        super(Especialidad, num_tel, nombre, apellido, edad, idpaciente, genero, contra, codigo);
    }

    
    
//herenciar en mi array datos

//tipo de String 
  static ArrayList<Usuario> Pacienteslst = new ArrayList<>();
  static ArrayList<String[]> citas = new ArrayList<>();
  
  
    public static void agregarcita(String[] cita) {
        //Ingresar al arraylist
        citas.add(cita);
    }
    
    
  
  
  //valores iniciales
  

    public static void agregarpaciente(Usuario paciente) {
        //Esto es lo que se ingresa en el arraylist
        Pacienteslst.add(paciente);
    }

 
  
     
}
