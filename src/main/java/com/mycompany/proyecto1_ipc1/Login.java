/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_ipc1;

/*import proyecto1.Bdatos;*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Natalia Ixmatul
 */
public class Login extends JFrame implements ActionListener, FocusListener {

    public static String namepaciente;
    public static String codigoobtenido;
    
    
    
    
    // Variables privadas como textos y botones
    private JTextField usuariotxt;
    private JPasswordField contratxt;
    private JButton btnlogin;
    private JButton registrarmebtn;
    private JCheckBox checkbox1;

    public Login() {
        
        //Agregamos un titulo
        JLabel titleLabel = new JLabel("Welcome");
        titleLabel.setFont(new Font("sans-serif", Font.BOLD, 20)); // Establece el tipo de letra y el tamaño
        titleLabel.setBounds(200, 10, 200, 30); //pos x, pos y, ancho, alto
        this.add(titleLabel);
        setTitle("Formulario");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Etiqueta de texto para el nombre de usuario
        JLabel usernameLabel = new JLabel("Codigo:");
        usernameLabel.setFont(new Font("sans-serif", Font.BOLD, 12)); // Establece el tipo de letra y el tamaño
        usernameLabel.setBounds(70, 140, 80, 25);
        this.add(usernameLabel);

        // Campo de texto para el nombre de usuario
        usuariotxt = new JTextField("codigo");
        usuariotxt.setBounds(130, 140, 260, 25); //pos x, pos y, ancho, alto
        usuariotxt.addFocusListener(this);
        this.add(usuariotxt);

        JLabel contralbl = new JLabel("contraseña:");
        contralbl.setFont(new Font("sans-serif", Font.BOLD, 12)); // Establece el tipo de letra y el tamaño
        contralbl.setBounds(70, 180, 80, 25);
        this.add(contralbl);

        // Campo de texto para la contrasña
        contratxt = new JPasswordField("Contraseña");
        contratxt.setEchoChar((char) 0);
        contratxt.setBounds(150, 180, 230, 25);
        contratxt.addFocusListener(this);
        this.add(contratxt);

        // Botón de inicio de sesión
        btnlogin = new JButton("Iniciar Sesión");
        btnlogin.setBounds(275, 260, 150, 25); //Ajuste de posición
        btnlogin.setForeground(Color.WHITE); // Ajuste de color de letra
        btnlogin.setBackground(new Color(75, 193, 31)); // Ajuste de color de boton, con color en RGB
        btnlogin.addActionListener(this); // Agregamos un ActionListener al botón
        this.add(btnlogin);

        // Botón de Registro
        registrarmebtn = new JButton("Registrarse");
        registrarmebtn.setBounds(75, 260, 150, 25); //Ajuste de posición
        registrarmebtn.setBackground(new Color(214, 225, 50)); // Ajuste de color de boton, con color en RGB
        registrarmebtn.addActionListener(this); // Agregamos un ActionListener al botón
        this.add(registrarmebtn);

        JPanel panel = new JPanel();

        add(panel);
        setVisible(true);
    }

    //Estos som mis metodos abstractos uwu
    //Fin de mi clase   
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnlogin) {
            // Acciones a realizar cuando se presiona el botón de inicio de sesión
            System.out.println("Se ha presionado el botón de inicio de sesión");

            // B O T O N   L O G I N 
            String Codigoingresado = usuariotxt.getText();
            char[] password = contratxt.getPassword();
            String contraseñaingresada = new String(password);

            //     V A L I D A C I O N 
            // Iterar sobre los elementos del ArrayList para encontrar una coincidencia con el nombre y apellido ingresados
            for (Usuario usuario : BaseDatos.Pacienteslst) {
                if (usuario.getCodigo().equals(Codigoingresado) && usuario.getContra().equals(contraseñaingresada)) {
                    // Si se encuentra una coincidencia, permitir el inicio de sesión
                    // Verificar el tipo de usuario basado en el idusuario

                    // Obtener el idusuario del usuario actual
                    String idUsuario = usuario.getIdpaciente();
                    namepaciente = usuario.getNombre();
                    codigoobtenido = usuario.getCodigo();
                    
                        
                    // Realizar acciones basadas en el idusuario
                    if (idUsuario.equals("1")) {
                        System.out.println("Bienvenido Paciente");
                        
                          ApartadoDeUsuario AreaUsuario = new ApartadoDeUsuario();
                        this.dispose();
                        // Realizar acciones específicas para los pacientes
                    } else if (idUsuario.equals("2")) {
                        System.out.println("Bienvenido Doctor");
                        
                        
                        
                          ApartadoDeDoctor areadoctor = new ApartadoDeDoctor();
                        this.dispose();
                        // Realizar acciones específicas para los doctores
                    }

                    System.out.println("Inicio de sesión exitoso");
                    return; // Salir del método actionPerformed
                }
            }

            // Si no se encuentra una coincidencia de nombre y apellido, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Codigo o conraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (e.getSource() == registrarmebtn) {
            // Acciones a realizar cuando se presiona el botón de registro
            System.out.println("Se ha presionado el botón de registro");
            RegistroDelPaciente registropaciente = new RegistroDelPaciente();
            this.dispose();

        }

    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
    }
}
