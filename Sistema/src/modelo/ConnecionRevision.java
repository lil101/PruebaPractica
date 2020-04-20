/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author USUARIO
 */
public class ConnecionRevision {
       public static Vehiculo buscarVehiculo(String Placa) {
        //meter este método a la base de datos
        Vehiculo v = new Vehiculo();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/sistemavehicular", "root", "admin");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from vehiculo where Placa ='" + Placa + "'");

            while (necesario.next()) {

                String pla = necesario.getString("Placa");
                String col = necesario.getString("Color");
                String mar = necesario.getString("Marca");
                String mol = necesario.getString("Modelo");
                

                v.setPlaca(pla);
                v.setColor(col);
                v.setMarca(mar);
                v.setModelo(mol);
                
            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return v;
    }
       public static void guardarvehiculoBD(Vehiculo vehiculo) {
        //metemos este metodo dentro de la base de datos 
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //ingresamos la direccion donde se encuntra la base de datos 
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/sistemavehicular", "root", "admin");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into revision values("
                    + "'" + vehiculo.getPlaca()
                    + "','" + vehiculo.getColor()
                    + "','" + vehiculo.getMarca()
                    + "','" + vehiculo.getModelo()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
    }
    
}
