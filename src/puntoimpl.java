/**
 * Programa que muestre cordenadas de un punto X e Y.
 * La x, es un num entero, consultable y modificable
 * La y, es un num entero, consultable y modificable
 * Representación como cadena: (x,y)
 */

public class puntoimpl implements punto{
    //1ª las variables o atributos
    private Integer x;
    private Integer y;

    //2ª constructor
    public puntoimpl(Integer x1, Integer y1) {
        x=x1;
        y=y1;
    }

    //3ª getters y setters
    //x, consultable
    public Integer getX(){
        return x;
    }
    //x, modificable
    public void setX(Integer x1){
        x = x1; //this.x = x
    }
    //y, consultable
    public Integer getY(){
        return y;
    }
    //y, modificable
    public void setY(Integer y1){
        y = y1;
    }

    //4ª otros metodos


    //5ª toString //modifica la representacion cuando imprimamos por pantalla
    public String toString(){

        return "("+getX()+","+getY()+")";
    }

}
