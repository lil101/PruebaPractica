/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.OyenteVentanaPrincipal;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author USUARIO
 */
public class VentanaPrincipal {

    JFrame f = new JFrame();

    JMenuBar Menu = new JMenuBar();
   
    JMenu menu1;
    JMenu menu2;

    public JFrame getF() {
        return f;
    }

    public void setF(JFrame f) {
        this.f = f;
    }

    public JMenuBar getMenu() {
        return Menu;
    }

    public void setMenu(JMenuBar Menu) {
        this.Menu = Menu;
    }

    public JMenu getMenu1() {
        return menu1;
    }

    public void setMenu1(JMenu menu1) {
        this.menu1 = menu1;
    }

    public JMenu getMenu2() {
        return menu2;
    }

    public void setMenu2(JMenu menu2) {
        this.menu2 = menu2;
    }

    public JMenuItem getVe() {
        return ve;
    }

    public void setVe(JMenuItem ve) {
        this.ve = ve;
    }

    public JMenuItem getVr() {
        return vr;
    }

    public void setVr(JMenuItem vr) {
        this.vr = vr;
    }

    public JMenuItem getSalir() {
        return Salir;
    }

    public void setSalir(JMenuItem Salir) {
        this.Salir = Salir;
    }

    JMenuItem ve, vr, Salir;

    public VentanaPrincipal() {
        f.setTitle("SISTEMA VEHICULAR");

        f.setSize(750, 500);
        f.setLocation(100, 200);
        f.getContentPane();
        f.setResizable(true);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    public void iniciarComponentes() {

        f.setJMenuBar(Menu);

        menu1 = new JMenu("Menu");
        Menu.add(menu1);

        ve = new JMenuItem("Registro de Vehiculos");
        ve.addActionListener(new OyenteVentanaPrincipal(this));
        menu1.add(ve);

        vr = new JMenuItem("Verificacion de Vehiculos");
        vr.addActionListener(new OyenteVentanaPrincipal(this));
        menu1.add(vr);

        Salir = new JMenuItem("Salir");
        Salir.addActionListener(new OyenteVentanaPrincipal(this));
        menu1.add(Salir);

    }
}
