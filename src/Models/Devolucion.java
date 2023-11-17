package Models;

public class Devolucion {

    private Integer IDPrestamo;
    private Integer ISBN;
    private String RUT;

    //Constructor
    public Devolucion(Integer IDPrestamo, Integer ISBN, String RUT) {
        this.IDPrestamo = IDPrestamo;
        this.ISBN = ISBN;
        this.RUT = RUT;
    }

    //Getter and Setter
    public Integer getIDPrestamo() {
        return IDPrestamo;
    }

    public void setIDPrestamo(Integer IDPrestamo) {
        this.IDPrestamo = IDPrestamo;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }


}
