public class pokemon implements pokemonint {
    private int numero;
    private String nombre;
    private String descripcion;
    private double altura;
    private double peso;
    private Genero genero;
    private String tipo;
    private ataqueint ataque;

    public pokemon(int numero, String nombre, String descripcion, double altura, double peso, Genero genero, String tipo, ataqueint ataque) {
        this.numero = numero;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.tipo = tipo;
        this.ataque = ataque;
    }

    public int getNumero() { return numero; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public Genero getGenero() { return genero; }
    public void setGenero(Genero genero) { this.genero = genero; }
    public String getTipo() { return tipo; }
    public ataqueint getAtaque() { return ataque; }

    @Override
    public String toString() {
        return String.format("Nº %04d - %s - %s\nAltura: %.1fm\nPeso: %.1f kg\nSexo: %s\nTipo: %s\nAtaque: %s",
                numero, nombre, descripcion, altura, peso, genero, tipo, ataque);
    }
}

