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
import modelo.ConnecionRevision;
import modelo.Vehiculo;
import vistas.VentanaRevision;
import vistas.VentanaVehiculo;

/**
 *
 * @author USUARIO
 */
public class OyenteVerificarVehiculo implements ActionListener {

    Vehiculo v;
    VentanaRevision vr;
    ConnecionRevision cbd;
    ConneccionVehiculo cv;
    VentanaVehiculo ve;

    public OyenteVerificarVehiculo(VentanaRevision vr) {
        this.vr = vr;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        v = cbd.buscarVehiculo(vr.verificarVehiculo());
        vr.cargarCampos(v);
        if (v.getPlaca() == null) {
            JOptionPane.showMessageDialog(null, "Vehiculo no registrado");
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "Vehiculo Registrado ", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            vr.cargarCampos(v);

        }
    }
}
