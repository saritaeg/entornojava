import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ataque latigoCepa = new ataque("Látigo Cepa", 10);
        ataque placaje = new ataque("Placaje", 5);

        // Crear Pokémon
        pokemon bulbasaur = new pokemon(1, "Bulbasaur", "Este Pokémon nace con una semilla en el lomo, que brota con el paso del tiempo.",
                0.7, 6.9, Genero.AMBOS, "Planta/Veneno", latigoCepa);

        pokemon squirtle = new pokemon(7, "Squirtle", "Cuando retrae su largo cuello en el caparazón, dispara agua a una presión increíble.",
                0.5, 9.0, Genero.AMBOS, "Agua", placaje);

        // Mostrar información del Pokémon
        System.out.println(bulbasaur);
        System.out.println();
        System.out.println(squirtle);

        // Definir mapa de debilidades
        Map<String, String> debilidades = Map.of(
                "Planta/Veneno", "Fuego",
                "Agua", "Eléctrico"
        );

        // Crear pokédex con debilidades
        pokedex pokedex = new pokedex(debilidades);

        // Comparar Pokémon según debilidad
        pokemon debil = pokedex.comparar(bulbasaur, squirtle);
        System.out.println("\nEl Pokémon más débil es: " + debil.getNombre());
    }

}