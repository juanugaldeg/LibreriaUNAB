package Model;

public class Vehiculo {

    private String patente;
    private String condicion;

    //Constructor
    public Vehiculo(String patente, String condicion) {
        this.patente = patente;
        this.condicion = condicion;
    }
 public Vehiculo(){};


//Getter and Setter
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }


}
