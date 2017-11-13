/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import javax.swing.*;
import java.awt.*;
//PASO 14 - IMPORTAR LA CLASE CONEXION
import bd.ConexionBD;
import java.sql.Connection;
import java.awt.event.*;
        

/**
 *
 * @author LAB08
 */
public class Interfaz extends JFrame 
{
 JPanel panel;
 JLabel label;
 JTextField text;
 JButton boton;
 JButton boton2;
 
 //PASO 15 - Creaciòn de un objeto tipo ConexionBD
 ConexionBD con;
 
   public Interfaz()
         
 {
   panel = new JPanel();
   label = new JLabel();
   text = new JTextField(20);
    boton = new JButton();
    boton2 = new JButton();
    
    
    this.add(panel);
    panel.add(label);
    panel.add(text);
    panel.add(boton);
    panel.add(boton2);
    
    label.setText("Atributo");
    boton.setText("Conectar");
    boton2.setText("Desconectar");
    panel.setBackground(Color.MAGENTA);
    
    //PASO 16 - AGREGAMOS ESCUCHADORES AL BOTON
    boton.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent evt)
        {
            con = new ConexionBD();
            Connection reg = con.conectar();
        }
    });
     boton2.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent evt)
        {
            con.desconectar();
        }
    });
    
   

 }         
 
}
