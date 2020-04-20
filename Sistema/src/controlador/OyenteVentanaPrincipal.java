/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.VentanaPrincipal;
import vistas.VentanaRevision;
import vistas.VentanaVehiculo;

/**
 *
 * @author USUARIO
 */
public class OyenteVentanaPrincipal implements ActionListener {

    VentanaPrincipal vtnpcl;

    public OyenteVentanaPrincipal(VentanaPrincipal vtnpcl) {
        this.vtnpcl = vtnpcl;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        if (e.getSource() == vtnpcl.getVe()) {
            new VentanaVehiculo();
        }
        if (e.getSource() == vtnpcl.getVr()) {
            new VentanaRevision();
        }
        if (e.getSource() == vtnpcl.getSalir()) {
            System.exit(0);
        }
    }
}
