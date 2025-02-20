
public class punto3dimpl{
    private Double x;
    private Double y;
    private Double z;

    public punto3dimpl(Double x, Double y,Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        if (x == null || y == null || z == null) {
            throw new IllegalArgumentException("Las coordenadas no pueden ser null");
        }

    }

    public Double getX(){
        return x;
    }
    public void setX(Double x1){x = x1;if (x == null)
        throw new IllegalArgumentException("La coordenada X no puede ser null");}
    public Double getY(){return y;}
    public void setY(Double y1){y = y1;if (x == null)
        throw new IllegalArgumentException("La coordenada Y no puede ser null");}
    public Double getZ(){return z;}
    public void setZ(Double z1){ z = z1;if (x == null)
        throw new IllegalArgumentException("La coordenada Z no puede ser null");}




    public String tostring(){
        return "("+getX()+","+getY()+","+getZ()+")";
    }
}
