package Controller;

public class Validaciones {

// -------------------     VALIDACIONES MENU     --------------------\\




// -------------------     VALIDACIONES USUARIO     --------------------\\

//1.2.1. El RUN no puede repetirse : Este metodo no se puede implementar ya que no existe BD contra la cual validar. Sin embargo se deja enunciado apuntando a teorico metodo ValidaExistenciaRUT()
    public static boolean ValidaRutUnico (String Rut){
       boolean resultado = true;
       //resultado = ValidaExistenciaRut(Rut);
        return resultado;
    }

//1.2.2. Debe validar formato y dígito verificador del RUN
/* Metodo tomado de stackoverflow https://es.stackoverflow.com/questions/118104/validacion-de-rut-en-java  Este metodo recibe el rut y el digito originalmente como string en forma separada como dos enteros, realiza la formula de validacion y devuelve el resultado boleano */
    public static Boolean ValidarRut(final int rutSinVerificador, final int digitoVerificador) {
        int rut = rutSinVerificador; //rut sin dígito verificador.
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
    public static boolean ValidaGenero (Character Genero){
        boolean resultado;
        resultado = Genero == 'M' || Genero == 'F';
        return resultado;
    }

// 1.3.Eliminar usuario, debe validar que exista : Para Validar si Models.Usuario existe se reutiliza metodo ValidaRutUnico()  si este metodo retorna true, el usuario existe y se puede eliminar


// -------------------     VALIDACIONES LIBRO     --------------------\\

//2.2.1. El ISBN debe ser único
    public static boolean ValidaExistenciaISBN (Integer ISBN){
    boolean resultado = true;
    //resultado = ValidaExistenciaISBN(ISBN);
    return resultado;
    }

//2.2.2. Cantidad en biblioteca debe ser mayor a cero
    public static boolean ValidaStockTotalLibro (Integer ISBN){
    boolean resultado = true;
    Integer StockTotalLibro = 0;
    //StockTotalLibro = StockTotalLibro(ISBN);

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

//2.3.Eliminar Models.Libro a través de ISBN, debe validar que exista: Para Validar si Models.Usuario existe se reutiliza metodo ValidaExistenciaISBN()  si este metodo retorna true, el ISBN existe y se puede eliminar




// -------------------     VALIDACIONES PRESTAMO Y DEVOLUCION      --------------------\\

// PRESTAMO
//3.1.1. Debe ingresar ISBN del Models.Libro a prestar : Se valida en el main()
//3.1.2. El libro debe existir: Se reutiliza el metodo ValidaExistenciaISBN() si este metodo retorna true, el ISBN existe y se puede prestar o devolver
//3.1.3. El libro debe tener al menos un ejemplar disponible: Se reutiliza el metodo StockDisponibleLibro() que retorna la cantidad disponible
//3.1.4. Debe ingresar RUN usuario quien solicitó el libro: Se valida en el main()
//3.1.5. El RUN debe existir: se reutiliza el metodo ValidaRutUnico() si este metodo retorna true, el usuario existe y se puede prestar o devolver libro

//3.1.6. El usuario debe estar habilitado para préstamo.
    public static boolean ValidaPrestamoUsuario (String Rut){
    boolean resultado = true;
    //resultado = ValidaPrestamoUsuario(Rut);
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
