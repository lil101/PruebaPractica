/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ConneccionVehiculo;
import modelo.Vehiculo;
import vistas.VentanaVehiculo;

/**
 *
 * @author USUARIO
 */
public class OyenteGuardarVehiculo implements ActionListener{
    VentanaVehiculo ve;
    Vehiculo v;
   ConneccionVehiculo cv;
    
      public OyenteGuardarVehiculo(VentanaVehiculo ve) {
        this.ve = ve;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
         v=ve.guardarVehiculo();
         cv.guardarvehiculoBD(v);
         JOptionPane.showMessageDialog(null, "Datos registrados");
         ve.limpiarCamposVehiculo();
    }
     
}
