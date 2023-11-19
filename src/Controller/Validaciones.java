package Controller;
import Models.Libro;
import Models.Usuario;
import java.util.ArrayList;

public class Validaciones {

// -------------------     VALIDACIONES USUARIO     --------------------\\

//1.2.1. El RUN no puede repetirse
    public static boolean ValidaRutUnico (ArrayList<Usuario> usuarios, String RUT){
       boolean resultado = true;
        for (Usuario usuario : usuarios)
            if (usuario.getRUT().equals(RUT)) {
                resultado = false;
                break;
            }
        return resultado;
    }

//1.2.2. Debe validar formato y dígito verificador del RUN
/* Se Modifico metodo tomado de stackoverflow https://es.stackoverflow.com/questions/118104/validacion-de-rut-en-java */
    public static Boolean ValidarRut(String RUT) {
        String[] rutSplit = RUT.split("-");
        String rutNumeros = rutSplit[0];
        int rut = Integer.parseInt(rutNumeros.substring(0, rutNumeros.length() - 1));
        int digitoVerificador = Integer.parseInt(rutNumeros.substring(rutNumeros.length() - 1));
        int contador = 2;
        int acumulador = 0;
        while (rut != 0) {
            int multiplo = (rut % 10) * contador;
            acumulador = acumulador + multiplo;
            rut = rut / 10;
            contador++;
            if (contador == 8) {
                contador = 2;
            }
        }
        int digitoCorrecto = acumulador % 10;
        return digitoCorrecto == digitoVerificador;
    }

//1.2.3. Debe validar que el género del usuario sea M o F.
    public static boolean ValidaGenero (String genero){
        boolean resultado;
        resultado = genero.equals("M") || genero.equals("F");
        return resultado;
    }

// 1.3.Eliminar usuario, debe validar que exista : Para Validar si Models.Usuario existe se reutiliza metodo ValidaRutUnico()  si este metodo retorna true, el usuario existe y se puede eliminar


// -------------------     VALIDACIONES LIBRO     --------------------\\

//2.2.1. El ISBN debe ser único
    public static boolean ValidaExistenciaISBN (ArrayList<Libro> libros, Integer ISBN){
    boolean resultado = true;
        for (Libro libro : libros)
            if (libro.getISBN().equals(ISBN)) {
                resultado = false;
                break;
            }
        return resultado;
    }

/* 2.2.2. Cantidad en biblioteca debe ser mayor a cero : No existe la clase Biblioteca, no se puede realizar esta validacion
    Se deja enunciada la funcion, solo se valida que el ingreso de usuario sea > 0 */
    public static boolean ValidaStockTotalLibro (Integer ISBN){
    boolean resultado = true;
    Integer StockTotalLibro = 0;
    // desarollo de la validacion

    if (StockTotalLibro <= 0){
       resultado = false;
        }
    return resultado;
    }

//2.2.3. Cantidad disponible debe ser mayor a cero y menor o igual a cantidad en biblioteca.
    public static Integer StockDisponibleLibro (Integer ISBN){
    Integer StockDisponibleLibro = 0;
    //StockDisponibleLibro = StockDisponibleLibro(ISBN);
    return StockDisponibleLibro;
    }

//2.3.Eliminar Libro a través de ISBN, debe validar que exista: Para Validar si Models.Usuario existe se reutiliza metodo ValidaExistenciaISBN()  si este metodo retorna true, el ISBN existe y se puede eliminar




// -------------------     VALIDACIONES PRESTAMO Y DEVOLUCION      --------------------\\

// PRESTAMO
//3.1.1. Debe ingresar ISBN del Libro a prestar : Se valida en el main()
//3.1.2. El libro debe existir: Se reutiliza el metodo ValidaExistenciaISBN() si este metodo retorna true, el ISBN existe y se puede prestar o devolver
//3.1.3. El libro debe tener al menos un ejemplar disponible: Se reutiliza el metodo StockDisponibleLibro() que retorna la cantidad disponible
//3.1.4. Debe ingresar RUN usuario quien solicitó el libro: Se valida en el main()
//3.1.5. El RUN debe existir: se reutiliza el metodo ValidaRutUnico() si este metodo retorna true, el usuario existe y se puede prestar o devolver libro

//3.1.6. El usuario debe estar habilitado para préstamo.
    public static boolean ValidaPrestamoUsuario (ArrayList<Usuario> usuarios,  String RUT){
    boolean resultado = true;
        for (Usuario usuario : usuarios)
            if (usuario.getRUT().equals(RUT) &&  usuario.getPrestamo() == 0) {
                resultado = false;
                break;
            }
    return resultado;
    }

//DEVOLUCION
//3.2.1. Debe ingresar ISBN del libro a devolver: Se valida en el main()
//3.2.2. Debe validar que el libro exista: Se reutiliza el metodo ValidaExistenciaISBN() si este metodo retorna true, el ISBN existe y se puede prestar o devolver
//3.2.3. Debe ingresar el RUN del usuario. Se valida en el main()
//3.2.4. Debe validar que el usuario exista: e reutiliza el metodo ValidaRutUnico() si este metodo retorna true, el usuario existe y se puede prestar o devolver libro

//3.2.5. Debe validar que tanto el ISBN del libro a devolver como el atributo préstamo del usuario sean el mismo.

    public static boolean ValidaISBNPrestamo ( Integer ISBN){
        boolean resultado = true;
        //resultado = ValidaISBNPrestamo(ISBN);
        return resultado;
    }

}
