public class segmentoimpl {
    private punto3dimpl extremo1;
    private punto3dimpl extremo2;
    public segmentoimpl(punto3dimpl extremo1, punto3dimpl extremo2) {
        this.extremo1 = extremo1;
        this.extremo2 = extremo2;
        if (extremo1 == null || extremo2 == null) {
            throw new IllegalArgumentException("Los extremos no pueden ser null");
        }
    }
    public punto3dimpl getextremo1(){
        return extremo1;
    }
    public void setextremo1(punto3dimpl extremo11){extremo1 = extremo11;if (extremo1 == null)
        throw new IllegalArgumentException("La coordenada X no puede ser null");}
    public punto3dimpl getextremo2(){return extremo2;}
    public void setextremo2(punto3dimpl extremo22){extremo2 = extremo22;if (extremo2 == null)
        throw new IllegalArgumentException("La coordenada X no puede ser null");}
    public String tostring(){
        return "["+getextremo1()+","+getextremo2()+"]";
    }


}
