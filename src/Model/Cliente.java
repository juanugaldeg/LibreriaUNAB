package Model;

public class Cliente {

    private String cedula;
    private String nombre;
    private boolean vigente;

//Constructor
    public Cliente(String cedula, String nombre, boolean vigente) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.vigente = vigente;
    }


    public Cliente(){};

//Getter and Setter
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }


}
