public class Poblacionimpl implements Poblacionint {
    private String nombre;
    private int numhabitantes;
    private double superficie;
    private int perstrabajando;
    private int numpersempleadas;
    private Festividadint festividades;

    public Poblacionimpl(String nombre, int numhabitantes, double superficie, int perstrabajando, int numpersempleadas, Festividadint festividades) {
        this.nombre = nombre;
        this.numhabitantes = numhabitantes;
        this.superficie = superficie;
        this.perstrabajando = perstrabajando;
        this.numpersempleadas = numpersempleadas;
        this.festividades = festividades;
    }

    public String getnombre() {
        return nombre;
    }
    public int getnumhabitantes() {
        return numhabitantes;
    }
    public void setnumhabitantes(int numhabitantes) {
        this.numhabitantes = numhabitantes;
    }
    public double getsuperficie() {
        return superficie;
    }
    public int getperstrabajando() {
        return perstrabajando;
    }
    public void setperstrabajando(int perstrabajando) {
        this.perstrabajando = perstrabajando;
    }
    public int getnumpersempleadas() {
        return numpersempleadas;
    }
    public void setnumpersempleadas(int numpersempleadas) {
        this.numpersempleadas = numpersempleadas;
    }
    public Festividadint getfestividades() {
        return festividades;
    }
    public void setfestividades(Festividadint festividades) {
        this.festividades = festividades;
    }

    public double getPorcentajeDesempleo() {
        if (numhabitantes == 0) return 0;
        int desempleados = numhabitantes - numpersempleadas;
        return ((double) desempleados / numhabitantes) * 100;
    }
    public double getDensidadPoblacion() {
        if (superficie == 0) return 0;
        return numhabitantes / superficie;
    }
    public String toString() {
        return nombre + " posee una densidad de población de " + String.format("%.2f", getDensidadPoblacion()) + " hab/km2. " +
                "Una de sus fiestas más famosas es " + festividades.toString();
    }


}
