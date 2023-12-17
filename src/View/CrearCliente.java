package View;
import Model.ArriendoCuota;
import Model.Cliente;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearCliente extends JFrame {

    Cliente cliente = new Cliente();

    public CrearCliente(){
        JTextField tfNombre = new JTextField();
        getContentPane().add(tfNombre,"North");
        String nombrecliente = "juan";//tfNombre.getText();   <-------------- no logro pasarle a la variable nombrecliente el contenido del textfield

        JTextField tfRun = new JTextField();
        getContentPane().add(tfRun,"Center");
        String runcliente = tfRun.getText();

        JButton btnAgregar = new JButton("Agregar");
        getContentPane().add(btnAgregar,"South");
        btnAgregar.addActionListener(new btnAgregarlis(nombrecliente, runcliente));
    }

    class btnAgregarlis implements ActionListener{
        String nombrecliente;
        String runcliente;

        public btnAgregarlis(String nombrecliente, String runcliente){
            this.nombrecliente = nombrecliente;
            this.runcliente = runcliente;
        }

        public void actionPerformed(ActionEvent e) {
            cliente.setNombre(nombrecliente);
            cliente.setCedula(runcliente);
            cliente.setVigente(true);
            PantallaArriendo(cliente);
        }
    }


    public static ArriendoCuota PantallaArriendo (Cliente cliente){
        ArriendoCuota arriendo2 = new ArriendoCuota();
        ArriendoCuota arriendo = new ArriendoCuota();
        JFrame arriendoconcuotas = new ArriendoConCuotas(cliente);
        arriendoconcuotas.setSize(500,500);
        arriendoconcuotas.setVisible(true);
        return  arriendo2;
    }
}
