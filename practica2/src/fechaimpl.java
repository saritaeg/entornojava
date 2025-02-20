public class fechaimpl {
    private int dia;
    private int mes;
    private int anio;


    public fechaimpl(int dia,int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public int getdia() {
        return dia;
    }
    public int getmes() {
        return mes;
    }
    public int getanio() {
        return anio;
    }

    public void setdia(int dia1){
        dia = dia1;
    }
    public void setmes(int mes1){
        mes = mes1;
    }
    public void setanio(int anio1){
        anio = anio1;
    }


    //5. tostring
    public String tostring() {
        return getdia() + "/" + getmes() + "/" + getanio();
    }

}
