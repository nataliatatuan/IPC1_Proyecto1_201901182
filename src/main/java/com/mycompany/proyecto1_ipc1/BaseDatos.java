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

//Bd debe herenciar a la clase Usuario para que jale
public class BaseDatos extends Usuario {
   
    //Datos para doctor
    public BaseDatos(String Especialidad, String num_tel, String nombre, String apellido, String edad, String idpaciente, String genero, String contra, String codigo) {
        super(Especialidad, num_tel, nombre, apellido, edad, idpaciente, genero, contra, codigo);
    }

    
    
//Acá puedo herenciar en mi array datos
//que vengan de clases Hijas    
//en este caso la clase padre es Usuario
//la hija sería doctor , esto me deja meter datos de doctor en el tipo usuario

//el tipo de String que es
//Uso matriz para que sea mas facil jalar la posicion del arraylist
  static ArrayList<Usuario> Pacienteslst = new ArrayList<>();
  static ArrayList<String[]> citas = new ArrayList<>();
  
  
    public static void agregarcita(String[] cita) {
        //Esto es lo que se ingresa en el arraylist
        citas.add(cita);
    }
    
    
  
  
  //valores iniciales
  

    public static void agregarpaciente(Usuario paciente) {
        //Esto es lo que se ingresa en el arraylist
        Pacienteslst.add(paciente);
    }
  //acá luego vamos a meter datos

 
  
     
}
