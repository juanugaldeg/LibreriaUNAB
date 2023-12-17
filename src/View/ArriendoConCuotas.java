package View;
import Model.ArriendoCuota;
import Model.Cliente;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ArriendoConCuotas extends JFrame{

    public ArriendoConCuotas(Cliente cliente){
    JLabel lblclientes = new JLabel("CLIENTES");
    getContentPane().add(lblclientes, BorderLayout.PAGE_START);

    JComboBox cxclientes = new JComboBox();
    getContentPane().add(cxclientes, BorderLayout.CENTER);
    cxclientes.addItem(cliente.getNombre() + " " + cliente.getCedula() );


    JComboBox cxvehiculos = new JComboBox();
    getContentPane().add(cxvehiculos, BorderLayout.AFTER_LAST_LINE);
    }


}
