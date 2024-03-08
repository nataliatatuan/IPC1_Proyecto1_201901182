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
        JLabel titleLabel = new JLabel("Bienvenido");
        titleLabel.setFont(new Font("britannic bold", Font.BOLD, 22)); // Establece el tipo de letra y el tamaño
        titleLabel.setBounds(220, 10, 200, 30); //pos x, pos y, ancho, alto
        this.add(titleLabel);
        setTitle("Formulario");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // texto para el nombre de usuario
        JLabel usernameLabel = new JLabel("Código:");
        usernameLabel.setFont(new Font("britannic bold", Font.BOLD, 16)); // Establece el tipo de letra y el tamaño
        usernameLabel.setBounds(80, 140, 80, 25);
        this.add(usernameLabel);

        // texto para el nombre de usuario
        usuariotxt = new JTextField("codigo");
        usuariotxt.setBounds(170, 140, 260, 30); //pos x, pos y, ancho, alto
        usuariotxt.addFocusListener(this);
        this.add(usuariotxt);

        JLabel contralbl = new JLabel("Contraseña:");
        contralbl.setFont(new Font("britannic bold", Font.BOLD, 16)); // Establece el tipo de letra y el tamaño
        contralbl.setBounds(70, 170, 105, 30);
        this.add(contralbl);

        // Campo de texto para la contrasña
        contratxt = new JPasswordField("contraseña");
        contratxt.setEchoChar((char) 0);
        contratxt.setBounds(170, 170, 235, 30);
        contratxt.addFocusListener(this);
        this.add(contratxt);

        // Botón de inicio de sesión
        btnlogin = new JButton("Iniciar Sesión");
        btnlogin.setBounds(285, 270, 160, 30); //Ajuste de posición
        btnlogin.setForeground(Color.WHITE); // Ajuste de color de letra
        btnlogin.setBackground(new Color(188, 143, 143)); // Ajuste de color de boton, con color en RGB
        btnlogin.addActionListener(this); // Agregamos un ActionListener al botón
        this.add(btnlogin);

        // Botón de Registro color: 202 225 255
        registrarmebtn = new JButton("Registro");
        registrarmebtn.setBounds(70, 270, 160, 30); //Ajuste de posición
        registrarmebtn.setBackground(new Color(202, 225, 255)); // Ajuste de color de boton, con color en RGB
        registrarmebtn.addActionListener(this); // se agrego un ActionListener al botón
        
        this.add(registrarmebtn);

        JPanel panel = new JPanel();

        add(panel);
        setVisible(true);
    }

    //metodos abstractos
    //Fin clase   
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
