package Model;

public class Arriendo {

    private Integer numArriendo;
    private String fecArr;
    private Integer diasArriendo;

    //Constructor
    public Arriendo(Integer numArriendo, String fecArr, Integer diasArriendo) {
        this.numArriendo = numArriendo;
        this.fecArr = fecArr;
        this.diasArriendo = diasArriendo;
    }

    public Arriendo(){};


    //Getter And Setter

    public Integer getNumArriendo() {
        return numArriendo;
    }

    public void setNumArriendo(Integer numArriendo) {
        this.numArriendo = numArriendo;
    }

    public String getFecArr() {
        return fecArr;
    }

    public void setFecArr(String fecArr) {
        this.fecArr = fecArr;
    }

    public Integer getDiasArriendo() {
        return diasArriendo;
    }

    public void setDiasArriendo(Integer diasArriendo) {
        this.diasArriendo = diasArriendo;
    }




}




