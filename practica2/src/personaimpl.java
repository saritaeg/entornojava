public class personaimpl {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;

    public personaimpl(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public String getnombre() {
        return nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public int getedad() {
        return edad;
    }

    public String getdni() {
        return dni;
    }
    public void setnombre(String nombre1 ){
        nombre = nombre1;
    }
    public void setapellido(String apellido1){
        apellido = apellido1;
    }
    public void setedad(int edad1){
        edad = edad1;
    }
    public void setdni(String dni1){
        dni = dni1;
    }

    //5. tostring
    public String tostring() {
        return getnombre() + ", " + getdni() + "," + getedad() + "años";
    }

}
