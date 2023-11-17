package Models;

public class Libro {

    private Integer ISBN;
    private String Titulo;
    private String Autor;
    private Integer CantidadEnBiblioteca;
    private Integer CantidadDisponible;

    //Constructor
    public Libro(Integer ISBN, String titulo, String autor, Integer cantidadEnBiblioteca, Integer cantidadDisponible) {
        this.ISBN = ISBN;
        Titulo = titulo;
        Autor = autor;
        CantidadEnBiblioteca = cantidadEnBiblioteca;
        CantidadDisponible = cantidadDisponible;
    }

    public Libro(){

    }

    //Getter and Setter
    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public Integer getCantidadEnBiblioteca() {
        return CantidadEnBiblioteca;
    }

    public void setCantidadEnBiblioteca(Integer cantidadEnBiblioteca) {
        CantidadEnBiblioteca = cantidadEnBiblioteca;
    }

    public Integer getCantidadDisponible() {
        return CantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        CantidadDisponible = cantidadDisponible;
    }


}
