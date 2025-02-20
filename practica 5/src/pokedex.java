import java.util.Map;

public class pokedex  implements pokedexint {
    private Map<String, String> debilidad;

    public pokedex(Map<String, String> debilidad) {
        this.debilidad = debilidad;
    }

    public String obtenerDebilidad(String tipo) {
        return debilidad.getOrDefault(tipo, "Desconocida");
    }

    public pokemon comparar(pokemon p1, pokemon p2) {
        String debilidadP1 = obtenerDebilidad(p1.getTipo());
        return debilidadP1.equals(p2.getTipo()) ? p1 : p2;
    }
}
