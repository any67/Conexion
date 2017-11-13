/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;
//paso 10 - Importamos un paquete,necesario para conexion con MySQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author LAB08
 */
public class ConexionBD 
{
 //Paso 11 - DECLARANDO OBJETOS PARA LA CONEXION   
 private static Connection conex;
 private static final String DRIVER = "com.mysql.jdbc.Driver";
  private static final String USER = "root";
   private static final String PASS = "";
    private static final String URL = "jdbc:mysql://localhost:330/conexion";
    
    //PASO 12 - CONSTRUCTOR DE LA CLASE
    public ConexionBD()
    {
        conex = null;//inicializar la variable
        //Metodo para manejar excepciones
        try
        {
         Class.forName(DRIVER);
         conex =DriverManager.getConnection(URL, USER, PASS);
         
            if (conex != null) 
            {
             System.out.println("Conexio Establecida");
            }
        }
        catch(ClassNotFoundException | SQLException event)
         {
          System.out.println("Error en la Conexion");
         }
    }
    
    //PASO 13 - DEFINICION METODO PARA CONECTAR Y DESCONECTAR
    public Connection conectar()
    {
        return conex;//Retorna el objeto conex
    }
    public void desconectar()
    {
        conex=null;
        if (conex==null)
        {
           System.out.println("Conexion Finalizada");
        }
    }
}
