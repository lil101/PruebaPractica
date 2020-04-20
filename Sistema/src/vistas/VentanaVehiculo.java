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
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.Vehiculo;

/**
 *
 * @author USUARIO
 */
public class VentanaVehiculo extends JFrame {
     JTextField txtfPlaca = new JTextField(20);
    JTextField txtfColor = new JTextField(20);
    JTextField txtfMarca = new JTextField(20);
    JTextField txtfModelo = new JTextField(20);
    JPanel panel = new JPanel();
     JButton bGuardar = new JButton("GUARDAR");
     JButton bSalir = new JButton("SALIR");
      JButton bVerificar = new JButton("VERIFICAR");
     Vehiculo v=new Vehiculo();
     
     public VentanaVehiculo(){

         super("DATOS VEHICULO");
        setSize(650, 650);
        setLocation(100, 100);
        setResizable(true);
        dispose();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentes();
}
     public void addComponentes(){
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
        panel.add(bGuardar, a);
        bGuardar.addActionListener(new OyenteGuardarVehiculo(this));//damos la accion al boton
        
        a.gridx = 3;
        panel.add(bSalir, a);
        bSalir.addActionListener(new OyenteSalir());//damos la accion al boton
//        a.gridx=4;
//        panel.add(bVerificar, a);
// bVerificar.addActionListener(new OyenteVerificarVehiculo(this));
        
        

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
     }
       public Vehiculo guardarVehiculo() {
           v=new Vehiculo();
           v.setPlaca(txtfPlaca.getText());
           v.setColor(txtfColor.getText());
           v.setMarca(txtfMarca.getText());
           v.setModelo(txtfModelo.getText());

        return v;
    }
           public void limpiarCamposVehiculo() {
        txtfPlaca.setText("");
        txtfColor.setText("");
        txtfMarca.setText("");
        txtfModelo.setText("");
    }

    public void cargarCampos(Vehiculo v) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
       new VentanaVehiculo();
    }
}

