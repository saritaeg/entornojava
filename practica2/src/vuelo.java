
public interface vuelo {
    public String getcodvuelo();
    public String getdestino();
    public Double getprecio();
    public Integer getnumplazas();
    public Integer getnumpasajeros();
    public Fecha getfechasalida();
    public Persona getpiloto();
    public void setprecio(Double precio1);
    public void setpiloto(Persona piloto1);
    public void setNumpasajeros(Integer numpasajeros1);


}
