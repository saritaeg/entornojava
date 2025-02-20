public class Festividad implements Festividadint{
    private String nombrefiesta;
    private String mes;

    public Festividad(String nombrefiesta, String mes) {
        this.nombrefiesta = nombrefiesta;
        this.mes = mes;
    }

    //consultables
    public String getnombrefiesta() {
        return nombrefiesta;
    }
    public String getmes() {
        return mes;
    }
    //modificables
    public void setmes(String mes){
        this.mes = mes;
    }

    public String toString() {
        return nombrefiesta + ", en " + mes + ".";
    }


}
