import Model.ArriendoCuota;
import View.ArriendoConCuotas;
import View.CrearCliente;
import Model.Cliente;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {


        PantallaCliente();
    }






    public static void PantallaCliente (){
        Cliente cliente = new Cliente();
        CrearCliente crearcliente = new CrearCliente();
        crearcliente.setSize(300,300);
        crearcliente.setVisible(true);

    }
}