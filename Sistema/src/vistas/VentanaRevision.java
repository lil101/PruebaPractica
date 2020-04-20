/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.OyenteGuardarVehiculo;
import controlador.OyenteVerificarVehiculo;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.Vehiculo;

/**
 *
 * @author USUARIO
 */
public class VentanaRevision extends JFrame {

    JTextField txtfPlaca = new JTextField(20);
    JTextField txtfColor = new JTextField(20);
    JTextField txtfMarca = new JTextField(20);
    JTextField txtfModelo = new JTextField(20);
    JTextField txtFecha = new JTextField(20);
    JTextField txtDescripcion = new JTextField(20);
    JTextArea txtArea = new JTextArea();

    JPanel panel = new JPanel();
    JButton bGuardar = new JButton("GUARDAR");
    JButton bVerificar = new JButton("VERIFICAR");
    JButton bSalir = new JButton("SALIR");
    Vehiculo v = new Vehiculo();
    VentanaVehiculo ve = new VentanaVehiculo();

    public VentanaRevision() {

        super("DATOS REVISION");
        setSize(650, 650);
        setLocation(100, 100);
        setResizable(true);
        dispose();
        setVisible(true);
        getHoraActual();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentes();

    }

    public void addComponentes() {
        getContentPane().add(panel);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();

        a.anchor = GridBagConstraints.WEST;
        a.insets = new Insets(5, 10, 5, 10);

        a.gridx = 0;
        a.gridy = 0;
        panel.add(txtfPlaca, a);
        panel.add(new JLabel("Placa:"), a);

        a.gridx = 1;
        panel.add(txtfPlaca, a);

        a.gridx = 2;
        panel.add(bVerificar, a);
        bVerificar.addActionListener(new OyenteVerificarVehiculo(this));

        a.gridx = 3;
        panel.add(bSalir, a);
        bSalir.addActionListener(new OyenteSalir());//damos la accion al boton

        a.gridx = 4;
        panel.add(bGuardar, a);
//        bGuardar.addActionListener(new OyenteGuardarVehiculo(this));//damos la accion al boton

        a.gridx = 0;
        a.gridy = 1;
        panel.add(txtfColor, a);
        panel.add(new JLabel("Color:"), a);
        a.gridx = 1;
        panel.add(txtfColor, a);

        a.gridx = 0;
        a.gridy = 2;
        panel.add(txtfMarca, a);
        panel.add(new JLabel("Marca:"), a);
        a.gridx = 1;
        panel.add(txtfMarca, a);

        a.gridx = 0;
        a.gridy = 3;
        panel.add(txtfModelo, a);
        panel.add(new JLabel("Modelo:"), a);
        a.gridx = 1;
        panel.add(txtfModelo, a);

        a.gridx = 0;
        a.gridy = 4;
        panel.add(txtFecha, a);
        panel.add(new JLabel("Fecha:"), a);
        a.gridx = 1;
        panel.add(txtFecha, a);

        a.gridx = 0;
        a.gridy = 5;
        panel.add(txtArea, a);
        panel.add(new JLabel("Descripcion:"), a);
        a.gridx = 1;
        panel.add(txtArea, a);
    }

    public void getHoraActual() {
        Date ahora = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        txtFecha.setText(hourdateFormat.format(ahora));

    }

    public String verificarVehiculo() {
        return txtfPlaca.getText();
    }

    public void cargarCampos(Vehiculo vehiculo) {

        txtfPlaca.setText(vehiculo.getPlaca());
        txtfColor.setText(vehiculo.getColor());
        txtfMarca.setText(vehiculo.getMarca());
        txtfModelo.setText(vehiculo.getModelo());

    }

    public void fechaHora() {
        Date date = new Date();
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        txtFecha.setText(hourFormat.format(date));
    }

    public class OyenteSalir implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            if (e.getSource() == bSalir) {
                dispose();
            }
        }
    }

    public static void main(String[] args) {
        new VentanaRevision();
    }
}
