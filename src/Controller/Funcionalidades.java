package Controller;
import Models.Devolucion;
import Models.Libro;
import Models.Prestamo;
import Models.Usuario;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcionalidades {
    //1 Crear nuevo Usuario en el sistema
    public static Usuario CrearUsuario(ArrayList<Usuario> usuarios) {
        Scanner input = new Scanner(System.in);
        Usuario usuario = new Usuario();
        //RUT
        boolean rutvalido = false;
        do{
            System.out.print("Ingrese RUT: ");
            String RUT = input.next();
            if (Validaciones.ValidarRut(RUT)){
                if (Validaciones.ValidaRutUnico(usuarios,RUT)){
                    usuario.setRUT(RUT);
                    rutvalido = true;
                } else System.out.println("El RUT Ingresado ya existe");
            }else System.out.println("El RUT Tiene un formato incorrecto");
        }while (!rutvalido);

        //Nombre Completo
        System.out.print("Ingrese Nombre Completo: ");
        usuario.setNombreCompleto(input.next());

        //Genero
        boolean generovalido = false;
        do{
            System.out.print("Ingrese Genero: ");
            String genero =  input.next();
            if(Validaciones.ValidaGenero(genero)){
                usuario.setGenero(genero);
                generovalido = true;
            }else System.out.println("Genero debe ser M o F");
        }while(!generovalido);

        //Carrera
        System.out.print("Ingrese Carrera: ");
        usuario.setCarrera(input.next());

        //Inicializa "prestamo" usuario nuevo con valor 0
        usuario.setPrestamo(0);
        return usuario;
    }

    //2. Editar Usuario

    //3. Crear nuevo Libro en el sistema
    public static Libro CrearLibro(ArrayList<Libro> libros) {
        Scanner input = new Scanner(System.in);
        Libro libro = new Libro();
        //ISBN
        boolean ISBNvalido = false;
        do{
            System.out.print("Ingrese ISBN: ");
            Integer ISBN = input.nextInt();
            if (Validaciones.ValidaExistenciaISBN(libros,ISBN)){
                libro.setISBN(ISBN);
                ISBNvalido = true;
            }else System.out.println("ISBN ya existe");
        }while(!ISBNvalido);

        //Titulo del Libro
        System.out.print("Ingrese Titulo: ");
        libro.setTitulo(input.next());

        //Autor del Libro
        System.out.print("Ingrese Autor: ");
        libro.setAutor(input.next());

        //Copias que Ingresaron
        System.out.print("Indique cantidad de copias que ingresaran: ");
        int CantidadInicial = input.nextInt();
        if (CantidadInicial > 0){
            libro.setCantidadEnBiblioteca(CantidadInicial);
            //Se inicializa cantidad disponible con el valor de cantidad inicial
            libro.setCantidadDisponible(CantidadInicial);
        }else System.out.println("Cantidad Ingresada debe ser > 0");

        return libro;
    }

    public static Prestamo IngresarPrestamo(ArrayList<Usuario>usuarios, ArrayList<Libro>libros, ArrayList<Prestamo> prestamos) {
        Scanner input = new Scanner(System.in);
        Prestamo prestamo = new Prestamo();

        //
        prestamo.setIDPrestamo(100);   //Este valor se reemplazara por el correlativo del prestamo

        boolean ISBNvalido = false;
        do{
            System.out.print("Ingrese ISBN que desea prestar: ");
            Integer ISBN = input.nextInt();
            if(!Validaciones.ValidaExistenciaISBN(libros,ISBN)){
                prestamo.setISBN(ISBN);
                ISBNvalido = true;
            }else System.out.println("ISBN No existe, no se puede prestar ");
        }while(!ISBNvalido);

        boolean rutvalido = false;
        do{
            System.out.print("Ingrese RUT del usuario: ");
            String RUT = input.next();
            if(!Validaciones.ValidaRutUnico(usuarios,RUT)){
                if(Validaciones.ValidaPrestamoUsuario(usuarios,RUT)){
                    prestamo.setRUT(RUT);
                    rutvalido = true;
                }else System.out.println("El Usuario ya tiene un prestamo vigente");
            }else System.out.println("Este RUT de Usuario no existe en el sistema");
        }while(!rutvalido);

        System.out.println("Ingrese Fecha Prestamo:");
        prestamo.setFechaPrestamo(input.next());
        System.out.println("Ingrese Dias Prestamo:");
        prestamo.setDiasPrestamo(input.nextInt());
        System.out.println("Ingrese Fecha Devolucion");
        prestamo.setFechaDevolucion(input.next());
        prestamo.setDatosTarjeta("Aca va un string con los datos para la impresion");
        return prestamo;
    }

    public static Devolucion IngresarDevolucion() {
        Scanner input = new Scanner(System.in);
        Devolucion devolucion = new Devolucion();
        System.out.println("Ingrese IDPrestamo:");
        devolucion.setIDPrestamo(input.nextInt());
        System.out.println("Ingrese ISBN:");
        devolucion.setISBN(input.nextInt());
        System.out.println("Ingrese RUT:");
        devolucion.setRUT(input.next());
        return devolucion;
    }


}
