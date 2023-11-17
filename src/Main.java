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
        String respuesta = null;
        do {
            ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
            Usuario usuario = CrearUsuario();
            usuarios.add(usuario);
            System.out.println("Desea agregar otro usuario s/n?");
            respuesta =  input.next();
        }while (!Objects.equals(respuesta, "n"));


        // 3. Crear Libro
        String respuesta2 = null;
        do {
            ArrayList<Libro> libros = new ArrayList<Libro>();
            Libro libro = CrearLibro();
            libros.add(libro);
            System.out.println("Desea agregar otro Libro s/n?");
            respuesta2 =  input.next();
        }while (!Objects.equals(respuesta2, "n"));

     /*   //5. Prestar Libro
        String respuesta3 = null;
        do {
            ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
            Prestamo prestamo = IngresarPrestamo();
            prestamos.add(prestamo);
            System.out.println("Desea agregar otro Prestamo s/n?");
            respuesta3 =  input.next();
        }while (!Objects.equals(respuesta3, "n"));
*/

        //6. Devolver Libro


        System.out.println("FIN DEL PROGRAMA");


    }

   /* private static Libro IngresarPrestamo() {
    }*/

    private static Libro CrearLibro() {
        Scanner input = new Scanner(System.in);
        Libro libro = new Libro();
        System.out.println("Ingrese ISBN:");
        libro.setISBN(input.nextInt());
        System.out.println("Ingrese Titulo:");
        libro.setTitulo(input.next());
        System.out.println("Ingrese Autor:");
        libro.setAutor(input.next());
        System.out.println("Ingrese CantidadEnBiblioteca:");
        libro.setCantidadEnBiblioteca(input.nextInt());
        System.out.println("Ingrese CantidadDisponible");
        libro.setCantidadDisponible(input.nextInt());
        return libro;
    }


    private static Usuario CrearUsuario() {
        Scanner input = new Scanner(System.in);
        Usuario usuario = new Usuario();
        System.out.println("Ingrese Nombre Completo:");
        usuario.setNombreCompleto(input.next());
        System.out.println("Ingrese RUT:");
        usuario.setRUT(input.next());
        System.out.println("Ingrese Genero:");
        usuario.setGenero(input.next());
        System.out.println("Ingrese Carrera:");
        usuario.setCarrera(input.next());
        System.out.println("Ingrese Prestamo:");
        usuario.setPrestamo(input.nextInt());
        return usuario;
    }





}