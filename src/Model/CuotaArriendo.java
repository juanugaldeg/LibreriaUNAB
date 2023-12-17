package Model;

public class CuotaArriendo {
    private Integer numCuota;
    private Integer valorCuota;
    private boolean pagada;

//Constructor
public CuotaArriendo(Integer numCuota, Integer valorCuota, boolean pagada) {
    this.numCuota = numCuota;
    this.valorCuota = valorCuota;
    this.pagada = pagada;
}

public CuotaArriendo(){};

//Getter and Setter

    public Integer getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(Integer numCuota) {
        this.numCuota = numCuota;
    }

    public Integer getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(Integer valorCuota) {
        this.valorCuota = valorCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

}
