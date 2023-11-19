import static Controller.Funcionalidades.*;
import Models.Devolucion;
import Models.Libro;
import Models.Prestamo;
import Models.Usuario;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Arreglos para almacenar datos:
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ArrayList<Libro> libros = new ArrayList<Libro>();
        ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
        ArrayList<Devolucion> devoluciones = new ArrayList<Devolucion>();

        // Menu Bienvenida
        System.out.println("*** Bienvenido al Sistema ***");
        System.out.println();
        Integer Opcion;
do {
    System.out.println("*** MENU ***");
    System.out.println("1. Crear Usuario");
    System.out.println("2. Editar Usuario (funcionalidad no Disponible)");
    System.out.println("3. Crear Libro");
    System.out.println("4. Editar Libro (funcionalidad no Disponible)");
    System.out.println("5. Prestar Libro");
    System.out.println("6. Devolver Libro");
    System.out.println("0. SALIR DEL SISTEMA");
    System.out.println();

    //Lectura Ingreso
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese su Opcion: ");
    Opcion = input.nextInt();

    switch (Opcion) {

        //1. Crear Usuario
        case 1:
            System.out.println();
            System.out.println("*** Ingreso de un Nuevo Usuario ***");

            String respuesta;
            do {
                Usuario usuario = CrearUsuario(usuarios);
                usuarios.add(usuario);
                System.out.print("Usuario Agregado, ¿Desea agregar otro usuario s/n? ");
                respuesta = input.next();
                System.out.println();
            } while (!Objects.equals(respuesta, "n"));
            break;

        //2. Editar Usuario
        case 2:
            System.out.println("Funcionalidad 2 no implementada por el momento");
            System.out.println();
            break;

        //3. Crear Libro
        case 3:
            System.out.println();
            System.out.println("*** Ingreso de un Nuevo Libro ***");
            do {
                Libro libro = CrearLibro(libros);
                libros.add(libro);
                System.out.print("Libro Agregado, ¿Desea agregar otro Libro s/n? ");
                respuesta = input.next();
                System.out.println();
            } while (!Objects.equals(respuesta, "n"));
            break;

        // 4. Editar Libro
        case 4:
            System.out.println("Funcionalidad 4 no implementada por el momento");
            System.out.println();
            break;

        //5. Prestar Libro
        case 5:
            do {
                Prestamo prestamo = IngresarPrestamo(usuarios,libros,prestamos);
                prestamos.add(prestamo);
                System.out.println("Desea agregar otro Prestamo s/n?");
                respuesta = input.next();
            } while (!Objects.equals(respuesta, "n"));
            break;

        //6. Devolver Libro
        case 6:
            do {
                Devolucion devolucion = IngresarDevolucion();
                devoluciones.add(devolucion);
                System.out.println("Desea agregar otra Devolucion s/n?");
                respuesta = input.next();
            } while (!Objects.equals(respuesta, "n"));
            break;
        default:
            System.out.println();
    }

} while (Opcion!= 0 );
        System.out.println("GRACIAS POR USAR NUESTRO PROGRAMA");
    }

}