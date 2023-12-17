package Model;

public class ArriendoCuota  extends Arriendo{
    private Integer cantCuotas;

    //Constructor
    public ArriendoCuota(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public ArriendoCuota(){};

    //Getter and Setter
    public Integer getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }


}
