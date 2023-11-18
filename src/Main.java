import Controller.Validaciones;
import Models.Devolucion;
import Models.Libro;
import Models.Prestamo;
import Models.Usuario;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Menu Bienvenida
        System.out.println("*** Bienvenido al Sistema ***");
        System.out.println("");
        System.out.println("1. Crear Usuario");
        System.out.println("2. Editar Usuario (funcionalidad no Disponible)");
        System.out.println("3. Crear Libro" );
        System.out.println("4. Editar Libro (funcionalidad no Disponible)" );
        System.out.println("5. Prestar Libro" );
        System.out.println("6. Devolver Libro" );

        //Lectura Ingreso
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su Opcion:");
        Integer Opcion = input.nextInt();


        // 1. Crear Usuario
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        String respuesta = null;
        do {
            Usuario usuario = CrearUsuario(usuarios);
            usuarios.add(usuario);
            System.out.println("Desea agregar otro usuario s/n?");
            respuesta =  input.next();
        }while (!Objects.equals(respuesta, "n"));


        // 3. Crear Libro
        String respuesta2 = null;
        ArrayList<Libro> libros = new ArrayList<Libro>();
        do {
            Libro libro = CrearLibro(libros);
            libros.add(libro);
            System.out.println("Desea agregar otro Libro s/n?");
            respuesta2 =  input.next();
        }while (!Objects.equals(respuesta2, "n"));

        //5. Prestar Libro
        String respuesta3 = null;
        do {
            ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
            Prestamo prestamo = IngresarPrestamo();
            prestamos.add(prestamo);
            System.out.println("Desea agregar otro Prestamo s/n?");
            respuesta3 =  input.next();
        }while (!Objects.equals(respuesta3, "n"));


     /*   //6. Devolver Libro
        String respuesta4 = null;
        do {
            ArrayList<Devolucion> devoluciones = new ArrayList<Devolucion>();
            Devolucion devolucion = IngresarDevolucion();
            devoluciones.add(devolucion);
            System.out.println("Desea agregar otra Devolucion s/n?");
            respuesta3 =  input.next();
        }while (!Objects.equals(respuesta3, "n"));*/




        System.out.println("FIN DEL PROGRAMA");


    }

   /* private static Devolucion IngresarDevolucion() {
        Scanner input = new Scanner(System.in);
        Devolucion devolucion = new Devolucion();
        System.out.println("Ingrese IDPrestamo:");
        devolucion.setIDPrestamo(input.nextInt());
        System.out.println("Ingrese ISBN:");
        devolucion.setISBN(input.nextInt());
        System.out.println("Ingrese RUT:");
        devolucion.setRUT(input.next());
        return devolucion;
    }*/

    private static Prestamo IngresarPrestamo() {
        Scanner input = new Scanner(System.in);
        Prestamo prestamo = new Prestamo();
        prestamo.setIDPrestamo(100);   //Este valor se reemplazara por el correlativo del prestamo

        System.out.println("Ingrese ISBN que desea prestar:");

        prestamo.setISBN(input.nextInt());
        System.out.println("Ingrese RUT:");
        prestamo.setRUT(input.next());
        System.out.println("Ingrese Fecha Prestamo:");
        prestamo.setFechaPrestamo(input.next());
        System.out.println("Ingrese Dias Prestamo:");
        prestamo.setDiasPrestamo(input.nextInt());
        System.out.println("Ingrese Fecha Devolucion");
        prestamo.setFechaDevolucion(input.next());
        prestamo.setDatosTarjeta("Aca va un string con los datos para la impresion");
        return prestamo;

    }

                                                                                      
    private static Libro CrearLibro(ArrayList<Libro> libros) {
        Scanner input = new Scanner(System.in);
        Libro libro = new Libro();

        System.out.println("Ingrese ISBN:");
        Integer ISBN = input.nextInt();
        if (Validaciones.ValidaExistenciaISBN(libros,ISBN)){
            libro.setISBN(ISBN);
        }else System.out.println("ISBN ya existe");

        System.out.println("Ingrese Titulo:");
        libro.setTitulo(input.next());

        System.out.println("Ingrese Autor:");
        libro.setAutor(input.next());

        System.out.println("Ingrese CantidadEnBiblioteca:");
        int CantidadInicial = input.nextInt();
        if (CantidadInicial > 0){
            libro.setCantidadEnBiblioteca(CantidadInicial);
            //Se inicializa cantidad disponible con el valor de cantidad inicial
            libro.setCantidadDisponible(CantidadInicial);
        }else System.out.println("Cantidad Ingresada debe ser > 0");

        return libro;
    }


    private static Usuario CrearUsuario(ArrayList<Usuario> usuarios) {
        Scanner input = new Scanner(System.in);
        Usuario usuario = new Usuario();

       System.out.println("Ingrese RUT:");
        String RUT = input.next();
        if (Validaciones.ValidarRut(RUT)){
            if (Validaciones.ValidaRutUnico(usuarios,RUT)){
                usuario.setRUT(RUT);
            } else System.out.println("El RUT Ingresado ya existe");
        }else System.out.println("El RUT Tiene un formato incorrecto");

        System.out.println("Ingrese Nombre Completo:");
        usuario.setNombreCompleto(input.next());

        System.out.println("Ingrese Genero:");
        Character genero =  input.next().charAt(0);
        if(Validaciones.ValidaGenero(genero)){
            usuario.setGenero(genero);
        }else System.out.println("Genero debe ser M o F");

        System.out.println("Ingrese Carrera:");
        usuario.setCarrera(input.next());

        //Inicializacion prestamo usuario nuevo en 0
        usuario.setPrestamo(0);
        return usuario;
    }





}