/**
 * @author Sara Espino
 * @version 1.0
 *
 */






public class vueloimpl {
    //1.variables
    private String codvuelo;
    private String destino;
    private Double precio;
    private Integer numplazas;
    private Integer numpasajeros;
    private Fecha fechasalida;
    private Double recaudacion;
    private Persona piloto;

    //2.constructor

    /**
    * Constructor NO VACIO con parametrod base
    * @param codvuelo
    * @param destino
    * @param precio
    * @param numplazas
    * @param numpasajeros
    * @param fechasalida
    * @param recaudacion
    * @param piloto
    */
    public vueloimpl(String codvuelo,String destino,Double precio,Integer numplazas,Integer numpasajeros,Fecha fechasalida,Double recaudacion,Persona piloto) {
        this.codvuelo = codvuelo;
        this.destino = destino;
        this.precio = precio;
        this.numplazas = numplazas;
        this.numpasajeros = numpasajeros;
        this.fechasalida = fechasalida;
        this.recaudacion = recaudacion;
        this.piloto = piloto;
    }

    //3. getter y setters

    /**
     * Este metodo es un getter comun de codigo del vuelo
     * @return con cadena del codigo del vuelo
     */
    // consultables
    public String getCodvuelo(){
        return codvuelo;
    }
    public String getDestino(){
        return destino;
    }
    public Double getPrecio(){
        return precio;
    }
    public Integer getNumplazas(){
        return numplazas;
    }
    public Integer getNumpasajeros(){
        return numpasajeros;
    }
    public Fecha getFechasalida(){
        return fechasalida;
    }
    public Persona getPiloto(){
        return piloto;
    }

    //modificables

    /**
     * @deprecated este set acabara desapareciendo
     * @param precio1 se le pasa el precio en decimal
     */
    public void setPrecio(Double precio1){
        precio = precio1;
    }
    public void setNumpasajeros(Integer numpasajeros1){
        numpasajeros = numpasajeros1;
    }
    public void setPiloto(Persona piloto1){
        piloto = piloto1;
    }

    //4. otros metodos
    public Double recaudacion(){
        return getPrecio()*getNumpasajeros();
    }
    //5. tostring
    public String tostring(){
        return codvuelo+" "+"("+destino+")"+"-"+" "+piloto+","+ fechasalida;
    }



}
