package Controller;
import Model.*;

import java.util.ArrayList;


public class Funcionalidades {

    //Clientes
    public static Cliente ingresarCliente(){
        Cliente cliente = new Cliente();
        return  cliente;
    }

    public static Cliente seleccionarCliente(){
        Cliente cliente = new Cliente();
        return  cliente;
    }

    //Automoviles
    public static Vehiculo seleccionarVehiculo(){
        Vehiculo vehiculo = new Vehiculo();
        return vehiculo;
    }

    //Arriendo
    public static Arriendo crearArriendo(){
        Arriendo arriendo = new Arriendo();
        return arriendo;
    }
    public static Integer obtenerMontoApagar(){
        Integer montoapagar = 0;
        return  montoapagar;
    }
    public static boolean evaluarArriendo(){
        boolean resultado = false;
        return resultado;
    }

    //ArriendoCuota
    public static ArriendoCuota crearArriendoCuota(){
       ArriendoCuota arriendoCuota = new ArriendoCuota();
       return arriendoCuota;
    }

    public static Integer calculaValorCuota(){
        Integer valorcuota = 0;
        return valorcuota;
    }

    /*
    public static ArrayList<CuotaArriendo> alculaValorCuota(){
        //ArrayList<CuotaArriendo> cuotaArriendoList = new ArrayList<CuotaArriendo>;
        return cuotaArriendoList;
    }

*/
}
