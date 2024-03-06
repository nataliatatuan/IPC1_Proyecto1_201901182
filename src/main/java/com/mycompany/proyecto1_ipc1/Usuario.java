/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_ipc1;

/**
 *
 * @author Natalia Ixmatul
 */
public class Usuario {

    
  
    //Datos de los usuarios o parámetro
    String nombre;
    String apellido;
    String edad;
    String idpaciente;
    String genero;
    String contra;
    String codigo;
    //datos de doctor
     String Especialidad;
    String num_tel;

    //Constructor de mis variables para los usuarios

    public Usuario(String nombre, String apellido, String edad, String idpaciente, String genero, String contra, String codigo, String Especialidad, String num_tel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.idpaciente = idpaciente;
        this.genero = genero;
        this.contra = contra;
        this.codigo = codigo;
        this.Especialidad = Especialidad;
        this.num_tel = num_tel;
    }

  

//mis getters y setters para que el código pueda acceder a la info
    //necesaria
    Usuario(String string, String rodolfo, String morales, String jrodolfomc2002gmailcom, String masculino) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(String idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }
    
    

}