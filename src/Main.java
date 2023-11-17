import Models.Usuario;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Menu Bienvenida
        /*  System.out.println("*** Bienvenido al Sistema ***");
        System.out.println("");
        System.out.println("1. Crear Usuario");
        System.out.println("2. Editar Usuario (funcionalidad no Disponible)");
        System.out.println("3. Crear Libro" );
        System.out.println("4. Editar Libro (funcionalidad no Disponible)" );
        System.out.println("5. Prestar Libro" );
        System.out.println("6. Devolver Libro" );*/

        //Lectura Ingreso
        Scanner input = new Scanner(System.in);

        /*System.out.println("Ingrese su Opcion:");
        Integer Opcion = input.nextInt(); */

        // 1. Crear Usuario

            Usuario Usuario = new Usuario();
            System.out.println("Ingrese Nombre Completo:");
            Usuario.setNombreCompleto(input.next());
            System.out.println("Ingrese RUT:");
            Usuario.setRUT(input.next());
            System.out.println("Ingrese Genero:");
            Usuario.setGenero(input.next());
            System.out.println("Ingrese Carrera:");
            Usuario.setCarrera(input.next());
            System.out.println("Ingrese Prestamo:");
            Usuario.setPrestamo(input.nextInt());

            List<Usuario> Usuarios = new Usuario();




        /*for (Models.Usuario usuario : Usuario) {
            System.out.println(usuario.getNombreCompleto());
        }*/

        System.out.println("FIN DEL PROGRAMA");

    }
}