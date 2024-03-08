/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_ipc1;
//Libraries

import javax.swing.*;
import java.awt.*;
import java.util.UUID;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Natalia Ixmatul
 */
public class RegistroDelPaciente extends JFrame  implements ActionListener, FocusListener {

    private JTextField nombreField;
    private JTextField edadtxt;
    private JPasswordField contraseñaField;
    private JTextField apellidoField;
    private JButton registroButton;
    private JComboBox<String> cmbx;
    public static String codigo;
 
    
    
    
    public static String generarcodigo(){
    
        
        // Generar un UUID
        UUID uuid = UUID.randomUUID();
        
        // Convertir el UUID en una cadena y obtener solo los primeros 8 caracteres
        codigo = uuid.toString().substring(0, 8);
        
        // Imprimir el código generado
        System.out.println("Código único generado: " + codigo);
        
        return (codigo);
 
    
    }

    
    
    public RegistroDelPaciente() {
        
                
        //label para combobox
        JLabel comboboxlbl = new JLabel("Género");
        comboboxlbl.setFont(new Font("Bahnschrift", Font.BOLD, 14)); // Establece el tipo de letra y el tamaño
        comboboxlbl.setBounds(70, 300, 80, 25);
        this.add(comboboxlbl);
        
          
              
        
            cmbx = new JComboBox<>();
            // Agregar opciones predefinidas al JComboBox
            cmbx.setBounds(170, 300, 100, 25);
            cmbx.setBackground(new Color(202, 225, 255));
            cmbx.addItem("Masculino");
            cmbx.addItem("Femenino");
            cmbx.addItem("Otro");
            //
            this.add(cmbx);
            
        
        
        

        JLabel usernameLabel = new JLabel("Nombre:");
        usernameLabel.setFont(new Font("Bahnschrift", Font.BOLD, 14)); // Establece el tipo de letra y el tamaño
        usernameLabel.setBounds(70, 140, 80, 25);
        
        
        this.add(usernameLabel);
         

        // Campo de texto para el nombre de usuario
        nombreField = new JTextField("nombre");
        nombreField.setBounds(170, 140, 260, 25);
        nombreField.setBackground(new Color(202, 225, 255));
        nombreField.addFocusListener(this);
        this.add(nombreField);

        JLabel passwordLabel = new JLabel("Contraseña");
        passwordLabel.setFont(new Font("Bahnschrift", Font.BOLD, 14)); // Establece el tipo de letra y el tamaño
        passwordLabel.setBounds(70, 180, 100, 25);
        this.add(passwordLabel);

        // Campo de texto para el nombre de usuario
        contraseñaField = new JPasswordField("contraseña");
        contraseñaField.setBounds(170, 180, 260, 25);
        contraseñaField.setBackground(new Color(202, 225, 255));
        contraseñaField.addFocusListener(this);
        this.add(contraseñaField);

        JLabel apellidoLabel = new JLabel("Apellido:");
        apellidoLabel.setFont(new Font("Bahnschrift", Font.BOLD, 14)); // Establece el tipo de letra y el tamaño
        apellidoLabel.setBounds(70, 220, 80, 25);
        this.add(apellidoLabel);
        
        
   

        // Campo de texto para el nombre de usuario 
        apellidoField = new JTextField("apellido");
        apellidoField.setBounds(170, 220, 260, 25);
        apellidoField.setBackground(new Color(202, 225, 255));
        apellidoField.addFocusListener(this);
        this.add(apellidoField);
        
        
              JLabel edadlbl = new JLabel("Edad:");
        edadlbl.setFont(new Font("Bahnschrift", Font.BOLD, 14)); // Establece el tipo de letra y el tamaño
        edadlbl.setBounds(70, 256, 80, 25);
        this.add(edadlbl);
        
                // Campo de texto para el nombre de usuario
        edadtxt = new JTextField("edad");
        edadtxt.setBounds(170, 256, 260, 25);
        edadtxt.setBackground(new Color(202, 225, 255));
        edadtxt.addFocusListener(this);
        this.add(edadtxt);
        
        
        
        
        
        
        
        // Botón de Registro color : 202 225 255
        registroButton = new JButton("Registrarse");
        registroButton.setBounds(75, 350, 150, 25); //Ajuste de posición
        registroButton.setBackground(new Color(188, 143, 143)); // Ajuste de color de boton, con color en RGB
        registroButton.addActionListener(this); // Agregamos un ActionListener al botón
        this.add(registroButton);
        
        
        
        //  E L E M E N T O S   P A N E L   2 
        
        
        


        

        JPanel interfaz = new JPanel();

        add(interfaz);
        setVisible(true);

        
        

        this.setTitle("Registro");
        this.setLocationRelativeTo(null);
        this.setSize(800, 600);
        setLocationRelativeTo(null);
        this.setLayout(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().add(interfaz);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    generarcodigo();
    
 

    //convertir char a String
             
    char[] pass = contraseñaField.getPassword();
    String contraseña = new String (pass);
    
    
    String Nombre = nombreField.getText();
    String Edad = edadtxt.getText();
    String Genero = (String) cmbx.getSelectedItem();
    String Apellido = apellidoField.getText();
    String idpaciente ="1";
 
        
     
        Usuario pacientenew = new Usuario(Nombre, Apellido, Edad, idpaciente, Genero,contraseña,codigo,"","");
        BaseDatos.agregarpaciente(pacientenew);
        
                    for (Usuario paciente : BaseDatos.Pacienteslst) {
           
                        
                        System.out.println("datos ingresados correctamente");
                        
   
    
        }    
            
        
        
                    
    JOptionPane.showMessageDialog(this, "Tú código es: " +codigo, "Información", JOptionPane.INFORMATION_MESSAGE);
    this.dispose();
    Login ventanaLogin = new Login();
        
        //lo que hará el botón
       
        
        
    }

    @Override
    public void focusGained(FocusEvent be) {
    }

    @Override
    public void focusLost(FocusEvent ie) {
    }

}
