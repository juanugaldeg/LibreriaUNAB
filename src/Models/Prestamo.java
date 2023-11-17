package Models;

import java.util.Date;
public class Prestamo {

    private Integer IDPrestamo;
    private Integer ISBN;
    private String RUT;
    private Date   FechaPrestamo;
    private Integer DiasPrestamo;
    private Date FechaDevolucion;
    private String DatosTarjeta;

    //Constructor
    public Prestamo(Integer IDPrestamo, Integer ISBN, String RUT, Date fechaPrestamo, Integer diasPrestamo, Date fechaDevolucion, String datosTarjeta) {
        this.IDPrestamo = IDPrestamo;
        this.ISBN = ISBN;
        this.RUT = RUT;
        FechaPrestamo = fechaPrestamo;
        DiasPrestamo = diasPrestamo;
        FechaDevolucion = fechaDevolucion;
        DatosTarjeta = datosTarjeta;
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

    public Date getFechaPrestamo() {
        return FechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        FechaPrestamo = fechaPrestamo;
    }

    public Integer getDiasPrestamo() {
        return DiasPrestamo;
    }

    public void setDiasPrestamo(Integer diasPrestamo) {
        DiasPrestamo = diasPrestamo;
    }

    public Date getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        FechaDevolucion = fechaDevolucion;
    }

    public String getDatosTarjeta() {
        return DatosTarjeta;
    }

    public void setDatosTarjeta(String datosTarjeta) {
        DatosTarjeta = datosTarjeta;
    }



}
