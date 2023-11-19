package Models;

public class Usuario {

    private String NombreCompleto;
    private String RUT;
    private String Genero;
    private String Carrera;
    private Integer Prestamo;


//Constructor

    public Usuario(String nombreCompleto, String RUT, String genero, String carrera, int prestamo) {
        NombreCompleto = nombreCompleto;
        this.RUT = RUT;
        Genero = genero;
        Carrera = carrera;
        Prestamo = prestamo;
    }

    public Usuario(){

    }
    // Getter and Setter
    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public Integer getPrestamo() {
        return Prestamo;
    }

    public void setPrestamo(Integer prestamo) {
        Prestamo = prestamo;
    }

}
